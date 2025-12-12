package JavaSemprep;

public class Counter {
    static int counter = 0;

    public Counter() {
        counter++;
    }

    public static void display() {
        System.out.println("The counter's value is " + counter);
    }

    public static void main(String... a) {
        new Counter();
        new Counter();
        new Counter();
        new Counter();
        new Counter();
        Counter.display();
    }
}