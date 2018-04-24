/*
 * ���ģʽ:���ĳһ����������֮��Ч�ķ�����
 * Java����23�����ģʽ��
 * 
 * �������ģʽ�����һ�������ڴ�ֻ����һ����������⡣
 * 
 * 
 * ��Ҫ��֤����Ψһ��
 * 1.Ϊ�˱��������������Ľ�����������Ƚ�ֹ�����������ö���	-->�����캯��˽�л���
 * 2.��Ϊ��������������Է��ʵ��������ֻ���ڱ������Զ���һ������ -->�����д���һ���������
 * 3.Ϊ�˷�������������Զ������ķ��ʣ����Զ����ṩһЩ���ʷ�ʽ��	-->�ṩһ���������Ի�ȡ���ö��� 
 */

class Single
{
	private Single(){}
	
	private static Single s = new Single();
	public static Single getInstance()
	{
		return s;
	}
	
	private int age;
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
	
}
public class SingleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		s1.setAge(23);
		System.out.println(s2.getAge());	//֤��s2��s1���õ���ͬһ������

	}

}
