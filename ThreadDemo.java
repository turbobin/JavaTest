/*
 * 进程：是一个正在执行中的程序。
 * 		每一个进程执行都有一个执行顺序。该顺序是一个执行路径，或者叫一个控制单元。
 * 
 * 线程：就是进程中的一个独立的控制单元。
 * 		线程在控制着进程的执行。
 * 一个进程中至少有一个线程。
 * 
 * 创建线程的第一种方式：继承Thread类。
 * 步骤：
 * 1，定义类继承Thread
 * 2，复写Thread类中的run方法
 * 		目的：将自定义代码存储在run方法中，让线程运行。
 * 3，调用线程的start方法，
 * 	该方法两个作用:启动线程，调用run方法。
 * 
 * 发现运行结果每一次都不同。
 * 因为多个线程都获取CPU的执行权，执行到谁，谁就运行。
 * 明确一点：在你某一个时刻，只能有一个程序在运行（多核除外）
 * CPU在做着快速的切换，以达到看上去是同时运行的效果。
 * 
 *  我们可以形象把多线程的运行行为看成在互相抢夺CPU的执行权。
 *  
 *  这就是多线程的一个特性：随机性
 */

class DemoA extends Thread
{
	public void run()		//run方法用于存储线程要运行的代码
	{
		for(int i=0; i<=60; i++)
			System.out.println("DemoA run.."+i);
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoA d = new DemoA();
		d.start();	//开启线程并执行该线程的run方法
//		d.run();	//创建了线程，并没有执行子线程，而是主线程调用。
		for(int k=0;k<=60; k++)
			System.out.println("main run.."+k);

	}

}
