package com.multithreading.synchronization;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create two threads that increment the counter 1000 times each
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

       
        

        // Start both threads
        t1.start();
        t2.start();
        
        
        // Wait for both threads to finish
        t1.join();
        t2.join();
        

        // Output final count
        System.out.println("Final Count: " + counter.getCount());
    }
}
