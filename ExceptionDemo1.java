/*
 * 对多异常的处理。
 * 1.声明异常时，建议声明更为具体的异常，这样处理的更具体。
 * 2.对方声明几个异常，就对应有几个catch块，不要定义多余的catch块
 * 	如果多个catch块中的异常出现继承关系，父类异常catch块放在最下面，否则编译失败。
 * 
 * 建议在进行catch块处理时，catch中一定要定义具体处理方式，
 * 不要简单定义一句e.printStackTrace()，也不要简单书写一条输出语句
 * 一般会建一个文件，打印异常日志
 * 
 * 异常在子父类覆盖中的体现：
 * 1，子类覆盖父类时，如果父类的方法抛出异常，那么子类的覆盖方法只能抛出父类的异常
 * 	或者该异常的子类异常。
 * 2，如果父类方法抛出多个异常，那么子类在覆盖该方法时，只能抛出父类异常的子集。
 * 3，如果父类或者接口的方法中没有异常抛出，那么子类在覆盖方法时，也不可以抛出异常；
 * 	如果子类方法发生了异常，就必须要进行try处理，绝对不能抛。
 */

class Demo2
{
	public int Div(int a,int b)throws ArithmeticException,
							ArrayIndexOutOfBoundsException
	{
		int [] arr = new int[a];
		System.out.println(arr[5]);
		return a/b;	//new ArithmeticException();
	}
}
public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Demo2 x = new Demo2();
		try
		{
			int y=x.Div(5, 0); //new ArithmeticException();
			System.out.println("y="+y);
		}catch(ArithmeticException e) 	//Exception e = new ArithmeticException();
		{
			System.out.println(e.toString());//异常名称：异常信息
			System.out.println(e.getMessage()+":这里被零整除了");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());//异常名称：异常信息
			System.out.println(e.getMessage()+":数组角标越界");
		}
		catch(Exception e)
		{
			System.out.println(e.toString());//异常名称：异常信息
		}
		
		//多个catch块时，只会打印一个异常，因为虚拟机捕捉到异常时，程序就退出了
		
		System.out.println("PGM Over");

	}

}
