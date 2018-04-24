/*
 * Collection
 * 		|--List:元素是有序的，元素可以重复。因为该集合体系有索引。
 * 			|--ArrayList:底层的数据结构使用的是数组结构。特点：查询速度快，但是增删稍慢。线程不同步。
 * 			|--LinkedList:底层的使用的是链表数据结构。特点：但是增删很快，查询稍慢。
 * 			|--Vector:底层的数据结构使用的是数组结构。线程同步。被ArrayList替代了。
 * 		|--Set：元素是无序的，元素不可以重复。
 * 
 * List：
 * 特有方法：凡是可以操作角标的方法都是改体系特有的方法。
 * 增(插入)
 * 	add(index,ele);
 * 	addAll(index,ele);
 * 删：
 * remove(index)
 * 
 * 改：
 * set(index,ele)
 * 
 * 查：
 * get(index)
 * subList(from,to)
 * ListIterator();
 * List集合特有的迭代器。ListIterator是Iterator的接口。
 * 在迭代时，不可以通过集合对象的方法操作集合中的因素，因为会
 * 发生异常。
 * 所以，在迭代器时，只能用迭代器的方法操作元素，可是Iterator方法是有限的，如果想要其他的
 * 操作就需要使用其子接口：ListIterator
 * 
 */
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		//添加元素
		al.add("object1");
		al.add("object2");
		al.add("object3");
		
		//在指定的位置添加元素
		al.add(1,"java01");
		//删除一个元素
//		al.remove(2);
		//修改元素
		al.set(1,"java02");
//		say(al);
//		String str = "";
//		String str1=DataOrNull(str.substring(0,12));
//		System.out.println("str:"+str1);
		say("subList:"+al.subList(0, 2));	//含头不含尾
		//通过角标获取元素
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
		while(lit.hasNext())	//-->正向遍历；
		{
			Object obj = lit.next();
			if(obj.equals("java02"))
			{
				lit.add("java09");	//在"java02"后添加"java09"
//				lit.set("java03");	//在"java03"修改成"java03"
				say(al);
			}
		}
		while(lit.hasPrevious())	//-->逆向遍历方法：hasPrevious();
		{
			Object obj = lit.previous();
			if(obj.equals("java02"))
			{
//				lit.add("java09");	//在"java02"后添加"java09"
				lit.set("java03");	//在"java03"修改成"java03"
				say(al);
			}
		}
	}

}
