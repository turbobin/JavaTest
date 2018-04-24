/*
 * 比较年龄，设置比较器
 */
import java.util.*;

public class GenericDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person2> ts = new TreeSet<Person2>(new comp());
		ts.add(new Person2("zhangsan",16));
		ts.add(new Person2("lisi",13));
		ts.add(new Person2("wangwu",15));
		printColl(ts);
		
		TreeSet<Student3> tss = new TreeSet<Student3>(new comp());
		tss.add(new Student3("lili",19));
		tss.add(new Student3("yaya",18));
		tss.add(new Student3("haha",20));
		printColl(tss);

	}
	
	public static void printColl(TreeSet<? extends Person2> ts)	//泛型限定，限定上限
	{
		Iterator<? extends Person2> it = ts.iterator();
		while(it.hasNext())
		{
			Person2 p = it.next();
			System.out.println(p.getName()+":"+p.getAge());
		}
	}

}

class comp implements Comparator<Person2>	//接收父类型就可以
{
	public int compare(Person2 o1,Person2 o2)
	{
		return new Integer(o1.getAge()).compareTo(new Integer(o2.getAge()));
	}
}
