import java.util.Iterator;
import java.util.TreeSet;

/*
 * 需求：
 * 往TreeSet集合中存储自定义对象学生。
 * 想按照学生的年龄进行排序。
 * 
 * 
 * |--TreeSet:可以对Set集合中的元素进行去重并排序（按自然顺序）。
 * 			底层数据结构式二叉树。
 * 			保证数据唯一性的依据：compareTo方法return 0.
 * 		TreeSet排序的第一种方式：让元素自身具备比较性。
 * 		元素需要实现Comparable接口，覆盖compareTo方法
 * 		这种方式也成为元素的自然顺序，或者叫做默认顺序。
 * 
 * 注意：排序时，当主要条件相同时，一定要判断一下次要条件。
 */
class Student2 implements Comparable	//该接口强制让学生具备比较性
{
	private String name;
	private int age;
	Student2(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public int compareTo(Object obj)
	{
		if(!(obj instanceof Student2))
			throw new RuntimeException("非学生对象...");
		
		Student2 s = (Student2)obj;
		System.out.println(this.name+"..compareTo.."+s.name);
		if(this.age > s.age)
			return 1;
		if(this.age == s.age)
			return this.name.compareTo(s.name);	//	返回0
		
		return -1;
	}
		
		
	public boolean equals(Object obj)	//底层自动调用
	{
		if(!(obj instanceof Student2))
			return false;
		
		Student2 p = (Student2)obj;
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
public class TreeSetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		ts.add(new Student2("lisi02",23));
		ts.add(new Student2("lisi04",21));
		ts.add(new Student2("lisi03",15));
//		ts.add(new Student2("lisi05",29));
		
		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			Student2 stu = (Student2)it.next();
			say(stu.getName()+","+stu.getAge());
		}

	}
	public static void say(Object obj)
	{
		System.out.println(obj);
	}


	

}
