class OtherDemo 
{
	public static void main(String[] args) 
	{
		//break：
		for (int x=0; x<3; x++)
		{
			for (int y=0; y<4; y++)
			{
				System.out.println("x="+x);
				break;//跳出当前循环。
			}
		}
		System.out.println("-----------------");
		//
		w:for (int x=0; x<3; x++) //循环可标号。
		{
			q:for (int z=0; z<4;z++) 
			{
				System.out.println("x="+x);
				break w;//跳出大循环。
			}
		}
		System.out.println("-----------------");
		//continue:继续循环。只能作用于循环结构。特点：结束本次循环，继续下一次循环。
		for (int x=1; x<=10; x++)
		{
			if(x%2==1)
				continue;
			System.out.println("x="+x); //只输出偶数。
		}
	}
}
