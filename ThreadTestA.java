
public class ThreadTestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����Thread-0
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
		
		//���߳�Thread-main
		for(int x= 0; x<100 ;x++)
		{
			System.out.println(Thread.currentThread().getName()+".."+x);
		}
		
		//�����߳�Thread-1
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
