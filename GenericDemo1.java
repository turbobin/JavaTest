import java.util.*;
/*
 * ? 通配符。也可以理解为占位符。
 * 泛型的限定：
 * ? extend E:可以接收E类或者E的子类型。限定上限。
 * ? super E:可以接收E类型或者E的父类型。限定下限
 */
public class GenericDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person2> al = new ArrayList<Person2>();
//		al.add("abc1");
//		al.add("abc3");
//		al.add("abc2");
		al.add(new Person2("zhangsan",16));
		al.add(new Person2("lisi",13));
		al.add(new Person2("wangwu",15));
		printColl(al);
		
		ArrayList<Student3> all = new ArrayList<Student3>();
//		all.add(2);
//		all.add(4);
//		all.add(3);
		all.add(new Student3("lili",19));
		all.add(new Student3("yaya",18));
		all.add(new Student3("haha",20));
		printColl(all);

	}
	
//	public static void printColl(ArrayList<? extends Person2> al)
	public static void printColl(ArrayList<? super Student3> al)
	{
		Iterator<? super Student3> it = al.iterator();
		Person2 p = (Person2)it.next();	//如用super，这里需强制转换类型
		while(it.hasNext())
		{
			System.out.println(p.getName());
		}
	}

}
class Student3 extends Person2
{
	Student3(String name,int age)
	{
		super(name,age);
	}
}
