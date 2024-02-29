package CustomLocks.StampLock;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread th1 = new Thread(() -> {
            resource.producer();
        });

        Thread th2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                resource.consume();
            } catch (Exception e) {
            }
        });

        th1.start();
        th2.start();
    }
}
