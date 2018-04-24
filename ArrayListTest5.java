import java.util.*;
public class ArrayListTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("04");
		list.add("06");
		list.add("08");
		list.add("03");
		list.add("10");
//		Iterator<String> it = list.iterator();
//		String type = null;
		String addr = null;
		boolean flag = false;
		
//		优先级 ：10 > 03 > 08
		for(String type : list)
//		while(it.hasNext())	//循环开始
		{
//			type = it.next();			
			if(type == "10")
			{
				addr = "address10";
				break;	//跳出循环
			}else if(type == "03")
			{
				addr = "address03";
				flag = true;
			}else if(type == "08")
			{
				if(!flag)
					addr = "address08";
			}	
		}
		System.out.println(addr);

	}

}
