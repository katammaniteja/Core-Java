package Threading.Basics;

public class DeadlockMain {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        System.out.println("Main thread started");

        Thread th1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " calling produce method");
            resource.produce();
        });

        Thread th2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            System.out.println(Thread.currentThread().getName() + " calling produce method");
            resource.produce();
        });

        th1.start();
        th2.start();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }

        System.out.println("Thread-0 suspended");
        th1.suspend();
        // th1.resume(); --> Used to resume the suspended thread

        System.out.println("Main method is finished working");
    }
}
