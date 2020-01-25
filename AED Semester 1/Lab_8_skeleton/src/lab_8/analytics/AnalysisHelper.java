/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import lab_8.entities.Comment;
import lab_8.entities.Post;
import lab_8.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {

    // 1.Find Average number of likes per comment.
    public void avgLikes() {

        Map<Integer, Integer> userLikecount = new HashMap<Integer, Integer>();

        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        double comm = 0;
        double likes = 0;
        for (Post post : posts.values()) {

            for (Comment c : post.getComments()) {

                /* if (userLikecount.containsKey(c.getId())) {
                 likes = userLikecount.get(c.getId());
                 }*/
                likes += c.getLikes();
                //userLikecount.put(c.getId(), likes);
                comm++;
            }
        }
        /* int size = userLikecount.size();
         int likesCount =0;
         for (Object ob : userLikecount.values()) {
         likesCount += Integer.parseInt(ob.toString()) ;
      
         }*/

        System.out.println("Average likes per comment : " + likes / comm);

    }

    /*public void userWithMostLikes() {

     Map<Integer, Integer> userLikecount = new HashMap<Integer, Integer>();

     Map<Integer, User> users = DataStore.getInstance().getUsers();
     for (User user : users.values()) {
     for (Comment c : user.getComments()) {
     int likes = 0;
     if (userLikecount.containsKey(user.getId())) {
     likes = userLikecount.get(user.getId());
     }
     likes += c.getLikes();
     userLikecount.put(user.getId(), likes);
     }
     }

     int max = 0;
     int maxId = 0;

     for (int id : userLikecount.keySet()) {

     if (userLikecount.get(id) > max) {
     max = userLikecount.get(id);
     maxId = id;
     }
     }
     System.out.println("users with most likes:" + max + "\n" + users.get(maxId));

     }*/
    // 2. Post with most liked comments.
    public void getMostLikedComment() {

        Map<Integer, Integer> mostLikecount = new HashMap<Integer, Integer>();

        Map<Integer, Post> posts = DataStore.getInstance().getPosts();

        for (Post post : posts.values()) {
            for (Comment c : post.getComments()) {
                int likes = 0;
                if (mostLikecount.containsKey(post.getPostId())) {
                    likes = mostLikecount.get(post.getPostId());
                }

                likes += c.getLikes();
                mostLikecount.put(post.getPostId(), likes);
            }
        }
        int max = 0;
        int maxId = 0;

        for (int id : mostLikecount.keySet()) {

            if (mostLikecount.get(id) > max) {
                max = mostLikecount.get(id);
                maxId = id;
            }
        }

        System.out.println("Post with most likes : " + maxId + " and number of likes : " + max);
    }

    // 3. Post with most comments.
    public void getMostCommentsPost() {

        Map<Integer, Integer> mostCommentPost = new HashMap<Integer, Integer>();

        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        for (Post post : posts.values()) {

            int comm = 0;
            comm += post.getComments().size();
            mostCommentPost.put(post.getPostId(), comm);
            /*for(Comment c : post.getComments()){
             int likes = 0;
             if(mostLikecount.containsKey(post.getPostId()))
             likes=mostLikecount.get(post.getPostId());
              
             likes += c.getLikes();
             mostLikecount.put(post.getPostId(), likes);*/
        }
        int max = 0;
        int maxId = 0;

        for (int id : mostCommentPost.keySet()) {

            if (mostCommentPost.get(id) > max) {
                max = mostCommentPost.get(id);
                maxId = id;
            }

        }
        System.out.println("Post with most comments : " + maxId + " and number of comments : " + max);

    }

    // 5.Top 5 inactive users based on comments.
    public void getFiveInactiveUserComment() {
        //Map<Integer, Integer> userLikecount = new HashMap<Integer, Integer>();
        //Map<Integer, Comment> comments = DataStore.getInstance().getComments(); 
        Map<Integer, User> users = DataStore.getInstance().getUsers();

        List<User> userList = new ArrayList<>(users.values());

        Collections.sort(userList, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                //to get descending list
                return u1.getComments().size() - u2.getComments().size();

            }
        });

        System.out.println("5 most inactive users by comments: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("User id : " + userList.get(i).getId() + " Number of comments : " + userList.get(i).getComments().size());
        }

    }

    // 4. Top 5 inactive users based on posts.
    public void getFiveInactiveUserPost() {
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        //List<User> userList = new ArrayList<>(users.values());

        Map<Integer, Integer> inactiveUserPost = new HashMap<Integer, Integer>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();

        for (User u : users.values()) {
            int postCount = 0;
            for (Post post : posts.values()) {
                if (post.getUserId() == u.getId()) {
                    postCount++;
                    inactiveUserPost.put(u.getId(), postCount);
                }
            }
        }

        List<Map.Entry<Integer, Integer>> userPostList = new LinkedList<Map.Entry<Integer, Integer>>(inactiveUserPost.entrySet());
        Collections.sort(userPostList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1,
                    Map.Entry<Integer, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : userPostList) {
            temp.put(aa.getKey(), aa.getValue());
        }

        System.out.println("5 most inactive users by posts: ");
        int counter = 1;
        for (Map.Entry<Integer, Integer> en : temp.entrySet()) {
            System.out.println("User Id : " + en.getKey()
                    + ", Post count : " + en.getValue());
            counter++;

            if (counter == 6) {
                break;
            }
        }
        /*for (int i=0; i<5; i++) {
         System.out.println("User Id : " + temp.getKey() + "Post count: " + userPostList.get(i));
         }
         Map<Integer, Post> posts = DataStore.getInstance().getPosts(); 
      
         List<Post> postList = new ArrayList<>(posts.values());
      
         Collections.sort(postList, new Comparator<Post>(){
         @Override
         public int compare(Post p1, Post p2){
         //to get descending list
         return p1.().size() - p2.getComments().size();
        
         }
         });
   
         System.out.println("5 most inactive users by comments: ");
         for(int i =0; i<5;i++){
         System.out.println("User id: " + userList.get(i).getId()+ " with No of comments: " + userList.get(i).getComments().size()  ); 
         }      
      
         }*/

    }

    // 6. Top 5 inactive users overall (comments, posts and likes)
    public void getFiveInactiveUserOverAll() {
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        //List<User> userList = new ArrayList<>(users.values());

        Map<Integer, Integer> inactiveUser = new HashMap<Integer, Integer>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();

        for (User u : users.values()) {
            int postCount = 0;
            for (Post post : posts.values()) {
                if (post.getUserId() == u.getId()) {
                    postCount++;
                    inactiveUser.put(u.getId(), postCount);
                }
            }
        }

        for (User u : users.values()) {
            if (inactiveUser.containsKey(u.getId())) {
                inactiveUser.put(u.getId(), inactiveUser.get(u.getId()) + u.getComments().size());
            }
        }

        List<Map.Entry<Integer, Integer>> inactiveUserList = new LinkedList<Map.Entry<Integer, Integer>>(inactiveUser.entrySet());
        Collections.sort(inactiveUserList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1,
                    Map.Entry<Integer, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : inactiveUserList) {
            temp.put(aa.getKey(), aa.getValue());
        }

        System.out.println("5 most inactive users overall: ");
        int counter = 1;
        for (Map.Entry<Integer, Integer> en : temp.entrySet()) {
            System.out.println("User Id : " + en.getKey()
                    + ", Count of Comment and Post : " + en.getValue());
            counter++;

            if (counter == 6) {
                break;
            }
        }

    }

    // 7. Top 5 Proactive users overall (comments, posts and likes)
    public void getFiveProactiveUserOverAll() {
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        //List<User> userList = new ArrayList<>(users.values());

        Map<Integer, Integer> proactiveUser = new HashMap<Integer, Integer>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();

        for (User u : users.values()) {
            int postCount = 0;
            for (Post post : posts.values()) {
                if (post.getUserId() == u.getId()) {
                    postCount++;
                    proactiveUser.put(u.getId(), postCount);
                }
            }
        }

        for (User u : users.values()) {
            if (proactiveUser.containsKey(u.getId())) {
                proactiveUser.put(u.getId(), proactiveUser.get(u.getId()) + u.getComments().size());
            }
        }

        List<Map.Entry<Integer, Integer>> inactiveUserList = new LinkedList<Map.Entry<Integer, Integer>>(proactiveUser.entrySet());
        Collections.sort(inactiveUserList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1,
                    Map.Entry<Integer, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : inactiveUserList) {
            temp.put(aa.getKey(), aa.getValue());
        }

        System.out.println("5 most Proactive users overall: ");
        int counter = 1;
        for (Map.Entry<Integer, Integer> en : temp.entrySet()) {
            System.out.println("User Id : " + en.getKey()
                    + ", Count of Comment and Post : " + en.getValue());
            counter++;

            if (counter == 6) {
                break;
            }
        }

    }

    /*public void getFiveMostLikedComment() {

     Map<Integer, Comment> comments = DataStore.getInstance().getComments();

     List<Comment> commentList = new ArrayList<>(comments.values());

     Collections.sort(commentList, new Comparator<Comment>() {
     @Override
     public int compare(Comment o1, Comment o2) {
     //to get descending list
     return o2.getLikes() - o1.getLikes();

     }
     });

     System.out.println("5 most liked comments : ");

     }*/
}
