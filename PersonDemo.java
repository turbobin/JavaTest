/*
 * private��˽�У�Ȩ�����η��������������еĳ�Ա����Ա��������Ա��������
 * ˽�� ֻ�ڱ�������Ч��
 * 
 * ��age˽�л��Ժ������⼴ʹ�����˶���Ҳ����ֱ�ӷ��ʣ���Ҫ��Person�����ṩ�������ʷ�ʽ
 * 
 * ע��˽�� �����Ƿ�װ��һ�ֱ�����ʽ��
 */

class Person
{
	
	private int age;
	public void setAge(int a)
	{
		if (a>0 & a<130)
		{
			age = a;
			speak();
		}
		else
			System.out.println("����Ƿ�");
	}
	
	public int getAge()
	{
		return age;
	}
	
	void speak()
	{
		System.out.println("age="+age);
	}
}
public class PersonDemo {

	public static void main(String[] args) {
		Person p = new Person();		
//		p.age = 20;
//		p.speak();
		p.setAge(140);
		p.setAge(40);
		p.speak();

	}

}
