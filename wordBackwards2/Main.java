package com.wordBackwards2;

public class Main {
    /**
     * Basic version of a solution including usage of arrays.
     * @param args
     */
    public static void main(String[] args) {
	// write your code here


        char[] word = new char[6];
        word[0] = 'T';
        word[1] = 'o';
        word[2] = 'm';
        word[3] = 'a';
        word[4] = 's';
        word[5] = 'z';

        char[] nword = new char[word.length];
        int j = nword.length - 1;
        for(int i = 0; i<word.length;i++){
            char cchar = word[i];
            nword [j] = cchar;
            j--;
        }

        System.out.println(nword);

    }
}
