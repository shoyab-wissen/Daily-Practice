package Practice_17012025;

class A implements Runnable {
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 20; i++) {
                System.out.println(
                        Thread.currentThread().getName() + " " + Thread.currentThread().getPriority() + " " + i
                                + " this is synchronized block");
            }
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority() + " " + i
                    + " this is not synchronized block");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // public void start() {
    // Thread t = new Thread(this);
    // t.start();
    // }
}

public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        ThreadGroup tg = new ThreadGroup("Parent Thread Group");
        Thread t1 = new Thread(tg, a);
        Thread t2 = new Thread(tg, a);
        Thread t3 = new Thread(tg, a);

        t1.setDaemon(true);

        t1.setName("A");
        t2.setName("B");
        t3.setName("C");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Thread Group Name: " + tg.getName());
        for (int i = 0; i <= 10; i++) {
            System.out.println("Main Thread");
            if (i == 5) {
                tg.suspend();
            }
            if (i == 8) {
                tg.resume();
            }
            if (i == 10) {
                tg.stop();
            }
            Thread.sleep(2000);
        }

    }
}
