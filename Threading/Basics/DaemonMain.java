package Threading.Basics;

public class DaemonMain {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        System.out.println("Main thread started");

        Thread th1 = new Thread(() -> {
            System.out.println("Thread1 calling produce method");
            sharedResource.produce();
        });

        th1.setDaemon(true);
        th1.start();

        System.out.println("Main thread finished working");
    }
}
