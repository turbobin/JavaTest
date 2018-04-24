import java.util.*;
/*
 * 将自定义对象作为元素存到ArrayList集合中，并去除重复元素。
 * 比如：存人对象。同姓名同年龄，视为同一个人。
 * 
 * 思路：
 * 1，对人描述，将数据封装进人对象。
 * 2，定义容器，将人存入。
 * 3，取出。
 */

class Person2
{
	private String name;
	private int age;
	Person2(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj)	//底层自动调用
	{
		if(!(obj instanceof Person2))
			return false;
		
		Person2 p = (Person2)obj;
		System.out.println(this.name+"...."+p.name);
		
		return this.name.equals(p.getName()) && this.age == p.age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}
public class ArrayListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(new Person2("zhangsan",20));
		al.add(new Person2("lisi",21));
		al.add(new Person2("wangwu",25));
		al.add(new Person2("lisi",21));
		al.add(new Person2("wangwu",25));
		al.add(new Person2("wangwu",25));
		
		al = removeDup(al);
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			Person2 p = (Person2)it.next();	//it.next()返回Object类型，需向下转型。
			say(p.getName()+","+p.getAge());
		}

	}
	public static void say(Object obj)
	{
		System.out.println(obj);
	}
	
	public static ArrayList removeDup(ArrayList al)
	{
		//定义一个临时容器。
		ArrayList newal = new ArrayList();
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			if(!newal.contains(obj))	//remove，contains底层都会调用equals方法
				newal.add(obj);
		}
		return newal;
	}

}
