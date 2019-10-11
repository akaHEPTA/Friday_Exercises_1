package Week1.KeyboardInput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Hello.  What is your name?");
        String name = myScan.nextLine();
        System.out.println("\nHi, " + name + "!  How old are you?");
        int age = myScan.nextInt();
        System.out.println("\nSo you're " + age + ", eh?  That's not old at all!");
        System.out.println("How much do you make, " + name + "?");
        float salary = myScan.nextFloat();
        System.out.println("\n" + salary + "!  I hope that's per hour and not per year! LOL!");

        myScan.close();
    }

}
