/*
 * 内部类的访问规则：
 * 1，内部类可以直接访问外部类中的成员，包括私有（因为私有只对外部类生效）
 * 	之所以可以直接访问外部类中的成员，是因为内部类中持有了一个外部类的引用，格式：外部类名.this
 * 2，外部类要访问内部类，必须建立内部类对象。
 * 
 * 访问内部类格式：
 * 1, 当内部类定义在成员的位置上，而且非静态，非私有，可以在主类中建立内部类对象
 * 格式：外部类名.内部类名  变量名 = new 外部类名().new 内部类名();
 * 		 OutClass.InClass in = new OutClass().new InClass();
 *2，当内部类定义在成员的位置上，
 * 被private修饰时，内部类被封装，须在外部类中定义访问方法（间接访问）。
 * 
 * 被static修饰时，只能直接访问外部类中的静态成员，出现了访问局限。
 * 在主类中直接访问static内部类中的非静态成员 ：new OutClass.InClass().function();
 * 在主类中直接访问static内部类中的静态成员 ：OutClass.InClass.function();
 * 
 * 注意：当内部类中定义了静态成员，该内部类必须是static的，
 * 		当外部类中的静态方法访问内部类时，内部类也必须是static。
 */

class OutClass
{
	private int x = 3;
	
	class InClass	//内部类
	{
		int x = 4;
		void function()
		{
			int x = 5;
			System.out.println("function..."+x);//打印 5
			System.out.println("function..."+this.x);//打印 4
			System.out.println("function..."+OutClass.this.x);//打印 3
			method();
		}
	}
	void method()
	{
		System.out.println("method..."+x);
	}
	
	void getInClass()
	{
		InClass in = new InClass();
		in.function();
	}
}
public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//如何访问内部类中的成员？
		//方法一：创建外部类对象，在外部类中建立访问内部类的方法
		OutClass out = new OutClass();
		out.getInClass();
		
//		new OutClass.InClass().function();//当x变量和内部类都被static修饰时，调用内部类方法方式
		//方法二：创建内部类对象，直接访问(内部类权限不为private,且非静态时)
		OutClass.InClass in = new OutClass().new InClass();//先有外部类，才有内部类
		in.function();
		
		

	}

}
