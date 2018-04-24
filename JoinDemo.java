/*
 * join()方法：
 * 当A线程执行到了B线程的join()方法时，A就会等待，B线程执行完A才会执行。
 * 
 * join可以用来临时加入线程执行。
 */
 
class threadDemoA implements Runnable
{
	public void run()
	{
		for (int x=0; x<70; x++)
		{
			System.out.println(Thread.currentThread().toString()+"..."+x);
			// toString:返回该线程的字符串表示形式，包括线程名称、优先级和线程组。
			
			Thread.yield();	//暂停当前正在执行的线程对象，并执行其他线程。
		}
	}
}
public class JoinDemo {

	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
		threadDemoA t = new threadDemoA();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		
		t1.setPriority(Thread.MAX_PRIORITY); //设置该线程为最大优先级
//		t1.join();	//主线程会等待t1执行完才开始执行。
		
		t2.start();
		
		for(int x=0; x<60; x++)
		{
			System.out.println("main..."+x);
		}
		System.out.println("over");

	}

}
