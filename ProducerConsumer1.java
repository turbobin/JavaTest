import java.util.concurrent.locks.*;
/*
 * JDK1.5中提供了对多线程升级解决方案。
 * 将同步Synchronized替换成显示Lock操作
 * 将Object中的wait，notify，notifyAll，替换成了Condition对象。
 * 该对象可以Lock锁 进行获取。
 * 该实例中，实现了本方只唤醒对方线程操作。
 */
public class ProducerConsumer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource1 r = new Resource1();
		
		Producer1 pro = new Producer1(r);
		Consumer1 con = new Consumer1(r);
		
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(pro);
		Thread t3 = new Thread(con);
		Thread t4 = new Thread(con);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		

	}

}

class Resource1
{
	private String name;
	private int cnt = 1;
	private boolean flag = false;
	
	private Lock lock = new ReentrantLock();
	private Condition condition_pro = lock.newCondition();
	private Condition condition_con = lock.newCondition();
	
	public void set(String name)throws InterruptedException
	{
		lock.lock();
		try
		{
			while(flag)
				condition_pro.await();
			this.name = name+"--"+cnt++;
			
			System.out.println(Thread.currentThread().getName()+"...生产者.."+this.name);
			flag = true;
//			condition.signalAll(); //唤醒全部线程
			condition_con.signal(); //只唤醒对方线程
		}finally
		{
			lock.unlock();//释放锁的动作一定要执行
		}
		
	}
	public void out()throws InterruptedException
	{
		lock.lock();
		try
		{
			while(!flag)
				condition_con.await();
			System.out.println(Thread.currentThread().getName()+"...消费者......"+this.name);
			flag = false;
			condition_pro.signal();
		}finally{
			lock.unlock();
		}
		
		
	}	
}

class Producer1 implements Runnable
{
	private Resource1 res;
	Producer1(Resource1 res)
	{
		this.res = res;
		
	}
	public void run()
	{
		while(true)
		{
			try {
				res.set("+商品+");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumer1 implements Runnable
{
	private Resource1 res;
	Consumer1(Resource1 res)
	{
		this.res = res;
	}
	public void run()
	{
		while(true)
		{
			try {
				res.out();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}