/*
 * ������������ͬ����ʱ��,���ǹ������岻ͬ��
 * ��ʱ�����Խ������ϳ�ȡ��ֻ��ȡ���ܶ��壬������ȡ�������塣
 * 
 * ���󣺲����壨�Ĺ��ܣ���
 * 
 * ��������ص㣺
 * 1.���󷽷�һ���ڳ������С�
 * 2.���󷽷��ͳ����඼���뱻abstract�ؼ������Ρ�
 * 3.�����಻������new����������Ϊ���ó��󷽷���û�����塣
 * 4.�������еķ���Ҫ��ʹ�ã����������ิд�����еĳ��󷽷��󣬽������������á�
 * 	�������ֻ�����˲��ֳ��󷽷�����ô�����໹��һ�������ࡣ
 * 
 * �����಻����ʵ������
 * 
 * ���⣺�������п��Բ�������󷽷��������������ǲ��ø��ཨ������
 */
abstract class Student
{
	abstract void study();
//	abstract void study1();
	static void sleep()		//��������ͬ�����Զ���ǳ��󷽷���
	{
		System.out.println("Zzzzz...");
	}
}

class BaseStudent extends Student
{
//	private BaseStudent(){}
	void study()
	{
		System.out.println("base study");
	}
}

class Advstudent extends Student
{
	void study()
	{
		System.out.println("adv study");
	}
}
public class AbstractDemo {

	public static void main(String[] args) 
	{
		new BaseStudent().study();
	    BaseStudent.sleep();//��̬����
		
	}

}
