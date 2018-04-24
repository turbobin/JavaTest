/*
 * stop �����Ѿ���ʱ������ʹ�á�
 * 
 * ���ֹͣ�߳�?
 * ֻ��һ�֣�run����������
 * �������߳����У����д���ͨ����ѭ���ṹ��
 * ֻҪ����סѭ�����Ϳ�����run����������Ҳ�����߳̽�����
 * 
 * ���������
 * ���̴߳����˶���״̬���Ͳ����ȡ����ǣ���ô�߳̾Ͳ��������
 * 
 * ��û��ָ���ķ�ʽ�ö�����ָ̻߳�������״̬ʱ����ʱ��Ҫ�Զ���״̬���������
 * ǿ�����ָ̻߳�������״̬�������������Բ���������߳̽�����
 * Thread���ṩ�÷��� interrupt();
 */
class StopThread implements Runnable
{
	private boolean flag = true;
	public synchronized void run()
	{
		while(flag)
		{
			try
			{
				wait();
			}catch(InterruptedException e)
			{
				flag = false;
				System.out.println(Thread.currentThread().getName()+"..Exception");
			}
			System.out.println(Thread.currentThread().getName()+" run...");
		}
	}
	
	public void changeFlag()
	{
		flag = false;
	}
}
public class StopThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StopThread st =new StopThread();
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);
		
//		t1.setDaemon(true);	//��Ǹ��߳�Ϊ�ػ��߳�
//		t2.setDaemon(true);	
		t1.start();
		t2.start();
		
		int num = 0;
		while(true)
		{
			if(num++ ==50)
			{
//				st.changeFlag();
				t1.interrupt();
				t2.interrupt();
				break;
			}
			System.out.println(Thread.currentThread().getName()+"....."+num);
		}
		System.out.println("over");

	}

}
