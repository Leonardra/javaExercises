package com.incluctab.tddClasses.diaryProject;

import java.util.Scanner;

public class DiaryApp {
    private static Diary newDiary = new Diary("The title");
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your diary name?");
        String diaryTitle = input.nextLine();
        newDiary.changeDiaryTitle(diaryTitle);

        int userInput;
        do{

        String displayMenu = """
                Enter 1 to Add Entry
                Enter 2 to Delete Entry
                Enter 3 to Find Entry by Title
                Enter 4 view all entries
                Enter 5 to exit
                """;

        System.out.println(displayMenu);
        userInput = input.nextInt();
        input.nextLine();

        switch(userInput) {
            case 1:
                System.out.println("Add new Entry");
                System.out.println();
                System.out.println("What is the title");
                String titleInput = input.nextLine();
                System.out.println("Enter entry body");
                String bodyInput = input.nextLine();
                newDiary.addEntry(titleInput, bodyInput);
                break;
            case 2:
                System.out.println("Delete Entry");
                System.out.println();
                System.out.println("Enter title");
                String inputTitle = input.nextLine();
                newDiary.deleteEntryByTitle(inputTitle);
                break;
            case 3:
                System.out.println("Search entry by title below");
                System.out.println();
                System.out.println("Enter title");
                String searchInput = input.nextLine();
                newDiary.findEntryByTitle(searchInput);
                break;
            case 4:
                newDiary.viewAllEntries();
                break;
            case 5:
                break;
            default:
                throw new IllegalArgumentException("Illegal entry, try again");

        }

        }while(userInput != 5);
    }
}
