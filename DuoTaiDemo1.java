/*
 * ������ѧ����
 * 	ѧϰ��˯����
 * �߼���ѧ����
 * 	ѧϰ��˯����
 * 
 * ���Խ�������������г�ȡ��
 */

abstract class Student1
{
	public abstract void study();
	public void sleep()
	{
		System.out.println("����˯");
	}
}

//������Ĺ��ܷ�װ��һ���࣬��ߴ������չ�ԡ�
class DoStudent1
{
	public void dosome(Student1 s)
	{
		s.study();
		s.sleep();
	}
}

class BaseStudent1 extends Student1
{
	public void study()
	{
		System.out.println("base study");
	}
	public void sleep()
	{
		System.out.println("ſ��˯");
	}
}

class AdvStudent1 extends Student1
{
	public void study()
	{
		System.out.println("advance study");
	}
	
}
public class DuoTaiDemo1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		Student1 a = new AdvStudent1();
//		a.study();
//		a.sleep();
//		DoSomething(a);
//		DoSomething(new BaseStudent1());
		
		DoStudent1 stu = new DoStudent1(); 
		stu.dosome(new BaseStudent1());
		stu.dosome(new AdvStudent1());

	}
	//���Խ����ܽ�����������װ��һ���࣬���ø��༴��ʹ�øù��ܣ������չ��
	/*
	public static void DoSomething(Student1 s)
	{
		s.study();
		s.sleep();

	}
	*/
}
