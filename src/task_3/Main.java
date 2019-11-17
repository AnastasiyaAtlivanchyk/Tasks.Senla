package task_3;

import common.ConsoleReader;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the sentence: ");

        try {
            String sentence = ConsoleReader.readSentence();

            List<String> words = Program.getWords(sentence);
            System.out.println("Count of words: " + words.size());
            Program.sort(words);

            System.out.println(words);


            //System.out.println();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}