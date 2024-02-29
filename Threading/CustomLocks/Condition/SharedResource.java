package Threading.CustomLocks.Condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;
    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void produce() {
        try {
            lock.lock();
            System.out.println("Produce lock acquired by: " + Thread.currentThread().getName());
            if (isAvailable) {
                System.out.println("Produce thread is waiting: " + Thread.currentThread().getName());
                condition.await();
            }
            isAvailable = true;
            condition.signalAll();
        } catch (Exception e) {
        } finally {
            lock.unlock();
            System.out.println("Produce lock released by: " + Thread.currentThread().getName());
        }
    }

    public void consume() {
        try {
            Thread.sleep(1000);
            lock.lock();
            System.out.println("Consume lock acquired by: " + Thread.currentThread().getName());

            if (!isAvailable) {
                System.out.println("Consume thread is waiting: " + Thread.currentThread().getName());
                condition.await();
            }

            isAvailable = false;
            condition.signalAll();
        } catch (Exception e) {
        } finally {
            lock.unlock();
            System.out.println("Consume lock released by: " + Thread.currentThread().getName());
        }
    }
}
