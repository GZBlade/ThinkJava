package com.wwj.first;

public class TernaryIfElse {

	public static void main(String[] args) {

		System.out.println(ternary(12));
		System.out.println(standIfElse(11));
		
	}

	public static int ternary(int a) {
		// ��Ŀ������/����� Ҳ���� ����������
		// booleanexp ? value0: values1;
		return a > 10 ? a * 100 : a * 10;	//������
	}

	public static int standIfElse(int a) {
		//��������
		if (a > 10) {
			return a * 10;
		} else {
			return a * 10;
		}
	}
	

}
