/* Activity 1.2 - Question 3 */
import java.util.Scanner;


class Question3 {
    public static void main(String[] args) {

        /* Write your code here */
        Scanner scan = new Scanner(System.in);
        String name;
        String adj;
         System.out.println("Hello. What is your name?");
         name = scan.nextLine();
         System.out.println("What adjective describes you?");
         adj = scan.nextLine();
         System.out.println("My name is " + name + ". I am " + adj );
    }
}