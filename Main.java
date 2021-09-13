package com.company.Betab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        helpScreen();
        int in= input.nextInt();
        while(in!=0){
            switch(in){
                case 1:
                    Consonants.count(); break;
                case 2:
                    Word.countWords();break;
                case 3:
                    LastLetterCount.count();break;
                case 4:
                    Palindrome.reverse();break;
                case 5:
                    Vowels.countVowels();break;
                case 6:
                    helpScreen();break;
            }
            System.out.println("Please enter an appropriate number to run a program(PRESS 6 FOR HELPSCREEEN OR 0 TO EXIT:)\t");
            in= input.nextInt();
        }
        if(in == 0){
            System.out.println("User has ended the program!!");
        }
    }
    public static void helpScreen(){
        System.out.printf("****************** Now Showing User Help Screen Please Follow Commands ***********\n");
        System.out.printf("0. Program quits:\n");
        System.out.printf("1. A program to count the consonants in a sentence or a word and replace the consonants" +
                "with a star\n");
        System.out.printf("2. A program to count all the words in a sentence\n" );
        System.out.printf("3. A program that counts the last letter in a sentence if it ends in a y or an s\n");
        System.out.printf("4. A program that reverses a string and checks whether it is a palindrome or not\n");
        System.out.printf("5. A program that counts all the vowels in a sentence or a word\n");
        System.out.printf("6. Help Screen Printed again: \n");
        System.out.printf("Please enter the appropriate number to run the program:\n\t");


    }
}
