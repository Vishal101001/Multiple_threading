package com.multithreadDemo;
/*
 * thread is created by class thread
 * */
class Thread1 extends Thread{
	public void run() {
		System.out.println("my first thread is running....");
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			//System.out.println(Thread.currentThread().getName());
		}
	}
}
public class MyThread1 {

	public static void main(String[] args) {
		Thread t1 = new Thread1();
		t1.start();
		System.out.println("main thread is running....");
	}

}
