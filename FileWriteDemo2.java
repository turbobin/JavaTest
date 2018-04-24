/*
 *异常处理：
 * 
 */
import java.io.*;
public class FileWriteDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		try
		{
			fw = new FileWriter("C:/Users/hmx/Desktop/aaa.txt",true);
							//true表示可以续写，不覆盖原来内容
			fw.write("abcdefg\r\n");
		}catch (IOException e)
		{
			System.out.println("exception1:"+e.toString());
		}
		finally{
			try{
				if(fw!=null)
					fw.close();
			}catch (IOException e)
			{
				System.out.println("exception2:"+e.toString());
			}
		}

	}

}
