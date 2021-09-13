package com.company.Betab;
import java.util.Scanner;
public class Word {

    //Post: The number of words in a sentence or a word
    public static void countWords(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String s= input.nextLine();
        String[] arr= s.split(" ");
        int count= arr.length;
        System.out.printf("The number of words in the sentence: %d\n",count);
    }
}
