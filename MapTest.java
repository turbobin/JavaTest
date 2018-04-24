/*
 * ��ϰ��ÿһ��ѧ�����ж�Ӧ�����ء�
 * ѧ��Student����ַString��
 * ѧ�����ԣ����������䡣
 * ע�⣺������������ͬ����Ϊͬһ��ѧ����
 * ��֤ѧ��Ψһ��   //�踴дhashCode��equals����
 * 
 * 1������ѧ����
 * 2������map��������ѧ����Ϊ������ַ��Ϊֵ���롣
 * 3����ȡmap�����е�Ԫ�ء�
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
	public String toString()	//��дtoString�������ѹ�ϣֵת��
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
	
	//��дhashCode��equals��������֤����Ψһ�ԡ�
	public int hashCode()
	{
		return name.hashCode()+age*34;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Student4))
			throw new  ClassCastException("���Ͳ�ƥ��");
		
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
		
		//��һ��ȡ����ʽ keySet
		Set<Student4> keyset = hm.keySet();
		Iterator<Student4> it = keyset.iterator();
		while(it.hasNext())
		{
			Student4 stu = it.next();
			String addr = hm.get(stu);
			System.out.println(stu+"...."+addr);
		}
		
		//�ڶ���ȡ����ʽ entrySet
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
