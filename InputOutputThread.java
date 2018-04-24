/*
 * 线程间通信：
 * 其实就是多个线程操作同一个资源，但是操作的动作不同，比如一个线程执行输入，一个线程输出
 * 
 */
class Res
{
	String name;
	String sex;
	boolean flag = false;
}
class Input implements Runnable
{
	private Res r;
	Input(Res r)
	{
		this.r = r;
	}
	public void run()
	{
		int x = 0;
		while(true)
		{
			synchronized(r)
			{
				if(r.flag)
				{
					try {
						r.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(x==0)
				{
					r.name="mike";
					r.sex="male";
				}
				else
				{
					r.name="莉莉";
					r.sex="女";												
				}
				x= (x+1)%2;
				r.flag=true;
				r.notify();
			}
		}
	}
}
class Output implements Runnable
{
	private Res r;
	Output(Res r)
	{
		this.r = r;
	}
	public void run()
	{
		while(true)
		{
			synchronized(r)
			{
				if(!r.flag)
				{
					try {
						r.wait();	//必须标明监视器（锁）
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(r.name+"..."+r.sex);
				r.flag=false;
				r.notify();
			}
		}
	}
}		
public class InputOutputThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Res r = new Res();
		Input in = new Input(r);
		Output out = new Output(r);
		
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		t1.start();
		t2.start();
	}

}

//notifyAll();唤醒全部线程
/*
wait();
notify();
notifyAll();
都使用在同步中，因为要对持有监视器（锁）的线程操作，所以要使用在同步中，只有同步才具有锁。

这些方法都定义在Object类中，原因：
因为这些方法在操作同步中线程时，都必须要标识它们所操作线程持有的锁，
等待和唤醒必须是同一个锁。
而锁可以是任意对象，所以可以被任意对象调用的方法定义在Object类中。


 */

