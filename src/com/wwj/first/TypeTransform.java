package com.wwj.first;

/**
 * ����ת��
 */
public class TypeTransform {

	public static void main(String[] args) {
		//ǿ������ת��
		int a=100;	//4 ���ֽ�
		long b=a;	//8 ���ֽ�
		long c=(long)a;
		
		System.out.println("a="+a+"---b="+b+"---c="+c);
		
		
		int d =(int)c;
		System.out.println("d="+d);
		
		
		float f1= 10.52342324f;	//4 ���ֽ�
		double d1=f1;		//8 ���ֽ�
		System.out.println("f1="+f1+"--d1="+d1);
		
		float f2 =(float) d1;
		System.out.println("f2="+f2);
		
		//��β������
		double d2=234.56;
		System.out.println((int)f1+"-------d2="+(int)d2);
		
		double d3=f2 * d2;
		System.out.println("d3="+d3);
	}

}
