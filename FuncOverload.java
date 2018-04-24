//函数的重载练习
public class FuncOverload 
{

	public static void main(String[] args)
	{
		System.out.println(getsum(1,2,3));
		print99();
		

	}
	
	//函数功能：打印num乘法表。
	public static void print99(int num)
	{
		for(int x=1;x<=num; x++)
		{
		//	for(int y=0;y<z;y++)
			for(int y=1;y<=x;y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t"); // "\t" 制表符,打印出来将以表格形式自动对齐
			}
			System.out.println();
		}
	}
	
	//函数功能：打印99乘法表。
	public static void print99() //同名函数，参数列表不同，故为函数的重载。提高代码的复用性
	{
		print99(9);
	}
	
	//函数功能：获取两个整数的和
	public static int getsum(int a, int b)
	{
		return (a+b)*2;
	}
	
	//函数功能：获取三个整数的和
		public static int getsum(int a, int b,int c)   //同名函数，重载了
		{
			return getsum(a,b)+c;
		}

}
