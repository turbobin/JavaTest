/*
 * object:是所有对象的直接后者间接父类，传说中的上帝。
 * 该类中定义的是所有对象都具备的功能
 * 
 * Object类中已经提供了对对象是否相同的比较方法。
 * 如果自定义类中也有比较相同的功能，没有必要重新定义，
 * 只要沿袭父类中的功能，建立自己特有比较内容即可，这就是覆盖。
 */
class ObjDemo	//	extends Object
{
	private int num;
	ObjDemo(int num)
	{
		this.num = num;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof ObjDemo))
			return false;
		
//		return this.num = obj.num;  //Object类型无法调用num，必须先转成子类
		ObjDemo d = (ObjDemo)obj;	//向下转型
		return this.num == d.num;
	}
	public String toString()
	{
		return "demo:"+this.num;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ObjDemo d1 = new ObjDemo(4);
		System.out.println(d1.toString());
		
		ObjDemo d2 = new ObjDemo(5);
		System.out.println(d2.toString());
		ObjDemo d3 = d1;
		
		System.out.println(d1.equals(d3));
		System.out.println(d1==d2);
		System.out.println(d1==d3);
//		
//		System.out.println(d1.getClass()); //class ObjDemo
//		
//		System.out.println(d1.getClass().getName()); //ObjDemo
//		System.out.println(Integer.toHexString(d1.hashCode())); //1db9742
//		
//		System.out.println(d1.toString());	//ObjDemo@1db9742

	}

}
