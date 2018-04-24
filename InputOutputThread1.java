/*
 * 对InputOutputThread程序的代码优化
 */
class Res1
{
	private String name;
	private String sex;
	private boolean flag = false;
	public synchronized void setVer(String name,String sex)
	{
		if(flag)
		{
			try {
				this.wait();	//必须标明监视器（锁）
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
			}
		}
		this.name = name;
		this.sex = sex;
		flag=true;
		this.notify();
	}
	public synchronized void out()
	{
		if(!flag)
		{
			try {
				this.wait();	//必须标明监视器（锁）
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
			}
		}
		System.out.println(name+"..."+sex);
		flag=false;
		this.notify();
	}
}
class Input1 implements Runnable
{
	private Res1 r;
	Input1(Res1 r)
	{
		this.r = r;
	}
	public void run()
	{
		int x = 0;
		while(true)
		{
			if(x==0)
				r.setVer("mike","male");
			else
				r.setVer("莉莉","女");
			x= (x+1)%2;
		
		}
	}
}
class Output1 implements Runnable
{
	private Res1 r;
	Output1(Res1 r)
	{
		this.r = r;
	}
	public void run()
	{
		while(true)
		{
			r.out();
		}
	}
}		
public class InputOutputThread1 {
	public static void main(String[] args) 
	{
		Res1 r = new Res1();
		new Thread(new Input1(r)).start();
		new Thread(new Output1(r)).start();
/*		
		Input1 in = new Input1(r);
		Output1 out = new Output1(r);
		
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		t1.start();
		t2.start();
		*/
	}

}
