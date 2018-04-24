/*
 * 多态：可理解为事物存在的多种形态。
 * 人：男人，女人
 * 动物:猫，狗，猪
 * 
 * 猫 x = new 猫();
 * 动物 x = new 猫();
 * 
 * 1，多态的体现
 * 	父类的引用指向了自己的子类对象。
 * 	父类的引用也可以接受自己的子类。
 * 2，多态的前提
 * 	必须是类与类之间有关系，要么是继承，要么是实现。
 * 	通常还有一个前提：存在覆盖。
 * 3，多态的利弊
 * 	多态的出现大大的提高了程序的扩展性。
 * 	但是只能使用父类的引用访问父类中的成员
 * 4，多态的应用    
 */

abstract class Animal
{
	abstract public void eat();
}

class Cat extends Animal
{
	public void eat()
	{
		System.out.println("吃鱼");
	}
	public void catchmouse()
	{
		System.out.println("抓老鼠");
	}
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("吃骨头");
	}
	public void whathHouse()
	{
		System.out.println("看家");
	}
}

class Pig extends Animal
{
	public void eat()
	{
		System.out.println("吃饲料");
	}
	public void gongDi()
	{
		System.out.println("拱地");
	}
}

public class DuoTaiDemo {

	public static void main(String[] args) {
		// 发现用子类类型来创建变量，且每个子类都需要定义一个方法，这样做比较麻烦
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
		//可以直接用父类类型来创建对象，方法只定义一个。
		Animal c = new Cat();	//类型提升（向上转型）。
		/*如果想调用子类的特有方法，如何操作？
		 * 强制将父类的引用转成子类类型-->向下转型
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
		
		if(a instanceof Dog)	//判断子类，instanceof：“谁的类型”
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
