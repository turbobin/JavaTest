/*
 * 练习：创建两个线程，和主线程交替运行
 * 
 * 如果没有指定名称，线程会有自己默认的名称：
 * Thread-编号（从0开始）
 * 
 * static Thread currentThread():获取当前线程对象
 * getName()：获取当前线程名称。
 * 
 * 设置线程名称：setName()或者构造函数
 */

class TestA extends Thread
{
//	private String name;
	TestA(String name)
	{
//		super(name);
//		this.name = name;
	}
	public void run()	
	{
		for(int i=0; i<=60; i++)
//			System.out.println(this.getName()+" test run.."+i);
			System.out.println(Thread.currentThread().getName()+" test run.."+i);
	}
}
public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestA t1 = new TestA("one");
		t1.start();
		TestA t2 = new TestA("two");
		t2.start();
		
		for(int k=0;k<=60; k++)
			System.out.println("main run.."+k);

	}

}
