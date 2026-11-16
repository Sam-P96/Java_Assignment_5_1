package Task_5_1_2;

import java.util.Random;

public class Task2Main {
    private static final int SIZE = 100_000;

    public static void main(String[] args) {
        int[] numbers = new int[SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            numbers[i] = random.nextInt(1000);
        }

        int cores = Runtime.getRuntime().availableProcessors();
        int chunk = SIZE / cores;
        System.out.println("Processor cores: " + cores);
        System.out.println("Numbers per thread: about " + chunk);


        // Gotta read more to understand.
    }
}
