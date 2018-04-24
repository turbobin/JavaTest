/*
 * 匿名内部类：
 * 1，匿名内部类其实就是内部类的简写形式。
 * 2，定义匿名内部类的前提：
 * 	内部类必须是继承一个类或者实现接口。
 * 3，匿名内部类的格式：new 父类或接口(){定义子类的内容}
 * 4，匿名内部类就是一个匿名子类对象，可以理解为带内容的对象。
 * 5，匿名内部类中定义的方法最好不要超过3个。
 */

abstract class AbsDemo
{
	abstract void show();
}

class OuterClass
{
	int x= 3;
//	class InnerClass extends AbsDemo
//	{
//		void show()
//		{
//			System.out.println("show:"+x);
//		}
//	}
	
	public void function()
	{
//		new InnerClass().show();
		
		new AbsDemo() 	//匿名内部类，用父类来创建对象
		{
			void show()	//子类内容
			{
				System.out.println("x="+x);
			}
			void abc()
			{
				System.out.println("hha");
			}
		}.abc();
		AbsDemo d = new AbsDemo() 	//匿名内部类，用父类来创建对象，并指定对象名
		{
			void show()	//子类内容
			{
				System.out.println("x="+x);
			}
			void abc()
			{
				System.out.println("hha");
			}
		};
		d.show();
//		d.abc()	//编译失败，父类型中没有此方法，不可调用
	}
}
public class InnerClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new OuterClass().new InnerClass().show();
		new OuterClass().function();

	}

}
