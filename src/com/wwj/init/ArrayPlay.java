package com.wwj.init;
import java.util.Random;
public class ArrayPlay {
	public static void main(String[] args) {
		palyArr();
	}
	static void palyArr(){
		//���鶨�� ��������[] ������
		int[] arr1={1,2,3}; //��������ʱ����ֵ
		int[] arr3;
		arr3= arr1; //����arr1���������
		//����ʱһ�����ݿռ�������,����������ͬ�Ķ�������
//		for(��ʼ��;���ʽ;����)
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
		System.out.println("--------");
		for(int x:arr3){
			System.out.println(x);
		}
		
		Random random=new Random(30);
		int[] arr4=new int[random.nextInt(10)];
		//������ڴ��ڳ�������Ƿ����
		for(int i=0;i<arr4.length;i++){
			arr4[i]=random.nextInt(10);
		}
		
		for(int a:arr4){
			System.out.println("a="+a);
		}
		
		Integer[] arr5=new Integer[]{
				234, //�Զ�װ��
				new Integer(3),
				6
		};
		System.out.println("------Integer---");
		for(int x:arr5){ //�Զ�����
			System.out.println(x);
		}
	}
}
