package com.wwj.first;

/**
 * ��ϵ������
 */
public class Relation {

	public static void main(String[] args) {

		Integer a1 = new Integer(32);

		Integer a2 = new Integer(32);

		// ��ϵ������ == != >= <= > <
		// == != �������ڻ����������ͣ�Ҳ��������������������

		// ��ϵ�������������ɲ���ֵ

		// == != ���ԱȽ����е���������

		int a = 30;
		int b = 35;

		System.out.println("a1==a2		" + (a1 == a2)); // == �Ƚϵ��Ƕ���ĵ�ַ false

		System.out.println("a1!=a2		" + (a1 != a2)); // true

		// ��ô�Ƚ϶��������,JAVA���������ͻ�����ʵ����equals����
		System.out.println("a1.equals(a2)		" + a1.equals(a2)); // equal �Ƚϵ��Ƕ�������
		// true

		System.out.println("a==b	" + (a == b)); // false

		System.out.println("a>b		" + (a > b));	//false
		
		System.out.println("a<b		"+(a<b));
		
		

	}

}
