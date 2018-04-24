/*
 * Exception中有一个特殊的子类异常RuntimeException 运行时异常。
 * 如果在函数内容（throw）抛出该异常，函数上可以不用声明，编译一样通过；
 * 如果在函数上（throws）声明了该异常，调用者可以不用进行处理，编译可以通过。
 * 
 * 之所以不用再函数上声明，是因为不需要让调用者处理。
 * 当该异常发生，希望程序停止，因为在运行时，出现了无法继续运算的情况，希望停止程序后
 * 对代码进行修正。
 * 
 * 对于异常分两种：
 * 1，编译时被检测的异常
 * 2，编译时不被检测的异常（运行时异常。RuntimeException以及子类）
 */
class NegtivException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//自定义异常时：如果该异常发生，无法再继续运算，就让该自定义异常继承RuntimeException
	NegtivException(String msg)
	{
		super(msg);
	}
}
class Demo4
{
	int Div(int a,int b)
	{
		if(b<0)
			throw new NegtivException("出现了被除数为负数的情况");
		if(b==0)
			throw new ArithmeticException("被零除了");
		return a/b;
	}
}
public class ExceptionDemo3 
{
	public static void main(String [] args)
	{
		Demo4 d = new Demo4();
		int x = d.Div(5, -1);
		System.out.println("x="+x);
		System.out.println("PGM over");
	}

}
