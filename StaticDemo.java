/*
 * 
 */

class Person1
{
	String name = "����";
	static String country = "CN";
//	public  static void show()
	public   void show()
	{
		System.out.println(this.name+"�Ĺ�����"+country);//��̬����ֻ�ܷ��ʾ�̬��Ա,name�����������ڶ�����
		System.out.println("�Ĺ�����"+country);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p = new Person1();
		p.name = "����";
		p.show();
		System.out.println(Person1.country); //��static���εľ�̬��������ֱ�ӱ��������á�
//		System.out.println(Person1.name);  //���ô���
//		Person1.show();  //��static���εľ�̬��������ֱ�ӱ��������á�
	}

}
