package com.multithreadDemo;
/*
 * thread is implement by interface
 * */
class Thread2 implements Runnable{
	public void run() {
		System.out.println("runnable thread is running ");
	}
}
public class MyThread2 {

	public static void main(String[] args) {
		//object create
		Thread2 runnable = new Thread2();
		//object thread
		Thread th = new Thread(runnable);
		
		th.start();
		System.out.println("main thread is running....");

	}

}
