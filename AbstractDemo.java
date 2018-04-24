/*
 * 当多个类出现相同功能时，,但是功能主体不同，
 * 这时，可以进行向上抽取，只抽取功能定义，而不抽取功能主体。
 * 
 * 抽象：不具体（的功能）。
 * 
 * 抽象类的特点：
 * 1.抽象方法一定在抽象类中。
 * 2.抽象方法和抽象类都必须被abstract关键字修饰。
 * 3.抽象类不可以用new创建对象，因为调用抽象方法，没有意义。
 * 4.抽象类中的方法要被使用，必须由子类复写其所有的抽象方法后，建立子类对象调用。
 * 	如果子类只覆盖了部分抽象方法，那么该子类还是一个抽象类。
 * 
 * 抽象类不可以实例化。
 * 
 * 特殊：抽象类中可以不定义抽象方法，这样做仅仅是不让该类建立对象。
 */
abstract class Student
{
	abstract void study();
//	abstract void study1();
	static void sleep()		//抽象类中同样可以定义非抽象方法。
	{
		System.out.println("Zzzzz...");
	}
}

class BaseStudent extends Student
{
//	private BaseStudent(){}
	void study()
	{
		System.out.println("base study");
	}
}

class Advstudent extends Student
{
	void study()
	{
		System.out.println("adv study");
	}
}
public class AbstractDemo {

	public static void main(String[] args) 
	{
		new BaseStudent().study();
	    BaseStudent.sleep();//静态调用
		
	}

}
