/*
 * ��̬����飺������������������ִֻ��һ�Σ����ڸ�����г�ʼ����
 * 
 * ����ִ��˳��
 * δ��������ʱ���������еľ�̬�����->������
 * �����˶����������еľ�̬�����->������(��������)->�����еľ�̬�����->��������->���캯�����������غ�����
 */

class StaticCode
{
	StaticCode()
	{
		System.out.println("ִ�й��캯��");
		
	}
	static
	{
		System.out.println("a");
		show();		//StaticCode.show();
	}
	
	{
//		this.show();	//this.show();��δ��������ʱ��������Ч
		System.out.println("ִ�й�������");
		
	}
	
	StaticCode(int x)
	{
		System.out.println("ִ�к���������");
		
	}
	private static void show()		//���óɲ��������ֱ�ӵ���
	{
		System.out.println("show run");
	}
}

public class StaticCodeDemo {
	static
	{
		System.out.println("b");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new StaticCode();
//		new StaticCode(); //��ִ�С� ��̬�����ִֻ��һ�Ρ�
		System.out.println("main");
//		new StaticCode();
		
//		StaticCode.show();
//		new StaticCode(4);

	}
	
	static
	{
		System.out.println("c");
	}

}
