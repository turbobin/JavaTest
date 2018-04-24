/*
 * 网页爬虫（spider）
 */
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.net.*;
public class RegexTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		getMovie();

	}

	private static void getMovie() throws Exception {
		// TODO Auto-generated method stub
		URL url = new URL("http://www.ygdy8.com");//电影天堂网址
		URLConnection conn = url.openConnection();
		InputStream in = conn.getInputStream();
		BufferedReader bufIn = 
			new BufferedReader(new InputStreamReader(in));
		
		String regex = ">201\\d年.+</";//获取所有电影名
		Pattern p = Pattern.compile(regex);
		
		File file = new File("C:\\Users\\Administrator\\Desktop\\moviespider.txt");
		PrintWriter out = 
				new PrintWriter(new FileWriter(file),true);
		
		String line = null;
		while((line=bufIn.readLine())!=null)
		{
			Matcher m = p.matcher(line);
			while(m.find())
			{
				String str = m.group();
				String movie = str.replaceAll(">","");
				movie = movie.replaceAll("</","");
				out.println(movie);
				System.out.println("以获取信息。");
				
			}
		}
		
		out.close();
	}

}
