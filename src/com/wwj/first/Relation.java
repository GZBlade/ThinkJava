package com.wwj.first;

public class Relation {

	public static void main(String[] args) {

		Integer a1 = new Integer(32);

		Integer a2 = new Integer(32);

		// ��ϵ������ == != >= <= > <
		// == != �������ڻ����������ͣ�Ҳ��������������������

		System.out.println("a1==a2		" + (a1 == a2)); // == �Ƚϵ��ǵ�ַ false

		System.out.println("a1!=a2		"+ (a1 != a2)); // true		
		
		System.out.println(a1.equals(a2));  //equal �Ƚϵ������õĶ�������
		

	}

}
