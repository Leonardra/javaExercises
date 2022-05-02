package com.incluctab.tddClasses.chapterFourteen;

import java.util.Random;

public class RandomSentenceGenerator {
    public static void main(String[] args) {
        String[] articles = {"the", "a","one","some","any",};
        String[] noun = {" boy", " girl"," dog"," town"," car",};
        String[] verb = {" drove", " jumped"," ran"," walked", " skipped"};
        String[] preposition = {" to ", " from "," over "," under ", " on "};

        for (int i = 1; i <= 20; i++) {
            String sentence = "Number "+ i + ": "+articles[generateRandomCount()].concat(noun[generateRandomCount()].
                    concat(verb[generateRandomCount()]).concat(preposition[generateRandomCount()]).concat(articles[generateRandomCount()]).
                    concat(noun[generateRandomCount()]));
            System.out.println(sentence);
        }

    }

    private static int generateRandomCount(){
        Random rand = new Random();
        int count = rand.nextInt(5);
        return count;
    }
}
