package com.company.Betab;
import java.util.Scanner;
public class LastLetterCount {
    public static void main(String[] args) {
        count();
    }
    //Post: Prints a message on the screen for the user to follow and then posts an output on the screen.
    public static void count(){
        int count =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String in= input.nextLine();
        String [] words = in.split(" ");
        int num1=0;
        int num2=0;
        String word1="";
        String word2="";
        System.out.println("Input: "+in);

        for(int i=0; i< words.length;++i){
            if(words[i].endsWith("s")){
                word1=words[i];
                count++;
            }
            if(words[i].endsWith("y")){
                word2=words[i];
                count++;
            }
            if(!word1.equals("")&& !word2.equals("")){
                    words[num1]=word2;
                    words[num2]=word1;
            }

        }
//        for(int i=0; i< words.length;++i){
//            int length= words[i].length();
//            char last_Letter = words[i].charAt(length-1);
//            if(last_Letter =='s'){
//                System.out.println(words[i]);
//                num1=i;
//                count++;
//            }
//            if(last_Letter =='y'){
//                System.out.println(words[i]);
//                num2=i;
//                count++;
//            }
//                if(in.contains("s")|| in.contains("y")){
//                    String temp = words[num1];
//                    words[num1]= words[num2];
//                    words[num2]= temp;
//                }
//
//        }
        String final_string="";
        for(int k=0; k< words.length;++k){
            final_string+=words[k]+" ";
        }
        System.out.println("Output: "+final_string);
        System.out.println("The number of words that end with y and s: "+count);
    }
}
