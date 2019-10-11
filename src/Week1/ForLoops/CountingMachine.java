package Week1.ForLoops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.print("Count to: ");
        int num = myScan.nextInt();

        for (int i = 0; i < num + 1; i++) {
            System.out.print(i + " ");
        }

        myScan.close();
    }
}
