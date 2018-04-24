import java.util.concurrent.locks.*;
/*
 * JDK1.5���ṩ�˶Զ��߳��������������
 * ��ͬ��Synchronized�滻����ʾLock����
 * ��Object�е�wait��notify��notifyAll���滻����Condition����
 * �ö������Lock�� ���л�ȡ��
 * ��ʵ���У�ʵ���˱���ֻ���ѶԷ��̲߳�����
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
			
			System.out.println(Thread.currentThread().getName()+"...������.."+this.name);
			flag = true;
//			condition.signalAll(); //����ȫ���߳�
			condition_con.signal(); //ֻ���ѶԷ��߳�
		}finally
		{
			lock.unlock();//�ͷ����Ķ���һ��Ҫִ��
		}
		
	}
	public void out()throws InterruptedException
	{
		lock.lock();
		try
		{
			while(!flag)
				condition_con.await();
			System.out.println(Thread.currentThread().getName()+"...������......"+this.name);
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
				res.set("+��Ʒ+");
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