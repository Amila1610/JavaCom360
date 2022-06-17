package multithreading;

public class twoThreadsExecutor {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        Threads tds = new Threads();


        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    while(true) {
                        tds.userOne();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while(true) {
                        tds.userTwo();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });

        t1.start();
        t2.start();






    }
}
