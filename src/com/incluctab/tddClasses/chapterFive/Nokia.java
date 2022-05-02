package com.incluctab.tddClasses.chapterFive;

import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int menuInput;
        int phonebookInput;
        int messageInput;
        int messageSettingInput;
        int setInput;
        int commonMenuInput;
        int callRegisterInput;
        int callDurationInput;
        int callCostInput;
        int costSettingInput;

       do {
           String mainMenu = """
                   -> Enter 1 to go to Phonebook
                   -> Enter 2 to go to Messages
                   -> Enter 3 to go to Chat
                   -> Enter 4 to go to Call register
                   -> Enter 5 to go to Tones
                   -> Enter 6 to go to Settings
                   -> Enter 7 to go to Call divert
                   -> Enter 8 to go to Games
                   -> Enter 9 to go to Calculator
                   -> Enter 10 to go to Reminder
                   -> Enter 11 to go to Clock
                   -> Enter 12 to go to Profiles
                   -> Enter 13 to go to SIM Service
                   -> Enter 14 to exit main menu
                   """;

           System.out.println(mainMenu);

           menuInput = input.nextInt();


           switch (menuInput) {

               case 1:
                   do {

                       System.out.println("Phonebook");
                       System.out.println();

                       String phonebookMenu = """
                               Enter 1 to Search
                               Enter 2 to view Service Nos.
                               Enter 3 to Add name
                               Enter 4 to Erase
                               Enter 5 to Edit
                               Enter 6 to Assign tone
                               Enter 7 to Send b/card
                               Enter 8 to view Options
                               Enter 9 to set Speed dials
                               Enter 10 to access Voice tags
                               Enter 11 to exit menu
                               """;
                       System.out.println(phonebookMenu);
                       phonebookInput = input.nextInt();
                       switch (phonebookInput) {
                           case 1:
                               System.out.println("Search");
                               break;
                           case 2:
                               System.out.println("Service Nos");
                               break;
                           case 3:
                               System.out.println("Add Name");
                               break;
                           case 4:
                               System.out.println("Break");
                               break;
                           case 5:
                               System.out.println("Edit");
                               break;
                           case 6:
                               System.out.println("Assign Tone");
                               break;
                           case 7:
                               System.out.println("Send B/Card");
                               break;
                           case 8:
                               int viewOptionsInput;
                               do {
                                   System.out.println("View Options");
                                   System.out.println();
                                   String optionsMenu = """
                                           Enter 1 to set Type of view
                                           Enter 2 to check Memory status
                                           Enter 3 to exit menu
                                           """;
                                   System.out.println(optionsMenu);
                                   viewOptionsInput = input.nextInt();
                                   switch (viewOptionsInput) {
                                       case 1:
                                           System.out.println("Type of view");
                                           break;
                                       case 2:
                                           System.out.println("Memory Status");
                                           break;
                                       case 3:
                                           break;
                                       default:
                                           System.out.println("Invalid input. Try again.");
                                           break;
                                   }

                               } while (viewOptionsInput != 3);
                               break;

                           case 9:
                               System.out.println("Speed Dials");
                               break;
                           case 10:
                               System.out.println("Voice Tags");
                               break;
                           case 11:
                               break;
                           default:
                               System.out.println("Invalid input. Try Again");
                               break;
                       }
                   }

               while(phonebookInput != 11);
                       break;

               case 2:
                   do {
                       System.out.println("Messages");
                       System.out.println();

                       String messageMenu = """
                               Enter 1 to Write messages
                               Enter 2 to view Inbox
                               Enter 3 to check Outbox
                               Enter 4 to compose Picture messages
                               Enter 5 to use Templates
                               Enter 6 to send Smileys
                               Enter 7 to view Message settings
                               Enter 8 to view Info service
                               Enter 9 to use Voice mailbox number
                               Enter 10 to access Service command editor
                               Enter 11 to exit menu
                               """;
                       System.out.println(messageMenu);
                       messageInput = input.nextInt();
                       switch (messageInput) {
                           case 1 -> System.out.println("Write Messages");
                           case 2 -> System.out.println("Inbox");
                           case 3 -> System.out.println("Outbox");
                           case 4 -> System.out.println("Picture Message");
                           case 5 -> System.out.println("Templates");
                           case 6 -> System.out.println("Smileys");
                           case 7 -> {
                               do{
                               System.out.println("Message Settings");
                               System.out.println();
                               String messageSettingMenu = """
                                       Enter 1 to select set
                                       Enter 2 to select common
                                       Enter 3 to exit menu
                                       """;
                               System.out.println(messageSettingMenu);
                               messageSettingInput = input.nextInt();
                               switch (messageSettingInput) {
                                   case 1:
                                       do {
                                           System.out.println("Set");

                                           String setMenu = """
                                                   Enter 1 to select Message centre number
                                                   Enter 2 to select Messages sent as
                                                   Enter 3 to check Message validity
                                                   Enter 4 to exit menu
                                                   """;

                                           System.out.println(setMenu);
                                           setInput = input.nextInt();

                                           switch (setInput) {
                                               case 1 -> System.out.println("Message center number");
                                               case 2 -> System.out.println("Message sent as");
                                               case 3 -> System.out.println("Message validity");
                                               case 4 -> System.out.println(" ");
                                               default -> System.out.println("Invalid input. Try again");
                                           }
                                       }while (setInput != 4);
                                       break;
                                   case 2:
                                       do {
                                           System.out.println("Common");

                                           String commonMenu = """
                                                   Enter 1 to select Delivery reports
                                                   Enter 2 to Reply via same centre
                                                   Enter 3 to select Character support
                                                   Enter 4 to exit menu
                                                   """;

                                           System.out.println(commonMenu);

                                           commonMenuInput = input.nextInt();

                                           switch (commonMenuInput) {
                                               case 1 -> System.out.println("Delivery Report");
                                               case 2 -> System.out.println("Reply Via Same Center");
                                               case 3 -> System.out.println("Character Support");
                                               case 4 -> System.out.println(" ");
                                               default -> System.out.println("Invalid input. Try again.");
                                           }
                                           break;
                                       }while(commonMenuInput != 4);
                                   case 3:
                                       break;
                                   default:
                                       System.out.println("Enter valid input");
                               }
                               }while (messageSettingInput != 3);
                           }
                           case 8 -> System.out.println("Info Service");
                           case 9 -> System.out.println("Voice mailbox number");
                           case 10 -> System.out.println("Service command editor");
                           case 11 -> System.out.println(" ");
                           default -> System.out.println("Invalid input. Try again");
                       }

                   }
                   while (messageInput != 11);
                   break;
               case 3:
                   System.out.println("Chat");
                   break;
               case 4:
                   do {
                       System.out.println("Call register");

                       String callRegisterMenu = """
                               Enter 1 to view Missed calls
                               Enter 2 to view Received calls
                               Enter 3 to view Dialled numbers
                               Enter 4 to Erase recent call lists
                               Enter 5 to Show call duration
                               Enter 6 to Show call costs
                               Enter 7 to view Call cost settings
                               Enter 8 to show Prepaid credit
                               Enter 9 to exit menu
                               """;
                       System.out.println(callRegisterMenu);

                       callRegisterInput = input.nextInt();

                       switch (callRegisterInput) {
                           case 1 -> System.out.println("Missed Calls");
                           case 2 -> System.out.println("Received calls");
                           case 3 -> System.out.println("Dialled Numbers");
                           case 4 -> System.out.println("Erase recent call list");
                           case 5 -> {
                               do {
                                   System.out.println("Show Call Duration");
                                   String callDurationMenu = """
                                           Enter 1 to view Last call duration
                                           Enter 2 to view All calls’ duration
                                           Enter 3 to view Received calls’ duration
                                           Enter 4 to view Dialled calls’ duration
                                           Enter 5 to Clear timers
                                           Enter 6 to exit menu
                                           """;
                                   System.out.println(callDurationMenu);
                                   callDurationInput = input.nextInt();
                                   switch (callDurationInput) {
                                       case 1 -> System.out.println("Last Call Duration");
                                       case 2 -> System.out.println("All Calls Duration");
                                       case 3 -> System.out.println("Received calls’ duration");
                                       case 4 -> System.out.println("Dialled calls’ duration");
                                       case 5 -> System.out.println("Clear timers");
                                       case 6 -> System.out.println(" ");
                                       default -> System.out.println("Invalid input. Try again");
                                   }
                               }while (callDurationInput != 6);
                           }
                           case 6 -> {
                               do {
                                   System.out.println("Show Call costs");
                                   System.out.println();
                                   String callCostMenu = """
                                           Enter 1 to view Last call cost
                                           Enter 2 to view All calls’ cost
                                           Enter 3 to Clear counters
                                           Enter 4 to exit menu
                                           """;
                                   System.out.println(callCostMenu);
                                   callCostInput = input.nextInt();

                                   switch (callCostInput) {
                                       case 1 -> System.out.println("Last call cost");
                                       case 2 -> System.out.println("All call costs");
                                       case 3 -> System.out.println("Clear counter");
                                       case 4 -> System.out.println(" ");
                                   }
                               }while(callCostInput != 4);
                           }
                           case 7 -> {
                               do {
                                   System.out.println("Call cost settings");
                                   String costSettingMenu = """
                                           Enter 1 to set Call cost limit
                                           Enter 2 to Show costs in
                                           Enter 3 to exit menu
                                           """;
                                   System.out.println(costSettingMenu);
                                   costSettingInput = input.nextInt();
                                   switch (costSettingInput) {
                                       case 1 -> System.out.println("Call cost limit");
                                       case 2 -> System.out.println("Show costs in");
                                       case 3 -> System.out.println(" ");
                                       default -> System.out.println("Invalid input. Try again.");
                                   }
                               }while(costSettingInput != 3);
                           }
                           case 8 -> System.out.println("Prepaid credit");
                           case 9 -> System.out.println(" ");
                           default -> System.out.println("Invalid input. Try again.");
                       }
                   }while (callRegisterInput != 9);
                   break;
               case 5:
                   System.out.println("Tones");

                   String tonesMenu = """                     
                           Enter 1 to select Ringing tone
                           Enter 2 to select Ringing volume
                           Enter 3 to select Incoming call alert
                           Enter 4 to select Composer
                           Enter 5 to select Message alert tone
                           Enter 6 to select Keypad tones
                           Enter 7 to select Warning and game tones
                           Enter 8 to select Vibrating alert
                           Enter 9 to select Screen saver
                           """;
                   System.out.println(tonesMenu);

                   int tonesMenuInput = input.nextInt();

                   switch (tonesMenuInput) {
                       case 1 -> System.out.println("Ringing tone");
                       case 2 -> System.out.println("Ringing volume");
                       case 3 -> System.out.println("Incoming call alert");
                       case 4 -> System.out.println("Composer");
                       case 5 -> System.out.println("Message alert tone");
                       case 6 -> System.out.println("Keypad tones");
                       case 7 -> System.out.println("Warning and game tones");
                       case 8 -> System.out.println("Vibrating Alert");
                       case 9 -> System.out.println("Screen saver");
                   }
               case 6:
                   System.out.println("Settings");

                   String settingsMenu = """
                           Enter 1 to select Settings
                           Enter 2 to select Call settings
                           Enter 3 to select Phone settings
                           Enter 4 to select Security settings
                           Enter 5 to Restore factory settings
                           """;

                   System.out.println(settingsMenu);

                   int settingsMenuInput = input.nextInt();

                   switch (settingsMenuInput) {
                       case 1 -> {
                           System.out.println("Call settings");
                           String callSettingsMenu = """
                                   Enter 1 to select Automatic redial
                                   Enter 2 to select Speed dialling
                                   Enter 3 to select Call waiting options
                                   Enter 4 to select Own number sending
                                   Enter 5 to select Phone line in use
                                   Enter 6 to select Automatic answer
                                   """;
                           System.out.println(callSettingsMenu);
                           int callSettingsInput = input.nextInt();
                           switch (callSettingsInput) {
                               case 1 -> System.out.println("Automatic redial");
                               case 2 -> System.out.println("Speed dialling");
                               case 3 -> System.out.println("Call waiting options");
                               case 4 -> System.out.println("Own number sending");
                               case 5 -> System.out.println("Phone line in use");
                               case 6 -> System.out.println("Automatic answer");
                           }
                       }
                       case 2 -> {
                           System.out.println("Phone settings");
                           String phoneSettingsMenu = """
                                   Enter 1 to select Language
                                   Enter 2 to select Cell info display
                                   Enter 3 to select Welcome note
                                   Enter 4 to select Network selection
                                   Enter 5 to select Lights
                                   Enter 6 to select Confirm SIM service actions
                                   """;
                           System.out.println(phoneSettingsMenu);
                           int phoneSettingsInput = input.nextInt();
                           switch (phoneSettingsInput) {
                               case 1 -> System.out.println("Language");
                               case 2 -> System.out.println("Cell info display");
                               case 3 -> System.out.println("Welcome note");
                               case 4 -> System.out.println("Network selection");
                               case 5 -> System.out.println("Lights");
                               case 6 -> System.out.println("Confirm SIM service actions");
                           }
                       }
                       case 3 -> {
                           System.out.println("Security settings");
                           System.out.println();
                           String securitySettingsMenu = """
                                   Enter 1 to select PIN code request
                                   Enter 2 to select Call barring service
                                   Enter 3 to select Fixed dialling
                                   Enter 4 to select Closed user group
                                   Enter 5 to select Phone security
                                   Enter 6 to select Change access codes
                                   """;
                           System.out.println(securitySettingsMenu);
                           int securitySettingsInput = input.nextInt();
                           switch (securitySettingsInput) {
                               case 1 -> System.out.println("PIN code request");
                               case 2 -> System.out.println("Call barring service");
                               case 3 -> System.out.println("Fixed dialling");
                               case 4 -> System.out.println("Closed user group");
                               case 5 -> System.out.println("Phone security");
                               case 6 -> System.out.println("Change access codes");
                           }
                       }
                       case 4 -> System.out.println("Restore factory settings");
                   }
               case 7:
                   System.out.println("Call divert");
                   break;
               case 8:
                   System.out.println("Games");
                   break;
               case 9:
                   System.out.println("Calculator");
                   break;
               case 10:
                   System.out.println("Reminders");
                   break;
               case 11:
                   System.out.println("Clock");

                   String clockMenu = """
                           Enter 1 to select Alarm clock
                           Enter 2 to select Clock settings
                           Enter 3 to select Date setting
                           Enter 4 to select Stopwatch
                           Enter 5 to select Countdown timer
                           Enter 6 to select Auto update of date and time
                           """;

                   System.out.println(clockMenu);

                   int clockMenuInput = input.nextInt();

                   switch (clockMenuInput) {
                       case 1 -> System.out.println("Alarm clock");
                       case 2 -> System.out.println("Clock settings");
                       case 3 -> System.out.println("Date settings");
                       case 4 -> System.out.println("Stopwatch");
                       case 5 -> System.out.println("Countdown timer");
                       case 6 -> System.out.println("Auto update of date and time");
                   }
                   break;
               case 12:
                   System.out.println("Profiles");
                   break;
               case 13:
                   System.out.println("SIM Service");
                   break;
           }
       }while (menuInput != 13);
    }
}
