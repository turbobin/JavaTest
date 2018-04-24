import java.util.*;

/*
 * TreeSet�ĵڶ�������ʽ��
 * ��Ԫ�������߱��Ƚ��ԣ����߾߱��ıȽ��Բ�������Ҫ�ġ�
 * ��ʱ��Ҫ����������߱��Ƚ��ԡ�
 * �����˱Ƚ��������Ƚ���������Ϊ�������ݸ�TreeSet���ϵĹ��캯��
 * 
 * 
 * �����밴����������
 */

public class TreeSetTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet(new MyCompare());
		ts.add(new Student2("lisi02",23));
		ts.add(new Student2("lisi04",21));
		ts.add(new Student2("lisi04",19));	//���δ�Ƚϴ�Ҫ����������false�����ʧ��
		ts.add(new Student2("lisi03",15));
		ts.add(new Student2("lisi05",29));
		
		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			Student2 stu = (Student2)it.next();	//TreeSetTest1����student2��
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
