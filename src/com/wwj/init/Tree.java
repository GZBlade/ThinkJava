package com.wwj.init;

public class Tree {

	public static void main(String[] args) {

		Tree t1=new Tree("����",6);
		t1.info(8, "������");
		t1.info("��ͩ��", 5);
		
		Tree t2=new Tree(3,"����");
	}
	
	public Tree(String name,int tall){
		System.out.println("name="+name+"---tall="+tall);
	}

	public Tree(int tall,String name){
		System.out.println("tall="+tall+"---name="+name);
	}
	
	//�ͷ���ֵ�޹�
	//��������ͬ
	//�����б�ͬ
	public int info(String name,int tall){
		System.out.println("name="+name+"---tall="+tall);
		return 10;
	}
	
	public void info(int tall,String name){
		System.out.println("tall="+tall+"---name="+name);
	}
}
