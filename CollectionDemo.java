import java.util.*;
/*
 * 1，add方法的参数类型是Object，以便于接收任意类型的对象
 * 2，集合中存储的都是对象的引用（地址）
 * 3，迭代器：集合中取出元素的方法。
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
		
		//1,添加元素。
		al.add("object1");
		al.add("object2");
		al.add("object3");
		al.add("object4");
		
		Iterator it = al.iterator();	//获取迭代器，用于集合元素的取出。
		
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
		
//		al1.retainAll(al2);	//al1取al1和al2的交集。
		al1.removeAll(al2);	//al1取al1和al2的非交集。
		say("al1:"+al1);
		say("al2:"+al2);
	}
	public static void method_1()
	{
		//创建一个集合容器，使用Collection接口的子类--ArrayList
				ArrayList<String> al = new ArrayList<String>();
				
				//1,添加元素。
				al.add("object1");
				al.add("object2");
				al.add("object3");
				al.add("object4");
				al.add("object5");
				
				
				//打印集合；
				say(al);
				
				//2，删除元素。
				al.remove(2);
//				al.clear();//清空集合
				say(al);
				
				//3,判断元素
				say("object3是否存在？："+al.contains("object3"));
				say("集合是否为空？："+al.isEmpty());
				
				//获取个数。集合长度。
				say("size:"+al.size());
	}
	public static void say(Object obj)
	{
		System.out.println(obj);
	}

}
