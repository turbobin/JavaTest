/*
 * 接口：初期理解，可以认为是一个特殊的抽象类
 * 	当抽象类中的方法都是抽象的，那么该类可以通过接口的形式来表示。
 * class用于定义类
 * interface用于定义接口。
 * 
 * 接口定义时，格式特点：
 * 1，接口中常见定义：常量，抽象方法。
 * 2，接口中的成员都有固定修饰符。
 * 	常量：public static final
 * 	方法：public abstract
 * 注：接口中的成员都是public的。
 * 
 * 接口：不可以创建对象，因为有抽象方法。
 * 需要被子类实现，子类对接口中的抽象方法全部覆盖后，子类才可以实例化，
 * 否则子类是一个抽象类。
 * 
 */

interface Inter
{
	int NUM = 3;	//可省略public static final修饰
	public abstract void show();//可省略public abstract修饰
}

interface InterA
{
	public abstract void show1();
}

class Demo
{
	public void function() {}
}

class Test extends Demo implements Inter,InterA
//类在继承一个类的同时，可以同时继承（实现）多个接口
{
	public void show() {}
	public void show1() {}
	
}
/*类之间只能单继承，而接口之间支持多继承*/
//interface A
//{
//	void methodA();
//}
//interface B //extends A
//{
//	void methodB();
//}
//interface C	extends B,A	//接口之间可以多继承。
//{
//	void methodC();
//}
//
//class D implements C
//{
//	public void methodA() {}
//	public void methodB() {}
//	public void methodC() {}
//}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Test t = new Test();
		System.out.println(t.NUM);
		System.out.println(Test.NUM);
		System.out.println(Inter.NUM);

	}

}
