/*�Զ����쳣��
 * ��Ϊ��Ŀ�л�������е����⡣����Щ���Ⲣδ��java����������װ����
 * ���Զ�����Щ���е�������԰���java�������װ��˼�룬�����е���������Զ�����쳣��װ��
 * 
 * �����ڱ������У����ڱ������Ǹ����ģ�Ҳ��Ϊ���쳣�����
 * ��ô����Ҫ�������������Զ����������
 * 
 * ���ں����ڲ�������throw�׳��쳣������ô�ͱ���Ҫ����Ӧ�Ĵ�����
 * Ҫô���ڲ�try catch����
 * Ҫô�ں����������õ����ߴ���
 * 
 * һ������£������ڳ����쳣����������Ҫ������
 * 
 * ����Զ����쳣��Ϣ��
 * ��Ϊ�������Ѿ����쳣��Ϣ�Ĳ���������ˣ���������ֻҪ�ڹ���ʱ�����쳣��Ϣ���ݸ����ࣨͨ��super��䣩��
 * ��ô�Ϳ���ֱ��ͨ��getMassage������ȡ�Զ�����쳣��
 * 
 * ע���Զ����쳣�������Զ�����̳�Exception
 * ԭ��
 * �쳣��ϵ����һ���ص㣺�쳣����쳣���󶼱��׳�
 * ���Ƕ��߱������ԣ���������Throwable��ϵ�ж��е��ص㡣
 * ֻ�������ϵ�е���Ͷ���ſ��Ա�throw��throws������
 */

class NegativeException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	NegativeException(String msg)
	{
		super(msg);
	}
	
}
class Demo3
{
	int Div(int a,int b)throws NegativeException
	{
		if(b<0)
			throw new NegativeException("�����˱������Ǹ��������---by:"+b);
		//�ֶ�ͨ��throw�ؼ����׳�һ���Զ�����쳣����
		return a/b;
		
		/*
		 * throws:ʹ���ں����ϣ�����쳣�࣬�ɸ�������ö��Ÿ���
		 * throw��ʹ���ں����ڣ�����쳣���󡣵�������ʱ�����治Ҫ������䣬��Ϊִ�в���
		 */
		
	}
}
public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Demo3 x = new Demo3();
		try
		{
			int y=x.Div(5, -2); 
			System.out.println("y="+y);
		}catch(NegativeException e)
		{
			System.out.println(e.toString());
		}
		
		System.out.println("PGM Over");

	}

}
