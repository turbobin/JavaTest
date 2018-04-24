/*
 * Exception����һ������������쳣RuntimeException ����ʱ�쳣��
 * ����ں������ݣ�throw���׳����쳣�������Ͽ��Բ�������������һ��ͨ����
 * ����ں����ϣ�throws�������˸��쳣�������߿��Բ��ý��д����������ͨ����
 * 
 * ֮���Բ����ٺ���������������Ϊ����Ҫ�õ����ߴ���
 * �����쳣������ϣ������ֹͣ����Ϊ������ʱ���������޷���������������ϣ��ֹͣ�����
 * �Դ������������
 * 
 * �����쳣�����֣�
 * 1������ʱ�������쳣
 * 2������ʱ���������쳣������ʱ�쳣��RuntimeException�Լ����ࣩ
 */
class NegtivException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//�Զ����쳣ʱ��������쳣�������޷��ټ������㣬���ø��Զ����쳣�̳�RuntimeException
	NegtivException(String msg)
	{
		super(msg);
	}
}
class Demo4
{
	int Div(int a,int b)
	{
		if(b<0)
			throw new NegtivException("�����˱�����Ϊ���������");
		if(b==0)
			throw new ArithmeticException("�������");
		return a/b;
	}
}
public class ExceptionDemo3 
{
	public static void main(String [] args)
	{
		Demo4 d = new Demo4();
		int x = d.Div(5, -1);
		System.out.println("x="+x);
		System.out.println("PGM over");
	}

}
