import java.util.*;
public class Switch_
{
    public static void main()
    {   
        Date dt = new Date();

        int hrs = dt.getHours();
        int mnt = dt.getMinutes();
        int sec = dt.getSeconds();
        System.out.println("The time of execution >>> "+hrs+" hours "+mnt+" minutes "+sec+" seconds.");
        switch (dt.getMonth()) {
            case 0 -> System.out.println("Month: January.");
            case 1 -> System.out.println("Month: February.");
            case 2 -> System.out.println("Month: March.");
            case 3 -> System.out.println("Month: April.");
            case 4 -> System.out.println("Month: May.");
            case 5 -> System.out.println("Month: June.");
            case 6 -> System.out.println("Month: July.");
            case 7 -> System.out.println("Month: August.");
            case 8 -> System.out.println("Month: September.");
            case 9 -> System.out.println("Month: October.");
            case 10 -> System.out.println("Month: November");
            case 11 -> System.out.println("Month: December");
        }

        switch (dt.getHours()) {
            case 1, 2, 3, 4, 5 -> System.out.println("Good Night!");

            case 6, 7, 8, 9, 10, 11 -> System.out.println("Good Morning!");
            case 12 -> System.out.println("Good Noon!");
            case 13, 14, 15 -> System.out.println("Good Afternoon!");
            case 16, 17, 18, 19, 22, 23 -> System.out.println("Good Evening!");


        }

        switch (dt.getDay()) {
            case 1 -> System.out.println("Hope you are having a marvellous Monday!");
            case 2 -> System.out.println("Hope you are having a terrific Tuesday!");
            case 3 -> System.out.println("Hope you are having a wonderful Wednesday!");
            case 4 -> System.out.println("Hope you are having a tremendous Thursday!");
            case 5 -> System.out.println("Hope you are having a fantastic Friday!");
            case 6 -> System.out.println("Hope you are having a superb Saturday!");
            default -> System.out.println("Hope you are having a stupendous Sunday!");
        }
    }
}
