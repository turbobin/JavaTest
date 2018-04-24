/*
 * public static void main(String[] args)
 * 主函数：是一个特殊的函数。作为程序的入口，可以被JVM调用。
 * 
 * 主函数的定义：
 * public:代表该函数的访问权限是最大的。
 * static:主函数是静态函数，代表主函数随着类的加载而加载。
 * void：主函数没有具体返回值
 * main：不是关键字，但是是一个特殊的单词，可以被jvm识别。
 * （String[] args:函数的参数，参数类型是一个字符串 类型的数组;args：数组变量
 * 
 * 主函数是固定格式的 ：JVM识别
 * JVM在调用主函数和时，传入的是new String[0]
 */
public class MainDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String [] arr = {"haha","hehe","xixi"};
		MainTest.main(arr);
		
	}
}
class MainTest
{
	public static void main(String[] args)
	{
		System.out.println(args.length);
		for(int x=0; x<args.length; x++)
		{
			System.out.println(args[x]);
			
		}
	}

}
