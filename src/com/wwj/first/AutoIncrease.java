package com.wwj.first;

class  AutoIncrease
{
	public static void main(String[] args) 
	{
		
		// �Զ������͵ݼ�
		// ����һ����Ԫ���߼���һ����Ԫ
		//�ٸ�����

		int a=10;
		System.out.println("a="+a);

		//ǰ׺����
		System.out.println("++a ="+ (++a));	// a = a+1   11  �����㣬�ٸ�ֵ

		//��׺����
		System.out.println("a++ ="+ (a++)); // �ȸ�ֵ�����Ŵ�ӡ��������	a =11

		System.out.println("a="+a);	// a= 12

		System.out.println("---------------------");

		//��׺�ݼ�
		System.out.println("a-- ="+ (a--));	//a=12 a = a-1   �ȸ�ֵ 12�����Ŵ�ӡ��������	a =12-1
		System.out.println("a="+a);	//a=11

		//ǰ׺�ݼ�
		System.out.println("--a ="+ (--a));	//a=a-1  a=11-1  a=10	 // �����㣬�ڸ��ƣ�����ӡa
		System.out.println("a="+a);	//a=10


	}
}
