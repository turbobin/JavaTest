/*
 * ��ϰ
 */
interface InterC
{
	public void method();
}

class OutTest
{
//	static class InTest implements InterC
//	{
//		public void method()
//		{
//			System.out.println("method run..");
//		}
//	}
	//�����������������������롣��ͨ�������ڲ��ࣩ
	static InterC function()	//Ҫʹ��̬�������÷Ǿ�̬��Ա�����봴������������
	{
		return new InterC()	//����һ�������ڲ���
		{
			public void method()
			{
				System.out.println("method run..");
			}
		};
	}
	
}
public class InnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutTest.function().method();
		//OutTest.function():OutTest�����и���̬����function
		//.method��function���������������һ��Inter�͵Ķ�����Ϊֻ��Inter���͵Ķ���ſ��Ե���method����

		show(new InterC() 		//�����д�һ�������ڲ������,�������е�����
		{	public void method()
			{
				System.out.println("method show run..");
			}
				
		});
			
		
		
		InnerTest.main(new String[0]);
	}
	public static void show(InterC in)
	{
		in.method();
	}
	
//	���������û�и���ͽӿ�ʱ����Object�����࣬�����÷���
	

}
class InnerTest
{
	public static void main(String[] args)
	{
//		System.out.println(args.length);
		new Object()
		{
			public void function()
			{
				System.out.println("function..");
			}
		}.function();
	}
}
