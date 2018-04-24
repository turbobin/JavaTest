/*
 * 静态代码块：优先于主函数，并且只执行一次，用于给类进行初始化。
 * 
 * 理清执行顺序：
 * 未创建对象时：主函数中的静态代码块->主函数
 * 创建了对象：主函数中的静态代码块->主函数(创建对象)->对象中的静态代码块->构造代码块->构造函数（构造重载函数）
 */

class StaticCode
{
	StaticCode()
	{
		System.out.println("执行构造函数");
		
	}
	static
	{
		System.out.println("a");
		show();		//StaticCode.show();
	}
	
	{
//		this.show();	//this.show();当未创建对象时，调用无效
		System.out.println("执行构造代码块");
		
	}
	
	StaticCode(int x)
	{
		System.out.println("执行函数的重载");
		
	}
	private static void show()		//设置成不允许对象直接调用
	{
		System.out.println("show run");
	}
}

public class StaticCodeDemo {
	static
	{
		System.out.println("b");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new StaticCode();
//		new StaticCode(); //不执行。 静态代码块只执行一次。
		System.out.println("main");
//		new StaticCode();
		
//		StaticCode.show();
//		new StaticCode(4);

	}
	
	static
	{
		System.out.println("c");
	}

}
