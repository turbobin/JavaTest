/*
 * 练习：每一个学生都有对应归属地。
 * 学生Student，地址String。
 * 学生属性：姓名，年龄。
 * 注意：姓名和年龄相同的视为同一个学生。
 * 保证学生唯一性   //需复写hashCode和equals方法
 * 
 * 1，描述学生。
 * 2，定义map容器，将学生作为键，地址作为值存入。
 * 3，获取map集合中的元素。
 */
import java.util.*;
class Student4 implements Comparable<Student4>
{
	private String name;
	private int age;
	Student4(String name,int age)
	{
		this.name = name;
		this.age = age;
		
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String toString()	//复写toString方法，把哈希值转换
	{
		return name+","+age;
	}
	
	public int compareTo(Student4 s)
	{
		int num = new Integer(this.age).compareTo(new Integer(s.age));
		if(num == 0)
			return this.name.compareTo(s.name);
		
		return num;
	}
	
	//复写hashCode和equals方法，保证键的唯一性。
	public int hashCode()
	{
		return name.hashCode()+age*34;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Student4))
			throw new  ClassCastException("类型不匹配");
		
		Student4 s = (Student4)obj;
		return this.name.equals(s.name) && this.age == s.age;
	}
	
}

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student4,String> hm = new HashMap<Student4,String>();
		
		hm.put(new Student4("lisi2",21), "Beijing");
		hm.put(new Student4("lisi2",21), "Tianjing");
		hm.put(new Student4("zhagnsan",23), "Wuhan");
		hm.put(new Student4("lisi4",21), "Shenzhen");
		hm.put(new Student4("zhaoliu",24), "Guangzhou");
		
		//第一种取出方式 keySet
		Set<Student4> keyset = hm.keySet();
		Iterator<Student4> it = keyset.iterator();
		while(it.hasNext())
		{
			Student4 stu = it.next();
			String addr = hm.get(stu);
			System.out.println(stu+"...."+addr);
		}
		
		//第二种取出方式 entrySet
		Set<Map.Entry<Student4, String>> entryset = hm.entrySet();
		Iterator<Map.Entry<Student4, String>> iter = entryset.iterator();
		while(iter.hasNext())
		{
			Map.Entry<Student4, String> me = iter.next();
			Student4 stu = me.getKey();
			String addr = me.getValue();
			System.out.println(stu+",,,,"+addr);
		}

	}

}
