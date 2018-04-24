import java.util.*;
/*
 * ? ͨ�����Ҳ�������Ϊռλ����
 * ���͵��޶���
 * ? extend E:���Խ���E�����E�������͡��޶����ޡ�
 * ? super E:���Խ���E���ͻ���E�ĸ����͡��޶�����
 */
public class GenericDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person2> al = new ArrayList<Person2>();
//		al.add("abc1");
//		al.add("abc3");
//		al.add("abc2");
		al.add(new Person2("zhangsan",16));
		al.add(new Person2("lisi",13));
		al.add(new Person2("wangwu",15));
		printColl(al);
		
		ArrayList<Student3> all = new ArrayList<Student3>();
//		all.add(2);
//		all.add(4);
//		all.add(3);
		all.add(new Student3("lili",19));
		all.add(new Student3("yaya",18));
		all.add(new Student3("haha",20));
		printColl(all);

	}
	
//	public static void printColl(ArrayList<? extends Person2> al)
	public static void printColl(ArrayList<? super Student3> al)
	{
		Iterator<? super Student3> it = al.iterator();
		Person2 p = (Person2)it.next();	//����super��������ǿ��ת������
		while(it.hasNext())
		{
			System.out.println(p.getName());
		}
	}

}
class Student3 extends Person2
{
	Student3(String name,int age)
	{
		super(name,age);
	}
}
