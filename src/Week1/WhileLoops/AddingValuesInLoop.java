package Week1.WhileLoops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int sum = 0;

        System.out.println("I will add up the numbers you give me.");

        while (true) {
            System.out.print("Numbers: ");
            int temp = myScan.nextInt();

            if (temp == 0)
                break;
            else
                sum += temp;

            System.out.println("The total so far is " + sum);
        }

        System.out.println("\nThe total is " + sum);

        myScan.close();
    }

}
