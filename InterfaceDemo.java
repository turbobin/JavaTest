/*
 * �ӿڣ�������⣬������Ϊ��һ������ĳ�����
 * 	���������еķ������ǳ���ģ���ô�������ͨ���ӿڵ���ʽ����ʾ��
 * class���ڶ�����
 * interface���ڶ���ӿڡ�
 * 
 * �ӿڶ���ʱ����ʽ�ص㣺
 * 1���ӿ��г������壺���������󷽷���
 * 2���ӿ��еĳ�Ա���й̶����η���
 * 	������public static final
 * 	������public abstract
 * ע���ӿ��еĳ�Ա����public�ġ�
 * 
 * �ӿڣ������Դ���������Ϊ�г��󷽷���
 * ��Ҫ������ʵ�֣�����Խӿ��еĳ��󷽷�ȫ�����Ǻ�����ſ���ʵ������
 * ����������һ�������ࡣ
 * 
 */

interface Inter
{
	int NUM = 3;	//��ʡ��public static final����
	public abstract void show();//��ʡ��public abstract����
}

interface InterA
{
	public abstract void show1();
}

class Demo
{
	public void function() {}
}

class Test extends Demo implements Inter,InterA
//���ڼ̳�һ�����ͬʱ������ͬʱ�̳У�ʵ�֣�����ӿ�
{
	public void show() {}
	public void show1() {}
	
}
/*��֮��ֻ�ܵ��̳У����ӿ�֮��֧�ֶ�̳�*/
//interface A
//{
//	void methodA();
//}
//interface B //extends A
//{
//	void methodB();
//}
//interface C	extends B,A	//�ӿ�֮����Զ�̳С�
//{
//	void methodC();
//}
//
//class D implements C
//{
//	public void methodA() {}
//	public void methodB() {}
//	public void methodC() {}
//}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Test t = new Test();
		System.out.println(t.NUM);
		System.out.println(Test.NUM);
		System.out.println(Inter.NUM);

	}

}
