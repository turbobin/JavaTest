/*
 * 一.静态的应用
 * 每一个程序中都有共性的功能，可以将这些功能进行抽取，独立封装 ，以便复用。
 * 
 * 虽然可以通过建立ArrayTool的对象使用这些工具方法，对数组进行操作，
 * 但：
 * 1.对象是用于封装数据的，可是ArrayTool对象并未封装特有数据
 * 2.操作数组的每一个方法都没有用到ArrayTool对象中的特有数据
 * 
 * 让程序更加严谨，考虑是不需要对象的，可以将ArrayTool中的方法都定义成static的，直接通过类名调用即可。
 * 
 * 强制让该类不能建立对象，可以将构造函数私有化。
 * 
 * 二.制作程序说明书，java说明书通过文档注释来完成。
 * 使用javadoc工具
 * API文档：应用程序接口
 */


/**
 *这是一个可以对数组进行操作的工具类，该类中提供了 获取最值 ，排序，打印数组等功能。
 * @author ccb
 * @version 1.1
 */
public class ArrayTool		//类的权限必须为public，才可使用javadoc工具
{
	/**
	 * 空参数构造函数
	 */
	private ArrayTool(){}   	//通过构造函数私有化，禁止其他引用创建对象
	
	/**
	 * 获取一个整型数组中的最大值
	 * @param arr 接受一个int类型的数组
	 * @return 返回一个改数组中的最大值
	 */
	//给定一个数组，获取数组中的最大值。
	public static int getMax(int[] arr)
	{
		int max=arr[0];
		for(int x=1; x<arr.length;x++)
		{
			if (arr[x] > max)
				max = arr[x];
		}
		return max;
	}
	
	/**
	 * 获取一个整型数组中的最小值
	 * @param arr 接受一个int类型的数组
	 * @return 返回一个改数组中的最小值
	 */
	//给定一个数组，获取数组中的最小值。
	public static int getMin(int[] arr)
	{
		int min=arr[0];
		for(int x=1; x<arr.length;x++)
		{
			if (arr[x] < min)
				min = arr[x];
		}
		return min;
	}
		
	/**
	 * 给int型数组进行从小到大 选择排序
	 * @param arr 接受一个int类型的数组
	 */
	//对数组排序,从小到大 -- 选择排序，两两比较，内循环结束一次，最值排在最前。
	public static void sortarr(int[] arr)
	{
		for(int x=0; x<arr.length-1;x++)
		{
			for(int y=x+1; y<arr.length; y++)
			{
				if (arr[x] > arr[y])	//注意：if条件下如要执行多条语句，需要使用{}
				{
					/*
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
					*/
					swap(arr,x,y);
				}
			}
					
		}
	}
	
	/**
	 * 给int型数组进行从大到小 冒泡排序
	 * @param arr 接受一个int类型的数组
	 */
	//对数组排序,从大到小 --冒泡排序，相邻比较，内循环结束一次，最值排在最后。
	public static void boubleSort(int[] arr)
	{
		for(int x=0; x<arr.length-1;x++)
		{
			for(int y=0; y<arr.length-1-x; y++) //-1：避免角标越界；-x：让每次比较元素少1。
			{
				if (arr[y] < arr[y+1])	
				{
					
					swap(arr,y,y+1);
				}
			}
					
		}
	}
	
	/**
	 * 给数组中的元素进行位置置换
	 * @param arr 接收一个int型数组
	 * @param a 需置换的位置
	 * @param b 需置换的位置
	 */
	//定义功能，位置置换函数
	private static void swap(int[] arr,int a,int b)		//内部功能，可私有化
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}
	
	/**
	 * 打印数组中的全部元素。元素间用逗号隔开
	 * @param arr 接收一个int型数组
	 */
	//定义功能，用于打印数组中的全部元素。元素间用逗号隔开
	public static void printArr(int[] arr)
	{
		System.out.print("[");
		for(int x=0; x< arr.length;x++)
		{
			if(x!=arr.length-1)
				System.out.print(arr[x]+", ");
			else
				System.out.println(arr[x]+"]");
		}
	}
	
}
