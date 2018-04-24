//打印一个99乘法表
class  ForTest
{
	public static void main(String[] args) 
	{
		/*
		打印：
		1
		12
		123
		1234
		12345
		5行，列变量递增，尖朝上 ，改变条件 */
		//int z=1;
		for(int x=1;x<=5;x++)
		{
		//	for(int y=0;y<z;y++)
			for(int y=1;y<=x;y++)
			{
				System.out.print(y);
			}
			System.out.println();//只有一个功能，换行。
		//	z++;
		}
		System.out.println("---------------------------");
		/*
		打印：
		1*1=1
		1*2=2 2*2=4
		1*3=3 2*3=4 3*3=9
		1*4=4 2*4=4 3*4=9 4*4=16
		1*5=5 2*5=4 3*5=9 4*5=16 5*5=25
		........
		.........................9*9=81
		5行，列变量递增，尖朝上 ，改变条件 */
		//int z=1;
		for(int x=1;x<=9;x++)
		{
		//	for(int y=0;y<z;y++)
			for(int y=1;y<=x;y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t"); // "\t" 制表符,打印出来将以表格形式自动对齐
			}
			System.out.println();//只有一个功能，换行。
		//	z++;
		}
	}
}
