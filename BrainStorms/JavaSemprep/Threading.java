class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Access.print();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
                Access.print();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Access {
    static synchronized void print() {
        System.out.println("Access granted for: " + Thread.currentThread().getName());
    }
}
class Main2{
    public static void main(String... args) {
        MyThread1 ob1 = new MyThread1(); // Creating thread 1
        MyThread2 ob2 = new MyThread2(); // Creating thread 2

        System.out.println("Starting thread 1");
        ob1.start();
        ob2.start();
        try {
            ob1.join(); // Wait for thread 1 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Starting thread 2");

        try {
            ob2.join(); // Wait for thread 2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed main");
    }
}
