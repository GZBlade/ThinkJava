package com.wwj.first;

class Letter //�����ŷ� 
{
	char c; //���е����� <==>	���еĳ�Ա

	//������ <==> ����� �� + - * / =  .

	public static void main(String[] args) 
	{
		Letter l1=new Letter();	// l1 ָ�� �ŷ����

		l1.c='A';

		System.out.println("------"+l1.c);

		sendLetter(l1);

		//����Ƕ�������ã���ӡ����H
		//����Ƕ���Ŀ�������ӡ����A
		System.out.println("------"+l1.c);
		
	}

	//����sendLetter���������ݵĲ����Ƕ����Ӧ�û��Ƕ���Ŀ���
	public static void sendLetter(Letter letter){
		letter.c='H';
	}

}
