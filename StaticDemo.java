/*
 * 
 */

class Person1
{
	String name = "李四";
	static String country = "CN";
//	public  static void show()
	public   void show()
	{
		System.out.println(this.name+"的国籍是"+country);//静态方法只能访问静态成员,name变量随对象存在而存在
		System.out.println("的国籍是"+country);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p = new Person1();
		p.name = "张三";
		p.show();
		System.out.println(Person1.country); //被static修饰的静态变量可以直接被类名调用。
//		System.out.println(Person1.name);  //调用错误。
//		Person1.show();  //被static修饰的静态方法可以直接被类名调用。
	}

}
