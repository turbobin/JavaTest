import java.util.*;

/*
 * LinkedList���з�����
 * addFirst();
 * addLast();
 * 
 * getFirst();
 * getLast();
 * ��ȡԪ�أ�����ɾ��Ԫ�ء���Ԫ��Ϊ��ʱ�����׳�NoSuchElementException�쳣
 * 
 * removeFirst();
 * removeLast();
 * ��ȡԪ�أ�����Ԫ�ر�ɾ������Ԫ��Ϊ��ʱ�����׳�NoSuchElementException�쳣
 * 
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> link = new LinkedList<String>();
		
//		link.addLast("object1");
//		link.addLast("object2");
//		link.addLast("object3");
//		link.addLast("object4");
		
		say(link);
//		say(link.getFirst());
//		say(link.getLast());
//		say(link.removeFirst());//����б�Ϊ�գ��׳��쳣
//		say(link.removeLast());	
		say(link.pollFirst());	//�������������б�Ϊ�գ�����null
		while(!link.isEmpty())
		{
			say(link.removeFirst());
		}
		
		say("size="+link.size());

	}
	public static void say(Object obj)
	{
		System.out.println(obj);
	}

}
