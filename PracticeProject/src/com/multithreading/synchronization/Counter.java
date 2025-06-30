package com.multithreading.synchronization;

public class Counter {

	private int count = 0;

    // Synchronized method to ensure thread safety
    public synchronized void increment() {
        count++;        
    }
   
  //for synchronized block refer this method
    
//      public void increment() {
//          synchronized (this) {
//              count++;
//          }
//      }
    
    

    public int getCount() {
        return count;
    }
}
