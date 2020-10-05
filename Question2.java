/* Activity 1.2 - Question 2 */
import java.util.Scanner;


class Question2 {
    public static void main(String[] args) {

        /* Write your code here */
        Scanner scan = new Scanner(System.in); 
        String name1;
        String name2;
        String name3;

        System.out.println("Please enter three names (Enter after each name): ");
        name1 = scan.nextLine();
        System.out.println(" ");
        name2 = scan.nextLine();
        System.out.println(" ");
        name3 = scan.nextLine();
        
        System.out.println(name3 + " " + name2+ " " + name1);

    }
}