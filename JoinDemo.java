/*
 * join()������
 * ��A�߳�ִ�е���B�̵߳�join()����ʱ��A�ͻ�ȴ���B�߳�ִ����A�Ż�ִ�С�
 * 
 * join����������ʱ�����߳�ִ�С�
 */
 
class threadDemoA implements Runnable
{
	public void run()
	{
		for (int x=0; x<70; x++)
		{
			System.out.println(Thread.currentThread().toString()+"..."+x);
			// toString:���ظ��̵߳��ַ�����ʾ��ʽ�������߳����ơ����ȼ����߳��顣
			
			Thread.yield();	//��ͣ��ǰ����ִ�е��̶߳��󣬲�ִ�������̡߳�
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
		
		t1.setPriority(Thread.MAX_PRIORITY); //���ø��߳�Ϊ������ȼ�
//		t1.join();	//���̻߳�ȴ�t1ִ����ſ�ʼִ�С�
		
		t2.start();
		
		for(int x=0; x<60; x++)
		{
			System.out.println("main..."+x);
		}
		System.out.println("over");

	}

}
