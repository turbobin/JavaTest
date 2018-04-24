/*
 * private：私有，权限修饰符：用于修饰类中的成员（成员变量，成员函数）。
 * 私有 只在本类中有效。
 * 
 * 将age私有化以后，类以外即使建立了对象也不能直接访问，需要在Person类中提供公共访问方式
 * 
 * 注：私有 仅仅是封装的一种表现形式。
 */

class Person
{
	
	private int age;
	public void setAge(int a)
	{
		if (a>0 & a<130)
		{
			age = a;
			speak();
		}
		else
			System.out.println("年龄非法");
	}
	
	public int getAge()
	{
		return age;
	}
	
	void speak()
	{
		System.out.println("age="+age);
	}
}
public class PersonDemo {

	public static void main(String[] args) {
		Person p = new Person();		
//		p.age = 20;
//		p.speak();
		p.setAge(140);
		p.setAge(40);
		p.speak();

	}

}
