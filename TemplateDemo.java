/*
 * ����:��ȡһ�γ�������ʱ�䡣
 * ԭ����ȡ����ʼ�ͽ���ʱ�䲢������ɡ�
 * 
 * ��ȡʱ�䣺����API�ĵ�, ����System.currentTimeMillis();
 * 
 */

abstract class GetTime
{
	public final void getTime()	//Ϊ��ֹ������Ҫ��������д�������η�final
	{
		long starttime = System.currentTimeMillis();
		runcode();
		long endtime = System.currentTimeMillis();
		System.out.println("���룺 "+(endtime-starttime));
	}
	
	public abstract void runcode();	//��������д��벻ȷ�����ɽ����๫�������������
//	public void runcode()
//	{
//		for(int i=1; i<100; i++) 
//		{
//			System.out.print(i+" ");
//			if(i == 99)
//				System.out.println();
//		}
//			
//	}
}

class SubTime extends GetTime
{
	public void runcode()
	{
		for(int i=1; i<=50; i++) 
		{
			System.out.print(i+" ");
			if(i == 50)
				System.out.println();
		}
	}
}
public class TemplateDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new SubTime().getTime();

	}

}
