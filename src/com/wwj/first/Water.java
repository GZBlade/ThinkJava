package com.wwj.first;

import java.util.*; //util�� �����������ȫ���������
//���൱��Windows ϵͳ���ļ���
class Water   //�ļ���������ߵ��Ǹ�����һ����
{
	public static void main(String[] args) 
	{
		Water.stream(SOLID);
		System.out.println(new Date());
	}
	/*  ���������ע��
		ˮ������ֱ��״̬
		ˮ������״̬��ˮ�����ԣ�����Ҫˮ�������
		1 Һ̬   2 ��̬   3 ��̬
		ˮ��ֱ����Ϊ
		��������ˮ��������Ϊ������Ҫ����	
	*/
	public static final int LIQUID=1; //Һ̬   ���������Ǵ�д
	// ������ľ���ע��
	public static final int GAS=2; //��̬ ����������д
	public static final int SOLID=3; //��̬
	/*
		ˮ������������ģ�����Ҫ����
	*/
	public static void stream(int state){ 
		/*
			if(�������ʽ){
			}else if(�������ʽ){
			}else{
			}
		*/
		if(state==LIQUID){
			System.out.println("ˮ��Һ̬������������");
		}else if(state==GAS){
			System.out.println("ˮ����̬�������������������ǿ�������");
		}else if(state==SOLID){
			System.out.println("ˮ�ǹ�̬��������������");
		}
	}
}
