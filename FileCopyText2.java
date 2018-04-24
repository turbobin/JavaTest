/*
 * 使用缓冲区copy文件，提高效率
 */
import java.io.*;
public class FileCopyText2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufr = null;
		BufferedWriter bufw = null;
		try
		{
			FileReader fr = 
					new FileReader("C:/Users/hmx/Desktop/MathDemo.java");
			FileWriter fw = 
					new FileWriter("C:/Users/hmx/Desktop/MathDemo.txt");
		    bufr = new BufferedReader(fr);
		    bufw = new BufferedWriter(fw);
		    String line = null;
		    while((line=bufr.readLine())!=null)//读到文件末尾时，返回null,
											   //注意：读取一行末尾不包含行终止符
		    {
		    	bufw.write(line);
		    	bufw.newLine();
		    	bufw.flush();
		    }
		    
		}catch (IOException e)
		{
			throw new RuntimeException("读写失败");
		}finally
		{
			try{
				if(bufr!=null)
					bufr.close();
			}catch (IOException e)
			{
				throw new RuntimeException("读取失败");
			}
			
			try{
				if(bufw!=null)
					bufw.close();
			}catch (IOException e)
			{
				throw new RuntimeException("写入失败");
			}
		}
		

	}
}


