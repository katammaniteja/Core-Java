package CustomLocks.Semaphore;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread th1 = new Thread(() -> {
            sharedResource.produce();
        });

        Thread th2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                sharedResource.produce();
            } catch (Exception e) {
            }
        });

        Thread th3 = new Thread(() -> {
            sharedResource.produce();
        });

        Thread th4 = new Thread(() -> {
            sharedResource.produce();
        });

        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
}
