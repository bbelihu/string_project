package com.company.Betab;
import java.util.Scanner;
public class Palindrome {

    // Post: True or False returned based of whether the user entered a palindrome word or not.
    public static void reverse(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter a sentence or a word to check if it is a palindrome:");
        String s= input.nextLine();
        int length = s.length();
        String reverse="";
        for(int i=length-1; i>=0; --i){
            reverse+= s.charAt(i);
        }
        boolean result=isPalindrome(s,reverse);
        if(result){
            System.out.printf("%s is a palindrome with %s\n", s,reverse);
        }
        else{
            System.out.printf("%s is not a palindrome with %s\n",s,reverse);
        }
    }
    //Return: True/ False based on the argument.
    public static boolean isPalindrome(String s, String r){
       int s_Length= s.length();
       int r_Length= r.length();
       boolean flag= true;
       if(s_Length == r_Length) {
           for (int i = 0; i < s_Length; ++i) {
               if (s.toLowerCase().charAt(i) != r.toLowerCase().charAt(i)) {
                   flag = false;
                   break;
               }
           }
       }
        return flag;

    }
}
