package Task_5_1_2;

public class SumWorker extends Thread{
    private final int[] numbers;
    private final int from;
    private final int to;
    private long sum;

    public SumWorker(int[] numbers, int from, int to) {
        this.numbers = numbers;
        this.from = from;
        this.to = to;
        this.sum = 0;
    }

    @Override
    public void run() {
        for (int i = from; i < to; i++) {
            sum += numbers[i];
        }
    }

    // Generated Getters & Setters:

    public int[] getNumbers() {
        return numbers;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
}
