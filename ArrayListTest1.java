import java.util.*;
/*
 * ���Զ��������ΪԪ�ش浽ArrayList�����У���ȥ���ظ�Ԫ�ء�
 * ���磺���˶���ͬ����ͬ���䣬��Ϊͬһ���ˡ�
 * 
 * ˼·��
 * 1�����������������ݷ�װ���˶���
 * 2���������������˴��롣
 * 3��ȡ����
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
	public boolean equals(Object obj)	//�ײ��Զ�����
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
			Person2 p = (Person2)it.next();	//it.next()����Object���ͣ�������ת�͡�
			say(p.getName()+","+p.getAge());
		}

	}
	public static void say(Object obj)
	{
		System.out.println(obj);
	}
	
	public static ArrayList removeDup(ArrayList al)
	{
		//����һ����ʱ������
		ArrayList newal = new ArrayList();
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			if(!newal.contains(obj))	//remove��contains�ײ㶼�����equals����
				newal.add(obj);
		}
		return newal;
	}

}
