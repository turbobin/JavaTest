/*
 * 1.异常：就是程序在运行时出现不正常的情况。
 * 2.异常由来：问题也是现实生活中一个具体的事物，也可以通过java的类的形式进行描述，并封装成对象。
 * 		即java对不正常情况进行描述后的对象体现。
 * 
 * 对于问题的划分分为两种：严重的问题，非严重的问题
 * 严重的：java通过Error类进行描述
 * 		对于Error一般不编写针对性的代码对其进行处理。
 * 非严重的：java通过Exception类进行描述。
 * 		对于Exception可以使用针对性的处理方式处理。
 * 无论Error或者Exception都具有一些共性内容。
 * 比如 不正常情况的信息，引发原因等。
 * 他们可以向上抽取成一个体系：
 * 
 * Throwable
 * 		|--Error
 * 		|--Exception
 * 3.异常的处理：
 * java提供了特有的语句进行处理：
 * try
 * {
 * 		需要被检测的代码； 
 * }
 * catch（异常类 变量）
 * {
 * 		处理异常的代码；  
 * }
 * finally
 * {
 * 		一定会执行的语句；  
 * }
 * 
 * 4.对捕获到的异常对象进行常见方法操作：
 * 	String() ,getMessage()：获取异常信息。
 *  printStackTrace():打印异常的堆栈中的全部信息
 */

class Demo1
{
	public int Div(int a,int b)throws Exception 
		//在功能上通过throws关键字声明了该功能有可能出现问题，则调用该功能时必须进行捕捉或者抛出
	{
		return a/b;	//new ArithmeticException();
	}
}
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Demo1 x = new Demo1();
//		int y=x.Div(5, 0);	//异常：java.lang.ArithmeticException: / by zero
//		System.out.println("y="+y);
		try
		{
			int y=x.Div(5, 0); //new ArithmeticException();
			System.out.println("y="+y);
		}catch(Exception e) 	//Exception e = new ArithmeticException();
		{
			e.printStackTrace();//异常名称：异常信息	异常出现的位置
			//jvm异常的处理机制：调用printStackTrace方法，打印异常的堆栈中的信息
			
			System.out.println(e.toString());//异常名称：异常信息
			System.out.println(e.getMessage()+":这里被零整除了");
//			return;			//"over"不执行
//			System.exit(0); //程序退出，虚拟机关闭，"finally"不执行
		}
		finally
		{
			System.out.println("finally..");
		}
		System.out.println("over");
	

	}

}
