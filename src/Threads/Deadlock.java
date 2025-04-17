// write a program to create a deadlock
package Threads;

public class Deadlock {
    public static void main (String[] args) {

        final Resource lock1 = new Resource("Resource-1");
        final Resource lock2 = new Resource("Resource-2");

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 is locked on " + lock1.name);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1 is trying to lock " + lock2.name);
                synchronized (lock2) {
                    System.out.println("Thread 1 is locked on " + lock2.name);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2 is locked on " + lock2.name);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2 is trying to lock " + lock1.name);
                synchronized (lock1) {
                    System.out.println("Thread 2 is locked on " + lock1.name);
                }
            }
        });

        t1.start();
        t2.start();
    } 

    static class Resource {
        String name;

        Resource(String name) {
            this.name = name;
        }
    }
}