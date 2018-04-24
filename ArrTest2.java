
public class ArrTest2 {
	public static void main(String[] args) {
		toBin(7);
		
		
		toBin_16(60);
		
		
		toBinTest_16(60);
	}

	/*
	 * 十进制 ——>二进制
	 */
	public static void toBin(int num)
	{
		StringBuffer sb = new StringBuffer();  //暂存数据
		
		while(num>0)
		{
			//System.out.println(num%2);
			sb.append(num%2);
			num = num /2;
		}
		System.out.println(sb.reverse());
	}
	
	/*
	 * 十进制 ——>十六进制
	 */
	public static void toBin_16(int num)
	{
		char [] arr = {'0','1','2','3','4','5','6','7',
					   '8','9','A','B','C','D','E','F'};
		StringBuffer sb = new StringBuffer();  //暂存数据
		
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
	 * 十进制 ——>十六进制,用数组容易存放
	 */
	public static void toBinTest_16(int num)
	{
		char [] arr = {'0','1','2','3','4','5','6','7',
					   '8','9','A','B','C','D','E','F'};
		char [] bin16 = new char[8];
	//	StringBuffer sb = new StringBuffer();  //暂存数据
		int pos = bin16.length-1; //定义一个操作数组的指针
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
		
		//打印数组
		for(int x=pos+1; x<bin16.length; x++)
		{
			System.out.print(bin16[x]);
		}
	}
}
