/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author harry
 */
/*class NewClass3 {

    public NewClass3() throws Exception {
        System.out.println("Hello");
        throw new Exception();
    }

    int add(int i, int j) {
        return i + j;
    }

}*/

public class NewClass2 {

    /*public NewClass2() throws Exception {
        try {
            //super();
        } catch (Exception e) {
            System.out.println("test");
        }
    }*/

    String reverseString(String input) {
        //char[] reverse1 = new char[input.length()];
        String reverse1 = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            //reverse1[input.length()-1-i] = input.charAt(i);
            reverse1 = reverse1 + input.charAt(i);
        }
        //return Arrays.toString(reverse1);
        return reverse1;
    }
    
    int reverseNum(int reverseNum){
        int sum = 0, temp;
        while(reverseNum>0){
        temp = reverseNum%10;
        reverseNum = reverseNum/10;
        sum = (sum*10)+temp;
        }
        
        return sum;
    }

   /* public static void main(String args[]) {
            //short s = 9;
        //System.out.println(add(s,6));

        NewClass2 obj = new NewClass2();
        
        System.out.print("Enter String : ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        String reverse = obj.reverseString(inputString);
        System.out.println("Reversed string : " + reverse);
        
        System.out.print("Enter Number : ");
        int inputNumber = scanner.nextInt();
        
        int reverseNum = obj.reverseNum(inputNumber);
        System.out.println(reverseNum);
        if(reverseNum == inputNumber){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }

        int i = 0101;
        int j = 07;

        System.out.println(i);
        System.out.println(j);
    }*/
}
