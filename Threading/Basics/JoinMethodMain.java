package Threading.Basics;

public class JoinMethodMain {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        System.out.println("Main Thread started");
        Thread th1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " calling produce method");
            sharedResource.produce();
        });

        th1.start();
        try {
            System.out.println("Main Thread is waiting for the thread0 to finish");
            th1.join();
        } catch (Exception e) {
        }
        System.out.println("Main Thread finished its execution");
    }
}
