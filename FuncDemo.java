// ��ϰ��������

class FuncDemo 
{
	public static void main(String[] args) 
	{
		int x = getResult(4);
		System.out.println("x="+x);

		print1();;
		
		int y = getMax(3,5);
		System.out.println("y="+y);
		System.out.println("Max="+getMax(3,5));
	}


	public static int getResult(int num) //����1������
	{
		return num * 3 + 5;	
	}


	public static void print1()   //����2����ӡ�����void���÷�
	{
		for(int x=1;x<=5;x++)
		{
			for(int y=x;y<5;y++)
			{
				System.out.print(" "); 
			}
			
			for(int z=1;z<=x;z++)
			{
				System.out.print("* "); 
			}
			System.out.println();
		}
	}
	
	
	public static int getMax(int a,int b) //����3���жϽϴ��ֵ
	{
		return (a>b)?a:b;	
	}

}
