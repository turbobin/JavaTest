import java.util.*;
/*
 * 1��add�����Ĳ���������Object���Ա��ڽ����������͵Ķ���
 * 2�������д洢�Ķ��Ƕ�������ã���ַ��
 * 3����������������ȡ��Ԫ�صķ�����
 */
		
public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		method_2();
		method_get();
		
		

	}
	public static void method_get()
	{
		ArrayList<String> al = new ArrayList<String>();
		
		//1,���Ԫ�ء�
		al.add("object1");
		al.add("object2");
		al.add("object3");
		al.add("object4");
		
		Iterator it = al.iterator();	//��ȡ�����������ڼ���Ԫ�ص�ȡ����
		
		while(it.hasNext())
			say(it.next());
	
	}
	public static void method_2()
	{
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("object1");
		al1.add("object2");
		al1.add("object3");
		al1.add("object4");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("object1");
		al2.add("object5");
		al2.add("object6");
		al2.add("object4");
		al2.add("object7");
		
//		al1.retainAll(al2);	//al1ȡal1��al2�Ľ�����
		al1.removeAll(al2);	//al1ȡal1��al2�ķǽ�����
		say("al1:"+al1);
		say("al2:"+al2);
	}
	public static void method_1()
	{
		//����һ������������ʹ��Collection�ӿڵ�����--ArrayList
				ArrayList<String> al = new ArrayList<String>();
				
				//1,���Ԫ�ء�
				al.add("object1");
				al.add("object2");
				al.add("object3");
				al.add("object4");
				al.add("object5");
				
				
				//��ӡ���ϣ�
				say(al);
				
				//2��ɾ��Ԫ�ء�
				al.remove(2);
//				al.clear();//��ռ���
				say(al);
				
				//3,�ж�Ԫ��
				say("object3�Ƿ���ڣ���"+al.contains("object3"));
				say("�����Ƿ�Ϊ�գ���"+al.isEmpty());
				
				//��ȡ���������ϳ��ȡ�
				say("size:"+al.size());
	}
	public static void say(Object obj)
	{
		System.out.println(obj);
	}

}
