import java.util.Arrays;

/*
 * JDK1.5版本出现的新特性
 * 接收多个参数
 * 方法的可变参数，注意：可变参数一定要定义在列表的最后面
 */
public class MoreParmMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show("haha",1,2,3,45,3);
		

	}
	public static void show(String str,int...arr)
	{
		System.out.println(str+"...."+Arrays.toString(arr));
	}

}
