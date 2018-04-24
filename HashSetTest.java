import java.util.*;
/*
 * |--Set��Ԫ���������(�����ȡ����˳��һ��һ��)��Ԫ�ز������ظ���
 * 		|--HashSet:�ײ����ݽṹ�ǹ�ϣ��
 * 			HashSet����α�֤����Ψһ�Ե��أ�
 * 			��ͨ��Ԫ�ص���������hashCode��equals����ɡ����Ԫ�ص�HashCodeֵ��ͬ���Ż��ж�equals�Ƿ�Ϊtrue
 * 			���Ԫ�ص�hashCodeֵ��ͬ���������equals.
 * 			ע�⣺�����ж�Ԫ���Ƿ����(contains)���Լ�ɾ��(remove)�Ȳ�������������Ԫ�ص�hashCode��equals������
 * 		|--TreeSet:
 * Set���ϵĹ��ܺ�collection��һ�µġ�
 */

class HashSetDemo
{
	private String name;
	private int age;
	HashSetDemo(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public int hashCode()
	{
		System.out.println(this.name+"....");
//		return 60;
		return name.hashCode()+age*39;
	}
	public boolean equals(Object obj)	//��������ͬ��hashCodeʱ���ײ���Զ�����
	{
		if(!(obj instanceof HashSetDemo))
			return false;
		
		HashSetDemo p = (HashSetDemo)obj;
		System.out.println(this.name+"..pk.."+p.name);
		
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
public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		hashsetDemo hs1 = new hashsetDemo();
//		hashsetDemo hs2 = new hashsetDemo();
//		say(hs1);
//		say(hs2);
		HashSet hs = new HashSet();
		hs.add(new HashSetDemo("a1",11));//����true
		hs.add(new HashSetDemo("a1",11));//����false
		hs.add(new HashSetDemo("a2",13));
		hs.add(new HashSetDemo("a1",11));
//		hs.add(new HashSetDemo("a3",12));
//		hs.add(new HashSetDemo("a4",11));
//		say(hs);
//		hs = removeDup(hs);
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			HashSetDemo hsd = (HashSetDemo)it.next();
			say(hsd.getName()+","+hsd.getAge());
		}

	}
	/*
	public static HashSet removeDup(HashSet hs)
	{
		//����һ����ʱ������
		HashSet newhs = new HashSet();
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			if(!newhs.contains(obj))	//remove��contains�ײ㶼�����equals����
				newhs.add(obj);
		}
		return newhs;
	}
	*/
	public static void say(Object obj)
	{
		System.out.println(obj);
	}

}
