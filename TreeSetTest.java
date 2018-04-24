import java.util.*;
/*
 * |--Set：元素是无序的(存入和取出的顺序不一定一致)，元素不可以重复。
 * 		|--TreeSet:可以对Set集合中的元素进行去重并排序（按自然顺序）。
 * 			底层数据结构式二叉树。
 * 			保证数据唯一性的依据：compareTo方法return 0.
 * 
 */

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		ts.add("22222");
		ts.add("11111");
		ts.add("44444");
		ts.add("22222");
		
//		say(ts);
		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			say(it.next());
		}

	}
	public static void say(Object obj)
	{
		System.out.println(obj);
	}

}
