/*
 * 基础班学生：
 * 	学习，睡觉。
 * 高级版学生：
 * 	学习，睡觉。
 * 
 * 可以将这两类事物进行抽取。
 */

abstract class Student1
{
	public abstract void study();
	public void sleep()
	{
		System.out.println("躺着睡");
	}
}

//将对象的功能封装成一个类，提高代码的扩展性。
class DoStudent1
{
	public void dosome(Student1 s)
	{
		s.study();
		s.sleep();
	}
}

class BaseStudent1 extends Student1
{
	public void study()
	{
		System.out.println("base study");
	}
	public void sleep()
	{
		System.out.println("趴着睡");
	}
}

class AdvStudent1 extends Student1
{
	public void study()
	{
		System.out.println("advance study");
	}
	
}
public class DuoTaiDemo1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		Student1 a = new AdvStudent1();
//		a.study();
//		a.sleep();
//		DoSomething(a);
//		DoSomething(new BaseStudent1());
		
		DoStudent1 stu = new DoStudent1(); 
		stu.dosome(new BaseStudent1());
		stu.dosome(new AdvStudent1());

	}
	//可以将功能进行提升，封装成一个类，调用该类即可使用该功能，提高扩展性
	/*
	public static void DoSomething(Student1 s)
	{
		s.study();
		s.sleep();

	}
	*/
}
