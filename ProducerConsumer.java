/*
 * 多个线程同步工作，判断标记用while，唤醒机制用notifyAll。
 */
public class ProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r = new Resource();
		
		Producer pro = new Producer(r);
		Consumer con = new Consumer(r);
		
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

class Resource
{
	private String name;
	private int cnt = 1;
	private boolean flag = false;
	
	public synchronized void set(String name)
	{
		while(flag)
			try{
				wait();
			}catch(Exception e){}
		this.name = name+"--"+cnt++;
		
		System.out.println(Thread.currentThread().getName()+"...生产者.."+this.name);
		flag = true;
		this.notifyAll();
				
	}
	public synchronized void out()
	{
		while(!flag)
			try{
				wait();
			}catch(Exception e){}
		System.out.println(Thread.currentThread().getName()+"...消费者......"+this.name);
		flag = false;
		this.notifyAll();
	}	
}

class Producer implements Runnable
{
	private Resource res;
	Producer(Resource res)
	{
		this.res = res;
		
	}
	public void run()
	{
		while(true)
		{
			res.set("+商品+");
		}
	}
}

class Consumer implements Runnable
{
	private Resource res;
	Consumer(Resource res)
	{
		this.res = res;
	}
	public void run()
	{
		while(true)
		{
			res.out();
		}
	}
	
}