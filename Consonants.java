package com.company.Betab;
import java.util.Scanner;
public class Consonants {

    // Post: Post an output for the user.
    public static void count(){
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a sentence or a word: ");
        String in= input.nextLine();
        int length= in.length();
        int count=0;
        for(int i=0; i<length;++i){
            char c = in.toLowerCase().charAt(i);
            switch(c){
                case 'b': count++; break;
                case 'c': count++; break;
                case 'd': count++; break;
                case 'f': count++; break;
                case 'g': count++; break;
                case 'h': count++; break;
                case 'j': count++; break;
                case 'k': count++; break;
                case 'l': count++; break;
                case 'm': count++; break;
                case 'n': count++; break;
                case 'p': count++; break;
                case 'q': count++; break;
                case 'r': count++; break;
                case 's': count++; break;
                case 't': count++; break;
                case 'v': count++; break;
                case 'w': count++; break;
                case 'x': count++; break;
                case 'y': count++; break;
                case 'z': count++; break;
            }
        }
        replace(in);
        System.out.printf("The number of consonant in %s is:  %d\n",in, count);

    }
    public static void replace(String s) {
        char[] arr= s.toCharArray();
        for(int i=0; i<arr.length;++i){
            switch(arr[i]){
                case 'b': arr[i]='*'; break;
                case 'c': arr[i]='*'; break;
                case 'd': arr[i]='*'; break;
                case 'f': arr[i]='*'; break;
                case 'g': arr[i]='*'; break;
                case 'h': arr[i]='*'; break;
                case 'j': arr[i]='*'; break;
                case 'k': arr[i]='*'; break;
                case 'l': arr[i]='*'; break;
                case 'm': arr[i]='*'; break;
                case 'n': arr[i]='*'; break;
                case 'p': arr[i]='*'; break;
                case 'q': arr[i]='*'; break;
                case 'r': arr[i]='*'; break;
                case 's': arr[i]='*'; break;
                case 't': arr[i]='*'; break;
                case 'v': arr[i]='*'; break;
                case 'w': arr[i]='*'; break;
                case 'x': arr[i]='*'; break;
                case 'y': arr[i]='*'; break;
                case 'z': arr[i]='*'; break;
            }

        }
        String new_String = String.valueOf(arr);
        System.out.println("Output: "+ new_String);
    }
}
