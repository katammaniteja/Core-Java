public class Example implements Runnable {
    public void run() {
        System.out.println("code executed by the thread: " + Thread.currentThread().getName());
    }
}
