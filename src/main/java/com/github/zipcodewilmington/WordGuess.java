package com.github.zipcodewilmington;

import java.util.Random;

public class WordGuess {
    public static char[] getWord(){
        String[] words = {"cat", "dog", "rabbit", "turtle", "book", "fish"};
        Random random = new Random();
        int i = random.nextInt(6);
        return words[i].toCharArray();
    }

    public static char[] display(char[] word) {
        StringBuilder input = new StringBuilder();

        for (int i = 0; i <word.length; i++) {
            input.append("_");
        }
        return input.toString().toCharArray();
    }
    public static boolean isWordGuessed(char[] guess) {
        for (char x : guess) {
            if (x == '_') {
                return false;
            }
        }
        return true;
    }
}
