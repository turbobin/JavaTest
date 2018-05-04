/*
 * ʹ��java�Դ�derby���ݿ������������Ӳ��������ݿ⡣
 */

import java.sql.*;
import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class TestDB {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Properties prop = new Properties();
//		try (InputStream in =  Files.newInputStream(Paths.get("database.properties")))
//		{
//			prop.load(in);
//		}
//			
//		String driver = prop.getProperty("jdbc.url");
//		System.out.println(driver);
		
		String dirverName = "org.apache.derby.jdbc.AutoloadedDriver";//�ɲ�װ�أ����Զ�ע��
//		String url = "jdbc:derby://localhost:1527/SQLTEST";
		String url = "jdbc:derby:MYDBSQL;create=true";
//		String username = "app";
//		String password = "";
		try (Connection conn = getConnection(dirverName,url))
		{
//			System.out.println(conn);
			Statement stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		
//			stat.executeUpdate("CREATE TABLE ACCOUNT(USER_NAME CHAR(20) "
//					+ "primary key,ACCOUNT_ID CHAR(20))");
//			stat.executeUpdate("INSERT INTO ACCOUNT VALUES('liuyh.sdc','DGDP512')");
//			stat.executeUpdate("INSERT INTO ACCOUNT VALUES('yerx.sdc','DGDP312')");
			//��ȡ���еı���
			DatabaseMetaData meta = conn.getMetaData();
			System.out.println("�����������ݿ�ĸ�����"+meta.getMaxConnections());
			ResultSet mrs = meta.getTables(null, null, null, new String[]{"TABLE"});
			while(mrs.next())
			{
				System.out.println("����:"+mrs.getString(3));
				System.out.println("��Ŀ¼:"+mrs.getString(1));
				System.out.println("��ģʽ(Schema):"+mrs.getString(2));
				System.out.println("�����ͣ�):"+mrs.getString(4));
			}
			
			
			try(ResultSet result = stat.executeQuery("select * from ACCOUNT"))
			{
				
//				System.out.println(result.getType());
				
				//��ȡ����
				ResultSetMetaData metadata = result.getMetaData();
				for(int i=0;i<metadata.getColumnCount();i++)
				{
//					String columName = metadata.getColumnLabel(i+1);
					String columName = metadata.getColumnName(i+1);
					System.out.print(columName+"\t");
				}
				System.out.println();
				for(int i=0;i<metadata.getColumnCount();i++)
				{
					System.out.print("---------\t");
				}
				System.out.println();
//				ResultSet s = stat.getResultSet();	//����ǰһ����ѯ���Ľ����
//				System.out.println(s.findColumn("USER_NAME"));
				//��ȡ����
				while (result.next())
				{
					for(int i=0;i<metadata.getColumnCount();i++)
					{
						System.out.print(result.getString(i+1).trim()+"\t");
			
					}
					System.out.println();
				}
				
			}
			
//			stat.executeUpdate("drop TABLE ACCOUNT");
			//ʹ��try�����Բ����ֶ��ر�����
			stat.close();
			conn.close();
		}

	}
	
	public static Connection getConnection(String driverName,String url) throws Exception
	{
//		Class.forName(driverName).newInstance();	//java�ķ��䣻derby�����ֶ�װ�ء�
		return DriverManager.getConnection(url);
		
	}

}
