package com.incluctab.tddClasses.chapterFourteen;

public class ReverseSentence {

    public static void main(String[] args) {
        String sentence = "The boy is good";
        System.out.println(reverse(sentence));
    }

    public static String reverse(String sentence) {
        StringBuilder reverse = new StringBuilder();
        String[] tokens = sentence.split(" ");
        int lastIndex = tokens.length - 1;

        for(int count = lastIndex; count >= 0; count--){
            reverse.append(tokens[count]).append(" ");
        }
        return reverse.toString();
    }
}
