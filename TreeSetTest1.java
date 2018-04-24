import java.util.Iterator;
import java.util.TreeSet;

/*
 * ����
 * ��TreeSet�����д洢�Զ������ѧ����
 * �밴��ѧ���������������
 * 
 * 
 * |--TreeSet:���Զ�Set�����е�Ԫ�ؽ���ȥ�ز����򣨰���Ȼ˳�򣩡�
 * 			�ײ����ݽṹʽ��������
 * 			��֤����Ψһ�Ե����ݣ�compareTo����return 0.
 * 		TreeSet����ĵ�һ�ַ�ʽ����Ԫ������߱��Ƚ��ԡ�
 * 		Ԫ����Ҫʵ��Comparable�ӿڣ�����compareTo����
 * 		���ַ�ʽҲ��ΪԪ�ص���Ȼ˳�򣬻��߽���Ĭ��˳��
 * 
 * ע�⣺����ʱ������Ҫ������ͬʱ��һ��Ҫ�ж�һ�´�Ҫ������
 */
class Student2 implements Comparable	//�ýӿ�ǿ����ѧ���߱��Ƚ���
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
			throw new RuntimeException("��ѧ������...");
		
		Student2 s = (Student2)obj;
		System.out.println(this.name+"..compareTo.."+s.name);
		if(this.age > s.age)
			return 1;
		if(this.age == s.age)
			return this.name.compareTo(s.name);	//	����0
		
		return -1;
	}
		
		
	public boolean equals(Object obj)	//�ײ��Զ�����
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
