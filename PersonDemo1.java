/*���캯����
 * ���ڸ�������г�ʼ��
 */
class Person_1		//ͬһ�����£����������ظ���
{
	/*�������顣
	 * ���ã���������г�ʼ����
	 * ����һ���������У����������ڹ��캯��ִ��
	 * 
	 * �빹�캯��������
	 * ���������Ǹ����еĶ������ͳһ��ʼ���������캯���Ǹ���Ӧ�Ķ����ʼ����
	 * 
	 * ���������ж�����ǲ�ͬ�����Եĳ�ʼ�����ݡ�
	 */
		
	private String name;
	private int age;
	
	{
		System.out.println("----------------");
		System.out.println("first:name="+name+",age="+age);
		System.out.println("person code run!");
	}
	
	Person_1()		//���캯�������ֺ�����ͬ��������ʱ��Ĭ��Ϊ�ղ������� Person_1(){}
	{
		System.out.println("A:name="+name+",age="+age);
	}
	
	Person_1(String name)		//���캯��������
	{
		this.name = name;
		System.out.println("B:name="+name+",age="+age);
	}
	
	Person_1(String name,int age)		
	{
		this(name); //����� ���ڹ��캯������ã�this������ô˺����Ķ���ֻ�ܷ��ڵ�һ��
		//this.age = age;
		System.out.println("C:name="+name+",age="+age);
	}
	
	public void getName()
	{
		System.out.println("name="+name);
	}
	
	void setName(String name)
	{
		this.name = name;  //this:�������־ֲ������ͳ�Ա����ͬ�������
	}
}
	
public class PersonDemo1 {

	public static void main(String[] args) {
		Person_1 p1 = new Person_1(); //ִֻ��һ��
		Person_1 p2 = new Person_1("��С��");
		Person_1 p3 = new Person_1("����",1);
		p1.setName("С����"); //�ɶ�ε���
		p1.getName();

	}

}
