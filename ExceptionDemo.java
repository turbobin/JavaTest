/*
 * 1.�쳣�����ǳ���������ʱ���ֲ������������
 * 2.�쳣����������Ҳ����ʵ������һ����������Ҳ����ͨ��java�������ʽ��������������װ�ɶ���
 * 		��java�Բ������������������Ķ������֡�
 * 
 * ��������Ļ��ַ�Ϊ���֣����ص����⣬�����ص�����
 * ���صģ�javaͨ��Error���������
 * 		����Errorһ�㲻��д����ԵĴ��������д���
 * �����صģ�javaͨ��Exception�����������
 * 		����Exception����ʹ������ԵĴ���ʽ����
 * ����Error����Exception������һЩ�������ݡ�
 * ���� �������������Ϣ������ԭ��ȡ�
 * ���ǿ������ϳ�ȡ��һ����ϵ��
 * 
 * Throwable
 * 		|--Error
 * 		|--Exception
 * 3.�쳣�Ĵ���
 * java�ṩ�����е������д���
 * try
 * {
 * 		��Ҫ�����Ĵ��룻 
 * }
 * catch���쳣�� ������
 * {
 * 		�����쳣�Ĵ��룻  
 * }
 * finally
 * {
 * 		һ����ִ�е���䣻  
 * }
 * 
 * 4.�Բ��񵽵��쳣������г�������������
 * 	String() ,getMessage()����ȡ�쳣��Ϣ��
 *  printStackTrace():��ӡ�쳣�Ķ�ջ�е�ȫ����Ϣ
 */

class Demo1
{
	public int Div(int a,int b)throws Exception 
		//�ڹ�����ͨ��throws�ؼ��������˸ù����п��ܳ������⣬����øù���ʱ������в�׽�����׳�
	{
		return a/b;	//new ArithmeticException();
	}
}
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Demo1 x = new Demo1();
//		int y=x.Div(5, 0);	//�쳣��java.lang.ArithmeticException: / by zero
//		System.out.println("y="+y);
		try
		{
			int y=x.Div(5, 0); //new ArithmeticException();
			System.out.println("y="+y);
		}catch(Exception e) 	//Exception e = new ArithmeticException();
		{
			e.printStackTrace();//�쳣���ƣ��쳣��Ϣ	�쳣���ֵ�λ��
			//jvm�쳣�Ĵ�����ƣ�����printStackTrace��������ӡ�쳣�Ķ�ջ�е���Ϣ
			
			System.out.println(e.toString());//�쳣���ƣ��쳣��Ϣ
			System.out.println(e.getMessage()+":���ﱻ��������");
//			return;			//"over"��ִ��
//			System.exit(0); //�����˳���������رգ�"finally"��ִ��
		}
		finally
		{
			System.out.println("finally..");
		}
		System.out.println("over");
	

	}

}
