package Practice_17012025;

class A extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                if (i % 4 == 0)
                    Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority() + " " + i);
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority() + " " + i);
            try {
                if (i % 3 == 0)
                    Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class C extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i == 10) {
                try {
                    A.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority() + " " + i);
        }
    }
}

public class MultiThreating {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        B b = new B();
        C c = new C();

        a.setName("A");
        b.setName("B");
        c.setName("C");

        a.setPriority(1);
        b.setPriority(5);
        c.setPriority(10);

        // Start threads, we can create multiple threads from a single class and also
        // from a single object
        a.start();
        b.start();
        c.start();
        a.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("Main" + i);
            try {
                if (i % 5 == 0)
                    Thread.sleep(2000);

                // Suspend and resume threads are deprecated
                if (i == 10) {
                    a.suspend(); // Suspends thread a until resume() is called
                    b.suspend(); // Suspends thread b until resume() is called
                }
                if (i == 15) {
                    a.resume(); // Resumes thread a from suspend()
                }
                if (i == 18) {
                    b.resume();
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Wait for threads to finish
        a.join();
        b.join();
        System.out.println("Main Exit");
    }
}
