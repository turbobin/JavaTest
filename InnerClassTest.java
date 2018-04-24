/*
 * 练习
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
	//根据主函数调用情况补足代码。（通过匿名内部类）
	static InterC function()	//要使静态函数调用非静态成员，必须创建对象来调用
	{
		return new InterC()	//返回一个匿名内部类
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
		//OutTest.function():OutTest类中有个静态方法function
		//.method：function这个方法运算结果是一个Inter型的对象，因为只有Inter类型的对象才可以调用method方法

		show(new InterC() 		//参数中传一个匿名内部类参数,大括号中的内容
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
	
//	特殊情况：没有父类和接口时，用Object做父类，来调用方法
	

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
