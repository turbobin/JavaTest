class OtherDemo 
{
	public static void main(String[] args) 
	{
		//break��
		for (int x=0; x<3; x++)
		{
			for (int y=0; y<4; y++)
			{
				System.out.println("x="+x);
				break;//������ǰѭ����
			}
		}
		System.out.println("-----------------");
		//
		w:for (int x=0; x<3; x++) //ѭ���ɱ�š�
		{
			q:for (int z=0; z<4;z++) 
			{
				System.out.println("x="+x);
				break w;//������ѭ����
			}
		}
		System.out.println("-----------------");
		//continue:����ѭ����ֻ��������ѭ���ṹ���ص㣺��������ѭ����������һ��ѭ����
		for (int x=1; x<=10; x++)
		{
			if(x%2==1)
				continue;
			System.out.println("x="+x); //ֻ���ż����
		}
	}
}
