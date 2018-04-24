//二维数组
public class Array2Demo {

	public static void main(String[] args) {
		int [][] arr = new int [3][4];//定义了名称为arr的二维数组。二维数组中有3个一维数组，
									  //每个一维数组中有4个元素。
		arr [0][3] = 4;
		int [][] arr1 = {{1,4,5,6},{1,4,5},{1,5,6,6}};
		System.out.println(arr[0][3]);
		System.out.println(arr1[0][3]);
	}

}
