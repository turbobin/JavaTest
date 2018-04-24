/*构造函数：
 * 用于给对象进行初始化
 */
class Person_1		//同一个包下，类名不能重复。
{
	/*构造代码块。
	 * 作用：给对象进行初始化。
	 * 对象一建立就运行，而且优先于构造函数执行
	 * 
	 * 与构造函数的区别：
	 * 构造代码块是给所有的对象进行统一初始化，而构造函数是给对应的对象初始化。
	 * 
	 * 构造代码块中定义的是不同对象共性的初始化内容。
	 */
		
	private String name;
	private int age;
	
	{
		System.out.println("----------------");
		System.out.println("first:name="+name+",age="+age);
		System.out.println("person code run!");
	}
	
	Person_1()		//构造函数，名字和类相同。不定义时，默认为空参数的类 Person_1(){}
	{
		System.out.println("A:name="+name+",age="+age);
	}
	
	Person_1(String name)		//构造函数可重载
	{
		this.name = name;
		System.out.println("B:name="+name+",age="+age);
	}
	
	Person_1(String name,int age)		
	{
		this(name); //此语句 用于构造函数间调用，this代表调用此函数的对象。只能放在第一行
		//this.age = age;
		System.out.println("C:name="+name+",age="+age);
	}
	
	public void getName()
	{
		System.out.println("name="+name);
	}
	
	void setName(String name)
	{
		this.name = name;  //this:用于区分局部变量和成员变量同名的情况
	}
}
	
public class PersonDemo1 {

	public static void main(String[] args) {
		Person_1 p1 = new Person_1(); //只执行一次
		Person_1 p2 = new Person_1("张小三");
		Person_1 p3 = new Person_1("李四",1);
		p1.setName("小张三"); //可多次调用
		p1.getName();

	}

}
