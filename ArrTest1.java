//数组查找操作

public class ArrTest1 {

	public static void main(String[] args) {
		int [] arr = {2,4,6,8,11,24};
		
		int index = getIndex(arr,8);
		System.out.println("index="+index);
		
		int index1 = halfSearch(arr,6);
		System.out.println("index="+index1);
		
		int index2 = halfSearch_2(arr,5);
		System.out.println("index="+index2);
	}
	
	
	//1:遍历查找,数组大时 效率较低
	public static int getIndex(int [] arr,int key)
	{
		for(int x= 0;x<arr.length-1;x++)
		{
			if (arr[x] == key)
				return x;
		}
		return -1;
	}
	
	
	//2，折半查找。提高效率，但必须保证是有序的数组
	public static int halfSearch(int [] arr,int key)
	{
		int min,max,mid;
		min = 0;
		max = arr.length-1;
		mid = (min+max)/2;
		while(arr[mid]!=key)
		{
			if (key > arr[mid])
				min = mid+1;
			else if (key < arr[mid])
				max = mid -1;
			
			mid = (min+max)/2;
			
			if (min>max);
				return -1;
		}
		return mid;
	}
	
	//3，折半查找第二种方式。
		public static int halfSearch_2(int [] arr,int key)
		{
			int min = 0,max = arr.length-1,mid;
			
			while(min <= max)
			{
				mid = (min+max)>>1;  //位运算符，(min+max)/2
				if (key > arr[mid])
					min = mid+1;
				else if (key < arr[mid])
					max = mid -1;
				else
					return mid;
				
			}
			return -1;// 如需将数插入数组，保证数组有序,可返回max，确定插入位置为max+1。
		}


}
