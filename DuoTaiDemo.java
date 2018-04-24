/*
 * ��̬�������Ϊ������ڵĶ�����̬��
 * �ˣ����ˣ�Ů��
 * ����:è��������
 * 
 * è x = new è();
 * ���� x = new è();
 * 
 * 1����̬������
 * 	���������ָ�����Լ����������
 * 	���������Ҳ���Խ����Լ������ࡣ
 * 2����̬��ǰ��
 * 	������������֮���й�ϵ��Ҫô�Ǽ̳У�Ҫô��ʵ�֡�
 * 	ͨ������һ��ǰ�᣺���ڸ��ǡ�
 * 3����̬������
 * 	��̬�ĳ��ִ�������˳������չ�ԡ�
 * 	����ֻ��ʹ�ø�������÷��ʸ����еĳ�Ա
 * 4����̬��Ӧ��    
 */

abstract class Animal
{
	abstract public void eat();
}

class Cat extends Animal
{
	public void eat()
	{
		System.out.println("����");
	}
	public void catchmouse()
	{
		System.out.println("ץ����");
	}
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("�Թ�ͷ");
	}
	public void whathHouse()
	{
		System.out.println("����");
	}
}

class Pig extends Animal
{
	public void eat()
	{
		System.out.println("������");
	}
	public void gongDi()
	{
		System.out.println("����");
	}
}

public class DuoTaiDemo {

	public static void main(String[] args) {
		// ����������������������������ÿ�����඼��Ҫ����һ���������������Ƚ��鷳
		/*
		Cat c = new Cat();
		Cat c1 = new Cat();
		function(c);
		function(c1);
//		Dog d = new Dog();
//		d.eat();
		function(new Dog());
		function(new Pig());
		*/
		//����ֱ���ø����������������󣬷���ֻ����һ����
		Animal c = new Cat();	//��������������ת�ͣ���
		/*����������������з�������β�����
		 * ǿ�ƽ����������ת����������-->����ת��
		 */
		Cat z = (Cat)c;
		z.catchmouse();
		
		function(c);
		function(new Dog());
		function(new Pig());
	}
	/*
	public static void function(Cat c)
	{
		c.eat();
	}
	public static void function(Dog d)
	{
		d.eat();
	}
	public static void function(Pig p)
	{
		p.eat();
	}
	*/
	public static void function(Animal a)
	{
		a.eat();
		
		if(a instanceof Dog)	//�ж����࣬instanceof����˭�����͡�
		{
			Dog d = (Dog)a;
			d.whathHouse();
		}
		else if(a instanceof Pig)
		{
			Pig p = (Pig)a;
			p.gongDi();
		}
		
	}

}
