/*
 * 子父类出现后，类成员的特点
 * 
 * 类中的成员
 * 1.变量
 * 2.函数
 * 3.构造函数
 * 
 * 1，变量
 * 如果子类中出现非私有的同名成员变量时，会运行子类变量的内容
 * 子类要访问本类中的变量，用this
 * 子类要访问父类中的同名变量，用super。
 * 
 * super的使用和this的使用几乎一致。
 *
 *2，函数
 * 如果子类中出现同名函数时，当子类对象调用该函数，会运行子类函数的内容，
 * 如同父类函数被覆盖一样。这是函数的另一个特性：重写（覆盖）。
 * 
 * 当需要扩展父类中的功能时，没有必要去修改父类中代码，而是创建一个继承父类的子类，重写父类的功能。
 * 子类要访问父类中的同名函数，用super。
 * 
 * 覆盖：
 * 1.子类覆盖父类，必须保证子类权限大于等于父类，才可以覆盖，否则编译失败。
 * 
 * 2.静态只能覆盖静态。
 * 
 * 
 * 3,构造函数
 * 在对子类对象进行初始化时，父类的构造函数也会运行，
 * 原因为子类构造函数默认第一行有一条隐式语句 super();
 * super()：会访问父类中 空参数 的构造函数，而且子类中所有的构造函数默认第一行都是super();
 * 如果没有空参数的构造函数，要访问指定的父类构造函数，super不能省略，需手动指定。
 * 
 * super();语句必须放在子类构造函数的第一行。
 * 
 * 记住：
 * 重载：只看同名函数的参数列表；
 * 重写：子父类方法要一模一样。
 * 
 * 
 * 子类的实例化过程：
 * 子类所有的构造函数，默认都会访问父类中空参数的构造函数。
 * 原因为子类构造函数默认第一行有一条隐式语句 super();
 * 当父类中没有空参数的构造函数时，子类必须手动通过super语句形式来指定访问父类中的构造函数。
 * 
 * 当然，子类的构造函数第一行也可以手动指定this语句来访问本类中的构造函数，
 * 但子类中至少要有一个构造函数会访问父类中的构造函数。
 */

class Fu
{
	int num = 4;
	Fu(int num)
	{
		System.out.println("Fu run..");
	}
//	private int num = 4;
//	public int getNum()
//	{
//		return num;
//	}
	 void speak()
	{
		System.out.println("speak Fu");
	}
	
}

class Zi extends Fu
{
	int num = 5;
	Zi()
	{
		super(4);	//必须手动指定，访问父类的构造函数；必须定义在子类构造函数的第一行
		System.out.println("Zi run..");
	}
	
	void show()
	{
//		System.out.println("num="+getNum());当父类变量为私有时，使用父类中的方法获取变量
		System.out.println("num="+super.num);
	}
	
	  void speak()
	{
		System.out.println("speak Zi");
		super.speak();	//调用父类功能
	}
}

class Zii extends Zi
{
	int num = 6;
	Zii()		//构造函数，将会访问Fu , Zi类中的构造函数
	{
		System.out.println("Zii run..");
	}
	
	 void speak()
	{
		System.out.println("speak Zii");
		super.speak();	//调用上一级父类
	}
}
/*
 * java语言中：java只支持单继承，不支持多继承。
 * 因为多继承容易带来安全隐患：当多个父类中定义了相同功能，当功能内容不同时，子类对象不确定要运行哪一个。
 * 但是java保留了这种机制，并用；另一种体现形式来完成表示：多实现。
 * 
 * java支持多层继承。也就是一个继承体系。
 * 如何使用一个继承体系中的功能呢？
 * 想要使用体系，先查阅体系父类的描述，因为父类中定义的是该体系的共性功能。
 * 通过了解该共性功能，就可以知道该体系的基本功能了。
 * 
 * 在具体调用时，要创建最子类的对象，一是因为有可能父类不能创建对象，而是创建子类对象可以使用更多的功能，
 * 包括基本的 也包括特有的。
 */
public class ExtendsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi p = new Zi();	//创建对象时，需创建子类对象，可获取 父类中的内容
		
//		p.show();
		System.out.println("num="+p.num);
//		
		p.speak();
//		
		Zii z = new Zii();
		System.out.println("num="+z.num);
		z.speak();		//打印对象所属类的方法
		

	}

}
