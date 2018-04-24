/*
 * 内部类定义在局部时，
 * 1，不可以被成员修饰符修饰
 * 2，可以直接访问外部类中的成员，因为还持有外部类中的引用
 * 		但是不可以访问它所在的局部中的变量，只能访问被final修饰的局部变量。
 */
class Outer
{
	int x = 3;
	void method(final int a)
	{
//		int x = 4;
		final int y= 4;
		class Inner
		{
			void function()
			{
				System.out.println(Outer.this.x+a+y);
			}
		}
		new Inner().function();
	}
}

public class InnerClassDemo1 {

	public static void main(String[] args) {
		new Outer().method(7);
		new Outer().method(8);

	}

}
