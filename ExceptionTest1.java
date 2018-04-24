/*
 * 练习：有一个圆形和长方形，都可以获取面积。
 * 对于面积如果出现非法的数值 ，视为是获取面积出现问题。
 * 问题通过异常来表示。
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
			throw new NovalueException("长或宽的值非法");
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

	Circle(int radius)throws RuntimeException 	//函数上声明RuntimeException时，可以不用进行处理 
	{
		if (radius<= 0) {
			throw new RuntimeException("半径的值非法");
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
