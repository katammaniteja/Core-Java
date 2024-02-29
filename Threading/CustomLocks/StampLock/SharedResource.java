package CustomLocks.StampLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    int a = 10;
    StampedLock lock = new StampedLock();

    public void producer() {
        long stamp = lock.tryOptimisticRead();
        try {
            System.out.println("Taken optimistic read by: " + Thread.currentThread().getName());
            Thread.sleep(6000);
            if (lock.validate(stamp)) {
                System.out.println("Read successful by: " + Thread.currentThread().getName());
            } else {
                System.out.println("rollback of work by: " + Thread.currentThread().getName());
            }
        } catch (Exception e) {
        }
    }

    public void consume() {
        long stamp = lock.writeLock();
        try {
            System.out.println("Write lock acquired by: " + Thread.currentThread().getName());
            a = 9;
        } catch (Exception e) {
        } finally {
            System.out.println("Write lock released by: " + Thread.currentThread().getName());
            lock.unlock(stamp);
        }
    }
}
