package reusing;

import static com.wwj.util.Print.*;
/**
 * ԡ��
 * @author wwj
 */
public class Bath {
//	1 �ڶ�������ʱ��
//	2 ����Ĺ�������
//	3 ��������ʹ�ö���֮ǰ
//	4 ʹ��ʵ����ʼ��
	
	private String name; // null ��������ʼ��
	private String shape; // null ��״
	Soap soap = new Soap(); // ��������ʼ��
	private int length; // ���� 0
	private int capacity; // ���� 0
	
	Bath() {
		System.out.println("Bath()");
		name = "�����ԡ��";
		length = 260;
	}
	
	//ʹ��ʵ����ʼ
	{
		System.out.println("Bathʵ����ʼ��");
		capacity = 200;
	}
	
	public String toString() {
		if(shape ==null) {
			shape = "������";
		}
		return "name="+name +"  shape="+shape
				+"  length="+length+"  capacity="+capacity
				+"  soap="+soap;
	}
	
	public static void main(String[] args) {
		Bath bath =new Bath();
		print(bath);
	}

}
