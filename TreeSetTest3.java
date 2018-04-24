import java.util.*;

/*
 * TreeSet的第二种排序方式。
 * 当元素自身不具备比较性，或者具备的比较性不是所需要的。
 * 这时需要让容器自身具备比较性。
 * 定义了比较器，将比较器对象作为参数传递给TreeSet集合的构造函数
 * 
 * 
 * 需求：想按照姓名排序
 */

public class TreeSetTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet(new MyCompare());
		ts.add(new Student2("lisi02",23));
		ts.add(new Student2("lisi04",21));
		ts.add(new Student2("lisi04",19));	//如果未比较次要条件，返回false，添加失败
		ts.add(new Student2("lisi03",15));
		ts.add(new Student2("lisi05",29));
		
		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			Student2 stu = (Student2)it.next();	//TreeSetTest1已有student2类
			say(stu.getName()+","+stu.getAge());
		}
		

	}
	public static void say(Object obj)
	{
		System.out.println(obj);
	}

}

class MyCompare implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Student2 s1 = (Student2)o1;
		Student2 s2 = (Student2)o2;
		
		int num = s1.getName().compareTo(s2.getName());
		if(num == 0)
		{
//			if(s1.getAge() - s2.getAge() > 0)
//				return 1;
//			if(s1.getAge() - s2.getAge() < 0)
//				return -1;
//			
//			return 0;
			return new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));
					
		}
			
		
		return num;
		
	}
}
