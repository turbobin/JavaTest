/*
 * ��ϰ�����������̣߳������߳̽�������
 * 
 * ���û��ָ�����ƣ��̻߳����Լ�Ĭ�ϵ����ƣ�
 * Thread-��ţ���0��ʼ��
 * 
 * static Thread currentThread():��ȡ��ǰ�̶߳���
 * getName()����ȡ��ǰ�߳����ơ�
 * 
 * �����߳����ƣ�setName()���߹��캯��
 */

class TestA extends Thread
{
//	private String name;
	TestA(String name)
	{
//		super(name);
//		this.name = name;
	}
	public void run()	
	{
		for(int i=0; i<=60; i++)
//			System.out.println(this.getName()+" test run.."+i);
			System.out.println(Thread.currentThread().getName()+" test run.."+i);
	}
}
public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestA t1 = new TestA("one");
		t1.start();
		TestA t2 = new TestA("two");
		t2.start();
		
		for(int k=0;k<=60; k++)
			System.out.println("main run.."+k);

	}

}
