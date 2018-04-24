/*
 * Runtime对象
 * 该类没有提供构造函数，不能new对象，那么会直接想到该类中的方法都是静态的。
 * 发现该类还有非静态方法，说明该类肯定提供了方法获取本类对象，
 * 而且该方法是静态的，返回的是本类类型。
 * 
 * 由此可看出：该类使用了单例设计模式
 */
public class RuntimeDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime();
		Process p = r.exec("C:\\Program Files\\Mainframe ABEND ASSIST\\ABENDASSIST.exe");
		r.exec("notepad.exe C:\\Users\\hmx\\Desktop\\MMBDLINF.txt");//启动记事本程序 打开一个文件
		
		Thread.sleep(4000);
		p.destroy();	//杀掉此启动的进程
	}

}
