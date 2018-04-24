/*
 * ��ϰ����һ��Բ�κͳ����Σ������Ի�ȡ�����
 * �������������ַǷ�����ֵ ����Ϊ�ǻ�ȡ����������⡣
 * ����ͨ���쳣����ʾ��
 */

class NovalueException extends RuntimeException	// Exception 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	NovalueException(String msg) {
		super(msg);
	}
}

interface shape {
	public abstract void getArea();
}

class Rec implements shape {
	private int len, wid;

	Rec(int len, int wid) 	//throws NovalueException 
	{
		if (len <= 0 || wid <= 0) {
			throw new NovalueException("������ֵ�Ƿ�");
		}
		this.len = len;
		this.wid = wid;
	}

	public void getArea() {
		System.out.println(len * wid);
	}
}

class Circle implements shape {
	private int radius;
	public static final double PI = 3.14;

	Circle(int radius)throws RuntimeException 	//����������RuntimeExceptionʱ�����Բ��ý��д��� 
	{
		if (radius<= 0) {
			throw new RuntimeException("�뾶��ֵ�Ƿ�");
		}
		this.radius = radius;
	}

	public void getArea() {
		System.out.println(PI*radius*radius);
	}
}
public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			Rec r = new Rec(4, -6);
//			r.getArea();
//		} catch (NovalueException e) {
//			System.out.println(e.toString());
//
//		}
		Rec r = new Rec(4, 6);
		r.getArea();
		
		Circle c = new Circle(-4);
		c.getArea();
		System.out.println("pgm over");
		

	}

}
