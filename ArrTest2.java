
public class ArrTest2 {
	public static void main(String[] args) {
		toBin(7);
		
		
		toBin_16(60);
		
		
		toBinTest_16(60);
	}

	/*
	 * ʮ���� ����>������
	 */
	public static void toBin(int num)
	{
		StringBuffer sb = new StringBuffer();  //�ݴ�����
		
		while(num>0)
		{
			//System.out.println(num%2);
			sb.append(num%2);
			num = num /2;
		}
		System.out.println(sb.reverse());
	}
	
	/*
	 * ʮ���� ����>ʮ������
	 */
	public static void toBin_16(int num)
	{
		char [] arr = {'0','1','2','3','4','5','6','7',
					   '8','9','A','B','C','D','E','F'};
		StringBuffer sb = new StringBuffer();  //�ݴ�����
		
		for (int x=0;x<8;x++)
		{
			int temp = num & 15;
			//System.out.println(num%2);
			sb.append(arr[temp]);
			num = num >>>4;
		}
		System.out.println(sb.reverse());
	}
	
	/*
	 * ʮ���� ����>ʮ������,���������״��
	 */
	public static void toBinTest_16(int num)
	{
		char [] arr = {'0','1','2','3','4','5','6','7',
					   '8','9','A','B','C','D','E','F'};
		char [] bin16 = new char[8];
	//	StringBuffer sb = new StringBuffer();  //�ݴ�����
		int pos = bin16.length-1; //����һ�����������ָ��
	//	for (int x=0;x<8;x++)
		while(num != 0)
		{
			int temp = num & 15;
	//	    System.out.println(num%2);
	//		sb.append(arr[temp]);
			bin16[pos] = arr[temp];
			pos--;
			num = num >>>4;
		}
	//	System.out.println(sb.reverse());
		
		//��ӡ����
		for(int x=pos+1; x<bin16.length; x++)
		{
			System.out.print(bin16[x]);
		}
	}
}
