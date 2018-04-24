//数组练习

public class ArrayDemo 
{

	public static void main(String[] args) 
	{
		int x[] = new int[2];//2代表数组个数，无具体元素
		x[1]=56;
		int [] y = {1,4,5,6,2};//有具体元素
		System.out.println(y[4]);
		// java.lang.ArrayIndexOutOfBoundsException: 5  ：操作数组时，访问到了不存在的角标。
		// java.lang.NullPointerException:空指针异常,当引用没有任何指向值为null的情况，该引用仍在被用于操作实体。
			
		int a = y.length;//获取数组元素个数
	//	y = null;
		
		System.out.println("length="+a);
		
		
		//如果要打印数组的全部元素，通常用到遍历的方法。
		int sum = 0;
		for (int z=0; z<a; z++)
		{
			sum += y[z]; //数组的值累加。
			
			System.out.println("y["+z+"]="+y[z]);
			if (z != a - 1)
				System.out.print(y[z]);
			else
				
			System.out.println("y["+z+"]="+y[z]);
		}
		System.out.println("sum="+sum);
		printArr(y);
		
		
	}
	//定义功能，用于打印数组中的全部元素。元素间用逗号隔开
		public static void printArr(int[] y)
		{
			System.out.print("[");
			for(int x=0; x< y.length;x++)
			{
				if(x!=y.length-1)
					System.out.print(y[x]+", ");
				else
					System.out.println(y[x]+"]");
			}
		}

}
