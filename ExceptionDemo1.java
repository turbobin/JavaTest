/*
 * �Զ��쳣�Ĵ���
 * 1.�����쳣ʱ������������Ϊ������쳣����������ĸ����塣
 * 2.�Է����������쳣���Ͷ�Ӧ�м���catch�飬��Ҫ��������catch��
 * 	������catch���е��쳣���ּ̳й�ϵ�������쳣catch����������棬�������ʧ�ܡ�
 * 
 * �����ڽ���catch�鴦��ʱ��catch��һ��Ҫ������崦��ʽ��
 * ��Ҫ�򵥶���һ��e.printStackTrace()��Ҳ��Ҫ����дһ��������
 * һ��Ὠһ���ļ�����ӡ�쳣��־
 * 
 * �쳣���Ӹ��า���е����֣�
 * 1�����า�Ǹ���ʱ���������ķ����׳��쳣����ô����ĸ��Ƿ���ֻ���׳�������쳣
 * 	���߸��쳣�������쳣��
 * 2��������෽���׳�����쳣����ô�����ڸ��Ǹ÷���ʱ��ֻ���׳������쳣���Ӽ���
 * 3�����������߽ӿڵķ�����û���쳣�׳�����ô�����ڸ��Ƿ���ʱ��Ҳ�������׳��쳣��
 * 	������෽���������쳣���ͱ���Ҫ����try�������Բ����ס�
 */

class Demo2
{
	public int Div(int a,int b)throws ArithmeticException,
							ArrayIndexOutOfBoundsException
	{
		int [] arr = new int[a];
		System.out.println(arr[5]);
		return a/b;	//new ArithmeticException();
	}
}
public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Demo2 x = new Demo2();
		try
		{
			int y=x.Div(5, 0); //new ArithmeticException();
			System.out.println("y="+y);
		}catch(ArithmeticException e) 	//Exception e = new ArithmeticException();
		{
			System.out.println(e.toString());//�쳣���ƣ��쳣��Ϣ
			System.out.println(e.getMessage()+":���ﱻ��������");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());//�쳣���ƣ��쳣��Ϣ
			System.out.println(e.getMessage()+":����Ǳ�Խ��");
		}
		catch(Exception e)
		{
			System.out.println(e.toString());//�쳣���ƣ��쳣��Ϣ
		}
		
		//���catch��ʱ��ֻ���ӡһ���쳣����Ϊ�������׽���쳣ʱ��������˳���
		
		System.out.println("PGM Over");

	}

}
