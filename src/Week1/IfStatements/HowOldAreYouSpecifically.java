package Week1.IfStatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
        String name = myScan.nextLine();
        System.out.print("Ok, " + name + ", how old are you? ");
        int age = myScan.nextInt();

        if (age < 16) {
            System.out.println("\nYou can't drive, " + name + ".");
        } else if (age >= 16 && age <= 17) {
            System.out.println("\nYou can drive but you can't vote, " + name + ".");
        } else if (age >= 18 && age <= 24) {
            System.out.println("\nYou can vote but you can't rent a car, " + name + ".");
        } else {
            System.out.println("\nYou can do pretty much anything, " + name + ".");
        }

        myScan.close();
    }

}
