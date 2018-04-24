class Fu_1
{
	int num = 3;
	void method1()
	{
		System.out.println("fu method_1");
	}
	void method2()
	{
		System.out.println("fu method_2");
	}
	public static void method4()
	{
		System.out.println("fu method_4");
	}
}

class Zi_1 extends Fu_1
{
	int num = 5;
	void method1()
	{
		System.out.println("zi method_1");
	}
	void method3()
	{
		System.out.println("zi method_3");
	}
	public static void method4()
	{
		System.out.println("zi method_4");
	}
}
public class DuoTaiTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Fu_1 f = new Zi_1();
		System.out.println(f.num);	// 3
		f.method1();
		f.method2();
//		f.method3();	//编译失败，因父类类型中没有method3方法
//		f.method4(); // fu method_4; 注！！：静态函数已绑定所属类，不存在子类覆盖
		Fu_1.method4();
/* 在多态成员中函数的特点：
 * 在编译时期：参阅引用型变量所属的类中是否有调用的方法，如果有，编译通过，没有则编译失败。
 * 在运行时期：参阅对象所属的类中是否有调用的方法。
 * 简单总结就是，成员函数在多态调用时，编译看左边，运行看右边。
 * 	
 * 
 * 在多态中成员变量的特点：
 * 无论编译和运行，都参考左边（引用型变量所属的类）。
 * 
 * 在多态中，静态成员的特点：
 * 无论编译和运行，都参考左边	
 */
		Zi_1 z = new Zi_1();
		System.out.println(z.num); 	// 5
		z.method1();  // zi method_1
		z.method2();  // fu method_2
		z.method3();  // zi method_3
//		z.method4();  // zi method_4	

	}

}
