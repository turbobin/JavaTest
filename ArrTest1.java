//������Ҳ���

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
	
	
	//1:��������,�����ʱ Ч�ʽϵ�
	public static int getIndex(int [] arr,int key)
	{
		for(int x= 0;x<arr.length-1;x++)
		{
			if (arr[x] == key)
				return x;
		}
		return -1;
	}
	
	
	//2���۰���ҡ����Ч�ʣ������뱣֤�����������
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
	
	//3���۰���ҵڶ��ַ�ʽ��
		public static int halfSearch_2(int [] arr,int key)
		{
			int min = 0,max = arr.length-1,mid;
			
			while(min <= max)
			{
				mid = (min+max)>>1;  //λ�������(min+max)/2
				if (key > arr[mid])
					min = mid+1;
				else if (key < arr[mid])
					max = mid -1;
				else
					return mid;
				
			}
			return -1;// ���轫���������飬��֤��������,�ɷ���max��ȷ������λ��Ϊmax+1��
		}


}
