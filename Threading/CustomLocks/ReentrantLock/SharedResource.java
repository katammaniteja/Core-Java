package CustomLocks.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;

    public void producer(ReentrantLock lock) {
        try {
            lock.lock();
            System.out.println("lock acquired by: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        } catch (Exception e) {
        } finally {
            System.out.println("Lock released by: " + Thread.currentThread().getName());
            lock.unlock();
        }
    }
}
