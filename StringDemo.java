
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";	//s1是一个类类型变量，“abc”是一个对象。
							//字符串最大特点：一旦被初始化就不可被改变。
		
		String s2 = new String("abc");
		
		//S1和s2有什么区别？
		/*
		 * s1在内存中有一个对象；
		 * s2在内存中有两个对象。
		 */
		
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));//String类复写了Object类中equals方法，
										  //该方法用于判断字符串 内容 是否相同。

	}

}
