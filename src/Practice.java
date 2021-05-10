import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Enter a number and let's check if it's palindromic: ");

         int userInput = input.nextInt();

         if(userInput < 100 || userInput > 999){
             System.out.println("Not within selection range");
         }else{
             int firstDigit = userInput/100;
             int lastDigit = userInput%10;

             if(firstDigit==lastDigit){
                 System.out.println("This is a palindrome");
             }else
                 System.out.println("This is not a palindrome");
         }
    }
}
