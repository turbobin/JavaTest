/*
 * 静态导入。
 * 当类名重名时，需要指定具体的包名。
 * 当方法重名时，需要指定具体的类名
 */
import java.util.*;
import static java.util.Arrays.*;
import static java.lang.System.*;	//导入了System类中所有的静态成员
public class ImportStaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5};
		sort(arr);//可省略Arrays
		out.println(Arrays.toString(arr));	//不可省略Arrays,toString方法与Object中方法重复

	}

}
