/*
 * ���󣺼򵥵���Ʊ����
 * ��� ����ͬʱ��Ʊ��
 * 
 * �����̵߳ĵڶ��ַ�ʽ:ʵ��Runnable�ӿ�
 * ���裺
 * 1��������ʵ��Runnable�ӿ�
 * 2������Runnable�ӿ��е�run������
 * 		���߳�Ҫ���еĴ������ڸ�run�����С�
 * 3��ͨ��Thread�ཨ���̶߳���
 * 4����Runnable�ӿڵ����������Ϊʵ�ʲ������ݸ�Thread��Ĺ��캯����
 * 5.����Thread���start���������̲߳�����Runnable�ӿ������run������
 * 
 * ʵ�ַ�ʽ�ͼ̳з�ʽ����
 * ʵ�ַ�ʽ�ô��������˵��̳еľ����ԡ�
 * �ڶ����߳�ʱ������ʹ��ʵ�ַ�ʽ��
 * 
 * �̳�Thread���̴߳�������Thread����run�����С�
 * ʵ��Runnable���̴߳������ڽӿڵ�����run�����С�
 */
class Ticket implements Runnable//extends Thread
{
//	private static int ticket = 100;
	private int ticket = 100;
	public void run()
	{
		while(ticket>0)
		{
			if(ticket>0)
			{
				System.out.println(Thread.currentThread().getName()+" sale.."+ ticket--);
			}
		}
	}
}

public class ThreadTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Ticket t1 = new Ticket();
		Ticket t2 = new Ticket();
		Ticket t3 = new Ticket();
		Ticket t4 = new Ticket();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		*/
		Ticket t = new Ticket();
		Thread t1 = new Thread(t);	//�����̶߳���
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
