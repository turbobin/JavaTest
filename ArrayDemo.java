//������ϰ

public class ArrayDemo 
{

	public static void main(String[] args) 
	{
		int x[] = new int[2];//2��������������޾���Ԫ��
		x[1]=56;
		int [] y = {1,4,5,6,2};//�о���Ԫ��
		System.out.println(y[4]);
		// java.lang.ArrayIndexOutOfBoundsException: 5  ����������ʱ�����ʵ��˲����ڵĽǱꡣ
		// java.lang.NullPointerException:��ָ���쳣,������û���κ�ָ��ֵΪnull����������������ڱ����ڲ���ʵ�塣
			
		int a = y.length;//��ȡ����Ԫ�ظ���
	//	y = null;
		
		System.out.println("length="+a);
		
		
		//���Ҫ��ӡ�����ȫ��Ԫ�أ�ͨ���õ������ķ�����
		int sum = 0;
		for (int z=0; z<a; z++)
		{
			sum += y[z]; //�����ֵ�ۼӡ�
			
			System.out.println("y["+z+"]="+y[z]);
			if (z != a - 1)
				System.out.print(y[z]);
			else
				
			System.out.println("y["+z+"]="+y[z]);
		}
		System.out.println("sum="+sum);
		printArr(y);
		
		
	}
	//���幦�ܣ����ڴ�ӡ�����е�ȫ��Ԫ�ء�Ԫ�ؼ��ö��Ÿ���
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
