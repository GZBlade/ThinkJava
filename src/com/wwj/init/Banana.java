package com.wwj.init;

public class Banana {

	String name="a";
	int count;

	// �޲ι��캯�� <==> Ĭ�Ϲ��캯��
	public Banana() {
		System.out.println("---No Args Construct------");
	}

	// this:���÷������Ǹ���������
	// ���캯�� : ���ⷽ��
	public Banana(String name, int count) {
		this.name = name;
		this.count = count;
	}

	void print() {
		System.out.println("��������" + name + count + "��");
	}
	
	Banana increment(){
		count ++;
		return this;
	}

	public static void main(String[] args) {

//		Banana a = new Banana();

		Banana b = new Banana("�㶫�㽶", 6);
		b.print();
		b.increment().increment().increment().print();

	}

}
