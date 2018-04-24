/*
 * 类工具方法的调用。
 */
public class ArrayToolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,4,5,1,56,6,24,44};
//		ArrayTool tool = new ArrayTool();
//		int max = tool.getMax(arr);
		int max = ArrayTool.getMax(arr); //类工具调用
		System.out.println("max="+max);
		
		ArrayTool.boubleSort(arr);
		ArrayTool.printArr(arr);

	}

}
