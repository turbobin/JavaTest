/*
 * object:�����ж����ֱ�Ӻ��߼�Ӹ��࣬��˵�е��ϵۡ�
 * �����ж���������ж��󶼾߱��Ĺ���
 * 
 * Object�����Ѿ��ṩ�˶Զ����Ƿ���ͬ�ıȽϷ�����
 * ����Զ�������Ҳ�бȽ���ͬ�Ĺ��ܣ�û�б�Ҫ���¶��壬
 * ֻҪ��Ϯ�����еĹ��ܣ������Լ����бȽ����ݼ��ɣ�����Ǹ��ǡ�
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
		
//		return this.num = obj.num;  //Object�����޷�����num��������ת������
		ObjDemo d = (ObjDemo)obj;	//����ת��
		return this.num == d.num;
	}
	public String toString()
	{
		return "demo:"+this.num;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
