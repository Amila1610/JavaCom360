package multithreading;

import java.util.Scanner;

public class Threads {

    public synchronized void userOne() throws InterruptedException{
        Scanner u1= new Scanner(System.in);
            System.out.println("Thread 0 Enter your message..");
            System.out.println(Thread.currentThread().getName());
            String message = u1.nextLine();

            if(message.equalsIgnoreCase("by")){
                System.out.println("Thread O has left chat!");
                System.exit(0);
            }

        wait();

    }

    public synchronized void userTwo() throws InterruptedException{

        Scanner u2= new Scanner(System.in);
            System.out.println("Thread 1 Answer on first message");
            System.out.println(Thread.currentThread().getName());
            String message2 =u2.nextLine();
            //System.out.println("I'm waiting on your answer..");

            if(message2.equalsIgnoreCase("by")){
            System.out.println("Thread 1 has left chat!");
            System.exit(0);
        }
            notify();
    }

}
