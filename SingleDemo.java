/*
 * 设计模式:解决某一类问题最行之有效的方法。
 * Java中有23中设计模式：
 * 
 * 单例设计模式：解决一个类在内存只存在一个对象的问题。
 * 
 * 
 * 想要保证对象唯一：
 * 1.为了避免其他程序过多的建立该类对象，先禁止其他程序建立该对象。	-->将构造函数私有化。
 * 2.但为了让其他程序可以访问到该类对象，只好在本类中自定义一个对象。 -->在类中创建一个本类对象。
 * 3.为了方便其他程序对自定义对象的访问，可以对外提供一些访问方式。	-->提供一个方法可以获取到该对象。 
 */

class Single
{
	private Single(){}
	
	private static Single s = new Single();
	public static Single getInstance()
	{
		return s;
	}
	
	private int age;
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
	
}
public class SingleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		s1.setAge(23);
		System.out.println(s2.getAge());	//证明s2和s1引用的是同一个对象

	}

}
