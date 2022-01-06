package com.wordBackwards2;


import java.util.Arrays;
import java.util.Scanner;

public class withImport {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write word you want to get backwards: ");
        String word = scanner.nextLine();

       /**
        * That was first idea, however it turned out to be unnecessary.
        *
        char[] wordArray = new char[word.length()];


        for(int i=0;i<word.length();i++ ){
            wordArray[i] = word.charAt(i);
        }
        System.out.println(wordArray);
        */


        char[] wordBackwards = new char[word.length()];
        int j = (word.length() - 1);
        for(int i =0; i<word.length();i++){
            char currentChar = word.charAt(i);
            wordBackwards[j] = currentChar;
            j--;
            /**
             * Just a prior check for a correct read of data.
            System.out.println(currentChar);
             */
        }
        System.out.println("Your word backwards is: ");
        System.out.println(wordBackwards);

    }
}
