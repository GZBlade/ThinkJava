package com.wwj.first;

/**
 * ��ֵ������
 */
class Letter // �����ŷ�
{
	char c; // ���е����� <==> ���еĳ�Ա

	// ������ <==> ����� �� + - * / = .

	public static void main(String[] args) {
		Letter l1 = new Letter(); // l1 ָ�� �ŷ����

		l1.c = 'A';	//�ַ�A��һ������
			
		l1.c = 'Z';	//�ַ�Z��һ������

		System.out.println("------" + l1.c);	//------Z

		sendLetter(l1);

		System.out.println("------" + l1.c);	//------H
	}

	// ����sendLetter���������ݵĲ����Ƕ��������
	public static void sendLetter(Letter letter) {
		letter.c = 'H';
	}

}
