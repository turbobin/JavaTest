//������������ϰ
public class FuncOverload 
{

	public static void main(String[] args)
	{
		System.out.println(getsum(1,2,3));
		print99();
		

	}
	
	//�������ܣ���ӡnum�˷���
	public static void print99(int num)
	{
		for(int x=1;x<=num; x++)
		{
		//	for(int y=0;y<z;y++)
			for(int y=1;y<=x;y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t"); // "\t" �Ʊ��,��ӡ�������Ա����ʽ�Զ�����
			}
			System.out.println();
		}
	}
	
	//�������ܣ���ӡ99�˷���
	public static void print99() //ͬ�������������б�ͬ����Ϊ���������ء���ߴ���ĸ�����
	{
		print99(9);
	}
	
	//�������ܣ���ȡ���������ĺ�
	public static int getsum(int a, int b)
	{
		return (a+b)*2;
	}
	
	//�������ܣ���ȡ���������ĺ�
		public static int getsum(int a, int b,int c)   //ͬ��������������
		{
			return getsum(a,b)+c;
		}

}
