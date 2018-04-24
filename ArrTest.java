//数组操作
import java.util.*;

public class ArrTest 
{

	public static void main(String[] args) {
		int [] arr = {1,3,5,6,7,8,3,7,9};
		int max = getMax(arr);
		System.out.println("max="+max);
		
		sortarr(arr);  //对数组排序
		printArr(arr); //打印数组
		
		boubleSort(arr);
		printArr(arr);
		
		Arrays.sort(arr); //内置功能,java中定义好的一种排序方式，开发中使用。
		printArr(arr);
	}
	
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
	
	//对数组排序,从大到小 --冒泡排序，相邻比较，内循环结束一次，最值排在最后。
	public static void boubleSort(int[] arr)
	{
		for(int x=0; x<arr.length-1;x++)
		{
			for(int y=0; y<arr.length-1-x; y++) //-1：避免角标越界；-x：让每次比较元素少1。
			{
				if (arr[y] < arr[y+1])	//注意：if条件下如要执行多条语句，需要使用{}
				{
					/*
					int temp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
					*/
					swap(arr,y,y+1);
				}
			}
					
		}
	}
		
	//定义功能，位置置换函数
	public static void swap(int[] arr,int a,int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}
	
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
