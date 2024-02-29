public class Main {
    public static void main(String[] args) {
        System.out.println("Going inside the main method: " + Thread.currentThread().getName());
        Example runnable = new Example();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("Finished main method: " + Thread.currentThread().getName());
    }
}
