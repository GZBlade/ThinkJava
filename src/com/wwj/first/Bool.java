package com.wwj.first;

public class Bool {

	
	public static void main(String[] args) {
		
		int a=3;
		int b=4;
//		�ǲ���ֵ���ܵ�������ֵ���߼����ʽ��ʹ��
		//&&   ||  !
		
		//�߼��������߱���ͬʱ����
		boolean res=(a>1) && (b>2);	//true
		System.out.println("res="+res);
		
		//�߼��� �ж�·
		boolean q1= (a>3) && (b>2);	//false
		
		System.out.println("q1="+q1);
		
		boolean q2= (a>=2) || (b<10);	//true
		
		System.out.println("q2="+q2);
		
		//�߼���ֻ��һ�����㼴��
		boolean q3= (a>=4) || (b<10);	//true
		
		System.out.println("q3="+q3);
		
		boolean x1= !(b>10);	//���漴�٣��Ǽټ���
		System.out.println("x1="+x1);
		
		boolean x2= !(b>1);	//false
		System.out.println("x2="+x2);
		
		

	}

}
