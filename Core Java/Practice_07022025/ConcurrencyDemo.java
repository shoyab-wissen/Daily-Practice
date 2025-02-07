package Practice_07022025;

import java.util.concurrent.Semaphore;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Shared {
    static int count = 0;
}

class IncThread extends Thread {
    String name;
    Semaphore sem;

    IncThread(String name, Semaphore sem) {
        this.name = name;
        this.sem = sem;
        new Thread(this).start();
    }

    public void run() {
        try {
            System.out.println(name + " is waiting to get the permission");
            sem.acquire();
            System.out.println(name + " has got the permission");
            IntStream.range(1, 6).forEach((i) -> {
                System.out.println(name + " : " + ++Shared.count);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            System.out.println(name + " has release permission");
            sem.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class DecThread extends Thread {
    String name;
    Semaphore sem;

    DecThread(String name, Semaphore sem) {
        this.name = name;
        this.sem = sem;
        new Thread(this).start();
    }

    public void run() {
        try {
            System.out.println(name + " is waiting to get the permission");
            sem.acquire();
            System.out.println(name + " has got the permission");
            IntStream.range(1, 6).forEach((i) -> {
                System.out.println(name + " : " + --Shared.count);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            System.out.println(name + " has release permission");
            sem.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ConcurrencyDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(2);
        IncThread t1 = new IncThread("Shoyab", sem);
        DecThread d1 = new DecThread("Sarvesh", sem);
        IncThread t2 = new IncThread("Sanjana", sem);
        IncThread t3 = new IncThread("Kaif", sem);
        DecThread d2 = new DecThread("Sanchit", sem);
        IncThread t4 = new IncThread("Omkar", sem);
    }
}
