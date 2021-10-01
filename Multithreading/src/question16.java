import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class question16 {
    Lock lock1 = new ReentrantLock(true);
    Lock lock2 = new ReentrantLock(true);
    public void acquireLock(Lock lock1, Lock lock2) {
        boolean acquireLock1 = lock1.tryLock();
        boolean acquireLock2 = lock2.tryLock();
        if (acquireLock1 && acquireLock2) {
            return;
        }
        if (acquireLock1) {
            lock1.unlock();
        }
        if (acquireLock2) {
            lock2.unlock();
        }
    }
    public void workerOne() {
        acquireLock(lock1, lock2);
        System.out.println("lock 1 worker 1");
        System.out.println("lock 2 worker 1");
        lock2.unlock();
        lock1.unlock();
    }
    public void workerTwo() {
        acquireLock(lock2, lock1);
        System.out.println("lock 1 worker 2");
        System.out.println("lock 2 worker 2");
        lock2.unlock();
        lock1.unlock();
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread starting: " + Thread.currentThread().getName());
        question16 tryLockDemo = new question16();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                tryLockDemo.workerOne();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                tryLockDemo.workerTwo();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Thread exiting: " + Thread.currentThread().getName());
    }
}

