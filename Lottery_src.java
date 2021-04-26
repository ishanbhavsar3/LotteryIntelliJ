import java.util.*;

public class Lottery_src {
    public static void main() {
        Scanner a = new Scanner(System.in);
        char ch;

        System.out.println();
        System.out.println("MIT License");
        System.out.println("Copyright (c) 2020 Ishan Bhavsar.");
        System.out.println("My GitHub ID - @ishanbhavsar3");

        System.out.println();

        Strng.main();

        System.out.println();

        int l1 = (int) (Math.random() * 20);
        System.out.println();
        System.out.println("Get a chance to win Rs.10 by testing your luck.");
        System.out.println("You win the prize if your inputted number and the computer's random output number matches.");
        System.out.println("Input a number between 0 and 20.");

        int c1 = a.nextInt();

        if (c1 == l1) {
            System.out.println();
            System.out.println("The number you inputted is " + c1 + " and the lucky number is " + l1 + ".");
            System.out.println("Your luck is good today! You have won the price of Rs.10!");
            System.out.println("Would you like to play again? Input Y for yes and any other character for no.");
            ch = a.next().charAt(0);
            if (ch == 'Y') {
                Lottery_src.main();
            } else {
                System.out.println("Goodbye!");
                System.exit(0);
            }
        } else {
            System.out.println();
            System.out.println("The number you inputted is " + c1 + " and the lucky number is " + l1 + ".");
            System.out.println("You still have 2 chances to go! Best of luck !");
        }

        System.out.println("Input a number between 0 and 15.");
        System.out.println("Input 404 to exit.");
        int c2 = a.nextInt();

        int l2 = (int) (Math.random() * 15);
        if (c2 == l2) {
            System.out.println();
            System.out.println("The number you inputted is " + c2 + " and the lucky number is " + l2 + ".");
            System.out.println("Your luck is good today! You have won the price of Rs.10!");
            System.out.println("Would you like to play again? Input Y for yes and any other character for no.");
            ch = a.next().charAt(0);
            if (ch == 'Y') {
                Lottery_src.main();
            } else {
                System.out.println("Goodbye!");
                System.exit(0);
            }

        } else if (c2 == 404) {
            System.out.println("Thank you for playing with us.");
            System.exit(0);

        } else {
            System.out.println();
            System.out.println("The number you inputted is " + c2 + " and the lucky number is " + l2 + ".");
            System.out.println("You still have 1 last chance to go..Best of luck!");
        }

        System.out.println("Input a number between 0 and 10.");
        System.out.println("Input 404 to exit.");
        int c3 = a.nextInt();

        int l3 = (int) (Math.random() * 10);

        if (c3 == l3) {
            System.out.println();
            System.out.println("The number you inputted is " + c3 + " and the lucky number is " + l3 + ".");
            System.out.println("Your luck is good today! You have won the price of Rs.10!");
            System.out.println("Would you like to play again? Input Y for yes and any other character for no.");
            ch = a.next().charAt(0);
            if (ch == 'Y') {
                Lottery_src.main();
            } else {
                System.out.println("Goodbye!");
                System.exit(0);
            }

        } else if (c2 == 404) {
            System.out.println("Thank you for playing with us.");

        } else {
            System.out.println();
            System.out.println("The number you inputted is " + c3 + " and the lucky number is " + l3 + ".");
            System.out.println("Your luck is not favouring you today :-( ");
            System.out.println("You lose. Thank you for playing with us!");
            System.out.println("Would you like to play again? Input Y for yes and any other character for no.");
            ch = a.next().charAt(0);
            if (ch == 'Y') {
                Lottery_src.main();
            } else {
                System.out.println("Goodbye!");
                System.exit(0);
            }

        }
    }
}
