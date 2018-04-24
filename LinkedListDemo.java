import java.util.*;

/*
 * LinkedList特有方法：
 * addFirst();
 * addLast();
 * 
 * getFirst();
 * getLast();
 * 获取元素，但不删除元素。当元素为空时，会抛出NoSuchElementException异常
 * 
 * removeFirst();
 * removeLast();
 * 获取元素，但是元素被删除。当元素为空时，会抛出NoSuchElementException异常
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
//		say(link.removeFirst());//如果列表为空，抛出异常
//		say(link.removeLast());	
		say(link.pollFirst());	//替代方法，如果列表为空，返回null
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
