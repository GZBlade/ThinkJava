package com.wwj.transform;

public class SwitchApple {

	/**
	 * 1 ����Ʒ�� 
	 * 2 ��Ʒ�� 
	 * 3 �е�Ʒ�� 
	 * 4 һ��Ʒ�� 
	 * 5 ��Ʒ��
	 * 
	 * switch(integer-select){
	 * 		case integer-value0:
	 * 			break;
	 * 		case integer-value1:
	 * 			break;
	 * 		default:
	 * 			break;
	 * }
	 */
	public static void main(String[] args) {

		int appleLevel=3;
		
		switch(appleLevel){
		case 1:
			System.out.println("����Ʒ�� ");
			break;
		case 2:
			System.out.println("��Ʒ�� ");
			break;
		case 3:
			System.out.println("�е�Ʒ�� ");
			break;
		case 4:
			System.out.println("һ��Ʒ��  ");
		case 5:
			System.out.println("��Ʒ��");
			break;
			
		}
		System.out.println("main");
	}
}
