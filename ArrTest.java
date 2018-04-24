//�������
import java.util.*;

public class ArrTest 
{

	public static void main(String[] args) {
		int [] arr = {1,3,5,6,7,8,3,7,9};
		int max = getMax(arr);
		System.out.println("max="+max);
		
		sortarr(arr);  //����������
		printArr(arr); //��ӡ����
		
		boubleSort(arr);
		printArr(arr);
		
		Arrays.sort(arr); //���ù���,java�ж���õ�һ������ʽ��������ʹ�á�
		printArr(arr);
	}
	
	//����һ�����飬��ȡ�����е����ֵ��
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
	
	//����������,��С���� -- ѡ�����������Ƚϣ���ѭ������һ�Σ���ֵ������ǰ��
	public static void sortarr(int[] arr)
	{
		for(int x=0; x<arr.length-1;x++)
		{
			for(int y=x+1; y<arr.length; y++)
			{
				if (arr[x] > arr[y])	//ע�⣺if��������Ҫִ�ж�����䣬��Ҫʹ��{}
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
	
	//����������,�Ӵ�С --ð���������ڱȽϣ���ѭ������һ�Σ���ֵ�������
	public static void boubleSort(int[] arr)
	{
		for(int x=0; x<arr.length-1;x++)
		{
			for(int y=0; y<arr.length-1-x; y++) //-1������Ǳ�Խ�磻-x����ÿ�αȽ�Ԫ����1��
			{
				if (arr[y] < arr[y+1])	//ע�⣺if��������Ҫִ�ж�����䣬��Ҫʹ��{}
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
		
	//���幦�ܣ�λ���û�����
	public static void swap(int[] arr,int a,int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}
	
	//���幦�ܣ����ڴ�ӡ�����е�ȫ��Ԫ�ء�Ԫ�ؼ��ö��Ÿ���
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
