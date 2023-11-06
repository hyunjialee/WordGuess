package com.github.zipcodewilmington;

import java.util.Random;

public class WordGuess {
    public static char[] getWord(){
        String[] words = {"cat,", "dog", "rabbit", "turtle", "book", "fish"};
        Random random = new Random();
        int i = random.nextInt(6);
        return words[i].toCharArray();
    }

    public static char[] display(char[] word) {
        String input = "";

        for (int i = 0; i <word.length; i++) {
            input = input + "_";
        }
        return input.toCharArray();
    }
    public static boolean isWordGuessed(char[] guess) {
        for (char c :guess) {
            if (c == '_'){
                return false;
            }
        }
        return true;
    }
}
