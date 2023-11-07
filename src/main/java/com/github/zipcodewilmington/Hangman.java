package com.github.zipcodewilmington;


import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

import static com.github.zipcodewilmington.WordGuess.isWordGuessed;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      char[] word = WordGuess.getWord();
      char[] guess = WordGuess.display(word);

      boolean correct = false;

      int attempts = word.length;

      System.out.println("Let's Play Word Guess version 1.0");

      while (attempts > 0) {
         System.out.print("You have " + attempts + " attempts left: ");

         System.out.println(guess);

         System.out.print("Enter a letter: ");

         char correctAnswer = input.next().charAt(0);

         for (int i = 0; i < word.length; i++) {
            if (correctAnswer == word[i]) {
               guess[i] = correctAnswer;
               }
         } if (isWordGuessed(guess)) {
            String x = new String(word);
            System.out.println("You guessed " + x + " correctly!");
            correct = true;
            break;
         } attempts--;
      }
      if (!correct) {
         String x = new String(word);
         System.out.println("You did not guess correctly! The word was: " + x);
      }
   }
}