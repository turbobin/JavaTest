//循环嵌套。
/*
打印：
*****
*****
*****
*****
*****

*/
//思路：外循环控制行数，内循环控制列数。
class  ForDemo
{
	public static void main(String[] args) 
	{
		for(int x=0;x<5;x++)
		{
			for(int y=0;y<5;y++)
			{
				System.out.print("*");
			}
			System.out.println();//只有一个功能，换行。	
		}
		System.out.println("--------------------------");
		
		/*
		打印：
		*****
		****
		***
		**
		*
		5行，列变量递减，尖朝下 ，改变初始化值 */
		//int z=5;
		for(int x=0;x<5;x++)
		{
		//	for(int y=0;y<z;y++)
			for(int y=x;y<5;y++)
			{
				System.out.print("*");
			}
			System.out.println();//只有一个功能，换行。
		//	z--;
		}
		System.out.println("--------------------------");
		
		/*
		打印：
		*
		**
		***
		****
		*****
		5行，列变量递增，尖朝上 ，改变条件 */
		//int z=1;
		for(int x=0;x<5;x++)
		{
		//	for(int y=0;y<z;y++)
			for(int y=0;y<=x;y++)
			{
				System.out.print("*");
			}
			System.out.println();//只有一个功能，换行。
		//	z++;
		}
	}
}
