//����ת�� ��ͨ�ù���

public class ArrTest3 {

	public static void main(String[] args) {
	//	toBin(-6);
	//	toHex(60);
		toBa(20);
	}
	/*
	 * ʮ���� ����> ������
	 */
	public static void  toBin(int num)
	{
		trans(num,1,1);
	}
	/*
	 * ʮ���� ����> �˽���
	 */
	public static void  toBa(int num)
	{
		trans(num,7,3);
	}
	
	/*
	 * ʮ���� ����> ʮ������
	 */
	public static void  toHex(int num)
	{
		trans(num,15,4);
	}
	
	public static void trans(int num,int base,int offset)
	{
		if (num == 0)
		{
			System.out.println(0);
			return; 
		}
		char [] tab = {'0','1','2','3','4','5','6','7',
				   '8','9','A','B','C','D','E','F'};
		char [] arr = new char[32];
		
		int pos = arr.length-1;;
		while(num != 0)
		{
			int temp = num & base;
			arr[pos] = tab[temp];
			pos--;
			num = num >>> offset;
		}
				
		//��ӡ����
		for(int x=pos+1; x<arr.length; x++)
		{
			System.out.print(arr[x]);
		}
	}

}
