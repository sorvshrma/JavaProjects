/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;

import java.util.ArrayList;

/**
 *
 * @author harry
 */
public class NewClass {
   // static ArrayList<String> rowArray;
    //static int a = 10; 
     //static int b; 
      
    // static block 
    /*static String cllgName;
    static { 
        System.out.println("Static block initialized."); 
        
    }
    static void setCllg(String name){ 
        cllgName = name ; 
    } */
     static int data=30;  
  static class Inner{  
   static void msg(){System.out.println("data is "+data);}  
  } 
    //public static void main (String []args)
  {
        
        NewClass.Inner.msg();
        String value1 = "a";
        String value2 = "b";
        if(value1 == value2)
            System.out.println("value1 == value2");
        //setCllg("a");
        //System.out.println(cllgName);
        //setCllg("b");
        //System.out.println(cllgName);
        String s1 = new String("Test");
        String s2 = new String("Test");
        //String s1="Test",s2="Test";
        
        //s2=s1;
        if (s1==s2)
            System.out.println("Same");
        else
            System.out.println("Different");
        
        /*
        int[] i = new int[5];
        for(int x=4; x>=0; x--){
            i[x] = x;
            System.out.println(i[x] + " ");
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.ensureCapacity(5);
        list.add(2);
        
        System.out.println(list);
        
        int i;
        do{
            i++;
        }
        while(i<0);
        
        int[] i = {3,4,5,6,7,8,9};
        for(int x:i){
            if(i[x]==4 || i[x]==6 || i[x]==8)
                continue;
            
            System.out.println(i[x]);
            continue;
        }*/
        
       // String s=null;

//System.out.println(s);

//System.out.println(s.length());
//throw new ArithmeticException("demo"); 
/*try{
String s = "123";
int i = Integer.parseInt(s);
int b = 2/0;
}
catch(NumberFormatException e){
    System.out.println("Number Exception");
}
catch(ArithmeticException a){
    System.out.println("Arithmatic Exception");
}*/
        
        /*rowArray = new ArrayList<>();
   for(int i=1;i<26;i++){
       rowArray.add("A"+i);
            rowArray.add("B"+i);
            rowArray.add("C"+i);
            rowArray.add("D"+i);
            rowArray.add("E"+i);
            rowArray.add("F"+i);
            
        }
   System.out.println(rowArray);*/
       // b = a * 4; 
        //System.out.println(b);
        
        ArrayList<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        
        System.out.println(test);
        
        test.remove(2);
        
        System.out.println(test);
}
}