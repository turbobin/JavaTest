//ѭ��Ƕ�ס�
/*
��ӡ��
*****
*****
*****
*****
*****

*/
//˼·����ѭ��������������ѭ������������
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
			System.out.println();//ֻ��һ�����ܣ����С�	
		}
		System.out.println("--------------------------");
		
		/*
		��ӡ��
		*****
		****
		***
		**
		*
		5�У��б����ݼ����⳯�� ���ı��ʼ��ֵ */
		//int z=5;
		for(int x=0;x<5;x++)
		{
		//	for(int y=0;y<z;y++)
			for(int y=x;y<5;y++)
			{
				System.out.print("*");
			}
			System.out.println();//ֻ��һ�����ܣ����С�
		//	z--;
		}
		System.out.println("--------------------------");
		
		/*
		��ӡ��
		*
		**
		***
		****
		*****
		5�У��б����������⳯�� ���ı����� */
		//int z=1;
		for(int x=0;x<5;x++)
		{
		//	for(int y=0;y<z;y++)
			for(int y=0;y<=x;y++)
			{
				System.out.print("*");
			}
			System.out.println();//ֻ��һ�����ܣ����С�
		//	z++;
		}
	}
}
