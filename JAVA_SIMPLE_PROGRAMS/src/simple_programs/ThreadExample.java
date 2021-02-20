/*Threads allows a program to operate more efficiently by doing multiple things at the same time.

Threads can be used to perform complicated tasks in the background without interrupting 
the main program.*/

/*Creating a Thread
There are two ways to create a thread.

It can be created by extending the Thread class and overriding its run() method:

Extend Syntax
public class Main extends Thread {
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
Another way to create a thread is to implement the Runnable interface:

Implement Syntax
public class Main implements Runnable {
  public void run() {
    System.out.println("This code is running in a thread");
  }
}*/




/*Write a program to create two threads. The first thread should print numbers from 1 to 10
  at intervals of 0.5 second and the second thread should print numbers from 11 to 20 at the
 interval of 1 second.*/

package simple_programs;

class ThreadA extends Thread {
	@Override
	public void run() {
		System.out.println("Thread A Runnning");
		for (int i = 0; i < 10; i++) {

			System.out.println(i + "");
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}

}

class ThreadB extends Thread {
	@Override
	public void run() {
		System.out.println("Thread B Runnning");
		for (int i = 10; i < 20; i++) {

			System.out.println(i + "");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB();
		
		t1.run();
		t2.run();
		
//		using priority
//		t1.setPriority(Thread.MAX_PRIORITY);
//		t2.setPriority(Thread.NORM_PRIORITY);
//		t1.start();
//		t2.start();
		
	}

}
