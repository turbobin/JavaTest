/*
 * Collection
 * 		|--List:Ԫ��������ģ�Ԫ�ؿ����ظ�����Ϊ�ü�����ϵ��������
 * 			|--ArrayList:�ײ�����ݽṹʹ�õ�������ṹ���ص㣺��ѯ�ٶȿ죬������ɾ�������̲߳�ͬ����
 * 			|--LinkedList:�ײ��ʹ�õ����������ݽṹ���ص㣺������ɾ�ܿ죬��ѯ������
 * 			|--Vector:�ײ�����ݽṹʹ�õ�������ṹ���߳�ͬ������ArrayList����ˡ�
 * 		|--Set��Ԫ��������ģ�Ԫ�ز������ظ���
 * 
 * List��
 * ���з��������ǿ��Բ����Ǳ�ķ������Ǹ���ϵ���еķ�����
 * ��(����)
 * 	add(index,ele);
 * 	addAll(index,ele);
 * ɾ��
 * remove(index)
 * 
 * �ģ�
 * set(index,ele)
 * 
 * �飺
 * get(index)
 * subList(from,to)
 * ListIterator();
 * List�������еĵ�������ListIterator��Iterator�Ľӿڡ�
 * �ڵ���ʱ��������ͨ�����϶���ķ������������е����أ���Ϊ��
 * �����쳣��
 * ���ԣ��ڵ�����ʱ��ֻ���õ������ķ�������Ԫ�أ�����Iterator���������޵ģ������Ҫ������
 * ��������Ҫʹ�����ӽӿڣ�ListIterator
 * 
 */
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		//���Ԫ��
		al.add("object1");
		al.add("object2");
		al.add("object3");
		
		//��ָ����λ�����Ԫ��
		al.add(1,"java01");
		//ɾ��һ��Ԫ��
//		al.remove(2);
		//�޸�Ԫ��
		al.set(1,"java02");
//		say(al);
//		String str = "";
//		String str1=DataOrNull(str.substring(0,12));
//		System.out.println("str:"+str1);
		say("subList:"+al.subList(0, 2));	//��ͷ����β
		//ͨ���Ǳ��ȡԪ��
		for(int x=0;x<al.size();x++)
			say("get("+x+"):"+al.get(x));
		
		Iterator<String> it = al.iterator();
		while(it.hasNext())
			say("next:"+it.next());
		ListIteratorTest(al);
		
	}
	protected static String DataOrNull(String arg)
	{
		if(arg==null)
			return "";
		else
			return arg;
	}
	public static void say(Object obj)
	{
		System.out.println(obj);
	}
	public static void ListIteratorTest(ArrayList<String> al)
	{
		ListIterator<String> lit = al.listIterator();
		while(lit.hasNext())	//-->���������
		{
			Object obj = lit.next();
			if(obj.equals("java02"))
			{
				lit.add("java09");	//��"java02"�����"java09"
//				lit.set("java03");	//��"java03"�޸ĳ�"java03"
				say(al);
			}
		}
		while(lit.hasPrevious())	//-->�������������hasPrevious();
		{
			Object obj = lit.previous();
			if(obj.equals("java02"))
			{
//				lit.add("java09");	//��"java02"�����"java09"
				lit.set("java03");	//��"java03"�޸ĳ�"java03"
				say(al);
			}
		}
	}

}
