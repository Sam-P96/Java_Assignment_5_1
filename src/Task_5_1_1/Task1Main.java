package Task_5_1_1;

import java.util.Scanner;

public class Task1Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Start of range: ");
        int start = scanner.nextInt();
        System.out.print("End of range: ");
        int end = scanner.nextInt();

        int firstOdd = (start % 2 != 0) ? start : start +1;
        int firstEven = (start % 2 == 0) ? start : start +1;

        Thread oddThread = new Thread(new NumberPrinter("Odd thread", firstOdd, end));
        Thread evenThread = new Thread(new NumberPrinter("Even Thread", firstEven, end));

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        System.out.println("Printing Complete");
    }
}
