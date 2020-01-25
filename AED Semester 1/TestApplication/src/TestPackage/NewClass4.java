/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author harry
 */
public class NewClass4 {

    static List<Integer> duplicates(List<Integer> list1, List<Integer> list2) {
        List<Integer> dupList = new ArrayList<>();

        for (Integer i : list1) {
            for (Integer j : list2) {
                if (i == j) {
                    dupList.add(i);
                }
            }
        }
        System.out.println(dupList);

        /*int temp = 0;
        for (int i = 0; i < dupList.size() - 1; i++) {
            if (dupList.get(i) == dupList.get(i + 1)) {
                dupList.remove(i + 1);
            }
            if (dupList.get(i) < dupList.get(i + 1)) {
                temp = dupList.get(i);
                dupList.set(i, dupList.get(i + 1));
                dupList.set(i + 1, temp);
            }
        }*/

        Collections.sort(dupList, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i < dupList.size() - 1; i++) {
            if (dupList.get(i) == dupList.get(i + 1)) {
                dupList.remove(i + 1);
            }
        }

        return dupList;
    }

}

class newTest extends NewClass4 {

    //NewClass4 obj = new NewClass4();
    public static void main(String args[]) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(10);
        list1.add(7);
        list1.add(1);
        list1.add(5);
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(11);
        list2.add(15);
        list2.add(2);
        list2.add(7);
        list2.add(2);
        System.out.println(list2);

        List<Integer> newList = duplicates(list1, list2);

        System.out.println(newList);
        
        
        String a = new String("Hello");
        String b = "Hello";
        
        if(a==b){
            System.out.print("First");
        }
        else if (a.equals(b)){
            System.out.print("Second");
        }
    }
}
