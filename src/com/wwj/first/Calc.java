package com.wwj.first;

/**
 * ����������
 */
class Calc {
	public static void main(String[] args) {
		Calc calc = new Calc();

		// ��������������֮�󣬵��ü������Ĺ���

		int result = calc.add(3, 5);
		System.out.println("result=add(3,5)=" + result);	//8

		result = calc.minus(30, 18);
		System.out.println("result=minus(30,18)=" + result);	//12

		result = calc.mulit(20, 30);
		System.out.println("result=calc.mulit(20,30)=" + result);	//600

		int h = calc.dive(1000, 50);
		System.out.println("h=calc.dive(1000,50)=" + h);	//20

	}

	/*
	 * �ӷ�
	 */
	public int add(int a, int b) {
		return a + b; // + ����������a��b�ļӷ�����
	}

	/**
	 * ����
	 */
	public int minus(int a, int b) {
		return a - b;	//���Ų������������������,���ɽ��,ͨ��return ���ؽ��
	}

	// �˷�
	public int mulit(int a, int b) {
		return a * b;
	}

	// ����		����ռ4���ֽڣ�ÿ���ֽ����������һ��С����
	//ÿ��С���Ӵ��8λ		1byte=8bits
	public int dive(int a, int b) {
		return a / b;
	}

}
