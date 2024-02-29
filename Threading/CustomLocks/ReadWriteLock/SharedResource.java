package Threading.CustomLocks.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
    boolean isAvailable = false;

    public void Producer(ReadWriteLock lock) {
        try {
            lock.readLock().lock();
            System.out.println("Read lock acquired by: " + Thread.currentThread().getName());
            Thread.sleep(8000);
        } catch (Exception e) {
        } finally {
            System.out.println("Read lock released by: " + Thread.currentThread().getName());
            lock.readLock().unlock();
        }
    }

    public void consume(ReadWriteLock lock) {
        try {
            lock.writeLock().lock();
            System.out.println("Write lock acquired by: " + Thread.currentThread().getName());
            isAvailable = false;
        } catch (Exception e) {
        } finally {
            System.out.println("Write lock released by: " + Thread.currentThread().getName());
            lock.writeLock().unlock();
        }
    }

    public void helper() {
        System.out.println("Please help me");
    }
}
