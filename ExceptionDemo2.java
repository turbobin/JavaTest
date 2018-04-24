/*自定义异常：
 * 因为项目中会出现特有的问题。而这些问题并未被java所描述并封装对象。
 * 所以对于这些特有的问题可以按照java对问题封装的思想，将特有的问题进行自定义的异常封装。
 * 
 * 需求：在本程序中，对于被除数是负数的，也视为是异常情况。
 * 那么就需要对这个问题进行自定义的描述。
 * 
 * 当在函数内部出现了throw抛出异常对象，那么就必须要给对应的处理动作
 * 要么在内部try catch处理
 * 要么在函数上声明让调用者处理。
 * 
 * 一般情况下，函数内出现异常，函数上需要声明。
 * 
 * 如何自定义异常信息？
 * 因为父类中已经把异常信息的操作都完成了，所以子类只要在构造时，将异常信息传递给父类（通过super语句）。
 * 那么就可以直接通过getMassage方法获取自定义的异常。
 * 
 * 注：自定义异常必须是自定义类继承Exception
 * 原因：
 * 异常体系有有一个特点：异常类和异常对象都被抛出
 * 他们都具备可抛性，可抛性是Throwable体系中独有的特点。
 * 只有这个体系中的类和对象才可以被throw和throws操作。
 */

class NegativeException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	NegativeException(String msg)
	{
		super(msg);
	}
	
}
class Demo3
{
	int Div(int a,int b)throws NegativeException
	{
		if(b<0)
			throw new NegativeException("出现了被除数是负数的情况---by:"+b);
		//手动通过throw关键字抛出一个自定义的异常对象
		return a/b;
		
		/*
		 * throws:使用在函数上，后跟异常类，可跟多个，用逗号隔开
		 * throw：使用在函数内，后跟异常对象。单独存在时，下面不要定义语句，因为执行不到
		 */
		
	}
}
public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Demo3 x = new Demo3();
		try
		{
			int y=x.Div(5, -2); 
			System.out.println("y="+y);
		}catch(NegativeException e)
		{
			System.out.println(e.toString());
		}
		
		System.out.println("PGM Over");

	}

}
