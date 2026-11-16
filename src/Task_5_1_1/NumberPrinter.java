package Task_5_1_1;

public class NumberPrinter implements Runnable {
    private final String name;
    private final int first;
    private final int last;

    public NumberPrinter(String name, int first, int last) {
        this.name = name;
        this.first = first;
        this.last = last;
    }

    @Override
    public void run() {
        for (int n = first; n <= last;  n+= 2) {
            System.out.println(name + ": " + n);
        }
    }


}
