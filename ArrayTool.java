/*
 * һ.��̬��Ӧ��
 * ÿһ�������ж��й��ԵĹ��ܣ����Խ���Щ���ܽ��г�ȡ��������װ ���Ա㸴�á�
 * 
 * ��Ȼ����ͨ������ArrayTool�Ķ���ʹ����Щ���߷�������������в�����
 * ����
 * 1.���������ڷ�װ���ݵģ�����ArrayTool����δ��װ��������
 * 2.���������ÿһ��������û���õ�ArrayTool�����е���������
 * 
 * �ó�������Ͻ��������ǲ���Ҫ����ģ����Խ�ArrayTool�еķ����������static�ģ�ֱ��ͨ���������ü��ɡ�
 * 
 * ǿ���ø��಻�ܽ������󣬿��Խ����캯��˽�л���
 * 
 * ��.��������˵���飬java˵����ͨ���ĵ�ע������ɡ�
 * ʹ��javadoc����
 * API�ĵ���Ӧ�ó���ӿ�
 */


/**
 *����һ�����Զ�������в����Ĺ����࣬�������ṩ�� ��ȡ��ֵ �����򣬴�ӡ����ȹ��ܡ�
 * @author ccb
 * @version 1.1
 */
public class ArrayTool		//���Ȩ�ޱ���Ϊpublic���ſ�ʹ��javadoc����
{
	/**
	 * �ղ������캯��
	 */
	private ArrayTool(){}   	//ͨ�����캯��˽�л�����ֹ�������ô�������
	
	/**
	 * ��ȡһ�����������е����ֵ
	 * @param arr ����һ��int���͵�����
	 * @return ����һ���������е����ֵ
	 */
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
	
	/**
	 * ��ȡһ�����������е���Сֵ
	 * @param arr ����һ��int���͵�����
	 * @return ����һ���������е���Сֵ
	 */
	//����һ�����飬��ȡ�����е���Сֵ��
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
	 * ��int��������д�С���� ѡ������
	 * @param arr ����һ��int���͵�����
	 */
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
	
	/**
	 * ��int��������дӴ�С ð������
	 * @param arr ����һ��int���͵�����
	 */
	//����������,�Ӵ�С --ð���������ڱȽϣ���ѭ������һ�Σ���ֵ�������
	public static void boubleSort(int[] arr)
	{
		for(int x=0; x<arr.length-1;x++)
		{
			for(int y=0; y<arr.length-1-x; y++) //-1������Ǳ�Խ�磻-x����ÿ�αȽ�Ԫ����1��
			{
				if (arr[y] < arr[y+1])	
				{
					
					swap(arr,y,y+1);
				}
			}
					
		}
	}
	
	/**
	 * �������е�Ԫ�ؽ���λ���û�
	 * @param arr ����һ��int������
	 * @param a ���û���λ��
	 * @param b ���û���λ��
	 */
	//���幦�ܣ�λ���û�����
	private static void swap(int[] arr,int a,int b)		//�ڲ����ܣ���˽�л�
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}
	
	/**
	 * ��ӡ�����е�ȫ��Ԫ�ء�Ԫ�ؼ��ö��Ÿ���
	 * @param arr ����һ��int������
	 */
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
