
public class ThreadTestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//开启Thread-0
		new Thread()
		{
			public void run()
			{
				for(int x= 0; x<100 ;x++)
				{
					System.out.println(Thread.currentThread().getName()+".."+x);
				}
			}
		}.start();	
		
		//主线程Thread-main
		for(int x= 0; x<100 ;x++)
		{
			System.out.println(Thread.currentThread().getName()+".."+x);
		}
		
		//开启线程Thread-1
		Runnable r = new Runnable()
		{
			public void run()
			{
				for(int x= 0; x<100 ;x++)
				{
					System.out.println(Thread.currentThread().getName()+".."+x);
				}
					
			}
		};
		new Thread(r).start();

	}

}
