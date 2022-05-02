package com.incluctab.tddClasses.extraClass;

import java.util.Arrays;
import java.util.Scanner;

public class MyerBriggs {
    private static final Scanner collectResponse = new Scanner(System.in);
    private static String[][] responses = new String[20][2];
    private static final int[] totals = new int[8];
    private static String res;


    public static void main(String[] args) {
        displayQuestion();
        assignPersonalityTypes();
//        displayResult();
        System.out.println(Arrays.deepToString(responses));
        System.out.println(Arrays.toString(totals));
//        res = collectResponse.next();

    }

    public static void displayQuestion(){
        String[][] questions = new String[20][2];

        questions[0][0] = "Expend Energy, Enjoy Groups";
        questions[0][1] = "Conserve energy, enjoy one-on-one";
        questions[1][0] = "Interpret literally";
        questions[1][1] = "Look for meaning and possibilities";
        questions[2][0] = "Logical thinking, questioning";
        questions[2][1] = "Empathetic, feeling, accommodating";
        questions[3][0] = "Organized, orderly";
        questions[3][1] = "Flexible, adaptable";
        questions[4][0] = "More outgoing, think out loud";
        questions[4][1] = "More reserved, think to yourself";
        questions[5][0] = "Practical, realistic, experiential";
        questions[5][1] = "Imaginative, innovative, theoretical";
        questions[6][0] = "Candid, straight forward, frank";
        questions[6][1] = "Tactful, kind, encouraging";
        questions[7][0] = "Plan, schedule ";
        questions[7][1] = "Unplanned, spontaneous";
        questions[8][0] = "Seek many tasks, public activities, interaction with others";
        questions[8][1] = "Seek private, solitary activities with quiet to concentrate";
        questions[9][0] = "Standard, usual, conventional";
        questions[9][1] = "Different, novel, unique";
        questions[10][0] = "Firm, tend to criticize, hold the line";
        questions[10][1] = "Gentle, tend to appreciate, conciliate";
        questions[11][0] = "Regulated, structured";
        questions[11][1] = "Easygoing, “live” and “let live”";
        questions[12][0] = "External, communicative, express yourself";
        questions[12][1] = "Internal, reticent, keep to yourself";
        questions[13][0] = "Focus on here-and-now";
        questions[13][1] = "Look to the future, global perspective, “big picture";
        questions[14][0] = "Tough-minded, just";
        questions[14][1] = "Tender-hearted, merciful";
        questions[15][0] = "Preparation, plan ahead";
        questions[15][1] = "Go with the flow, adapt as you go";
        questions[16][0] = "Active, initiate";
        questions[16][1] = "Reflective, deliberate";
        questions[17][0] = "Facts, things, “what is” ";
        questions[17][1] = "Ideas, dreams, “what could be,” philosophical";
        questions[18][0] = "Matter of fact, issue-oriented";
        questions[18][1] = "Sensitive, people-oriented, compassionate";
        questions[19][0] = "Control, govern";
        questions[19][1] = "Latitude, freedom";

        int counter = 0;
        int questionCounter = 0;
        while (counter < questions.length) {
            createEmptySpaces(10);
            System.out.println("Question " + ++questionCounter + ": Enter A if you prefer " + questions[counter][0] +
                    "\n" + "or Enter B if you prefer " + questions[counter][1]);
            res = collectResponse.next();
            createEmptySpaces(10);

            while (counter < responses.length) {
                int count = 0;

                while (count < responses[counter].length) {

                    int row = count / 2;
                    int col = count % 2;
                    if (res.equalsIgnoreCase("A")) {
                        responses[row][col] = res;
                        count++;
                        row = count / 2;
                        col = count % 2;
                        responses[row][col] = "_";
                    } else {
                        responses[row][col] = "_";
                        count++;
                        row = count / 2;
                        col = count % 2;
                        responses[row][col] = res;
                    }
                    count++;
                }
                counter++;
            }
        }

    }

    public static void assignPersonalityTypes(){
        if (totals[0] > totals[1]) {
            System.out.print("I");
        } else {
            System.out.print("E");
        }

        System.out.print(" ");

        if (totals[2] > totals[3]) {
            System.out.print("S");
        } else {
            System.out.print("N");
        }

        System.out.print(" ");
        if (totals[4] > totals[5]) {
            System.out.print("T");
        } else {
            System.out.print("F");
        }
        System.out.print(" ");
        if (totals[6] > totals[7]) {
            System.out.print("J");
        } else {
            System.out.print("P");
        }
        System.out.println();
    }

    public static void createEmptySpaces(int numberOfSpaces){
        for (int i = 0; i < numberOfSpaces; i++) {
            System.out.println(" ");
        }
    }

    public static void displayResult(){

        System.out.printf("\t\t%s\t%s\t\t%s\t%s\t\t%s\t%s\t\t%s\t%s\n", "A |","B", "A |","B", "A |","B", "A |","B");

        System.out.print("________________________________________________________");

        for (int row = 0; row < responses.length; row++) {
            for (int column = 0; column < responses[row].length; column++) {
                System.out.print(responses[row][column] + "\t");
//                System.out.print(" ");
            }
            System.out.println();
        }

    }
}