package com.company.Betab;
import java.util.Scanner;
public class Vowels {
    

    // Post: A word or a sentence printed on the screen that the user has inputed.
    public static void countVowels(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter sentence or a word: ");
        String in = input.nextLine();
        int length = in.length();
        int count=0;
        for(int i=0; i<length;++i){
            char c= in.toLowerCase().charAt(i);
            switch(c){
                case 'a': ++count; break;
                case 'e': ++count; break;
                case 'i': ++count; break;
                case 'o': ++count; break;
                case 'u': ++count; break;
            }
        }
        System.out.printf("The number of vowels in %s is: %d \n",in,count);

    }

}
