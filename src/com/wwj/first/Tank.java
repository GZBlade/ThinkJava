package com.wwj.first;

/**
 * 赋值操作符
 */
class Tank // 坦克
{
	int level; // 坦克的战斗级别

	// 操作符 <==> 运算符，都是用来操作数据的

	public static void main(String[] args) {

		// 操作符用于操作数据
		Tank t1 = new Tank(); // t1 坦克对象的引用，通过new 关键字 创建了一个坦克对象，对象在堆内存中
		// 通过对象的引用操作对象
		// = 赋值符号 ，把坦克对象的引用赋值给t1,就是把地址赋值给t1

		t1.level = 9;

		Tank t2 = new Tank();
		t2.level = 47;

		System.out.println("1:	t1 level:" + t1.level + "		t2 level:" + t2.level);

		t1 = t2;	//t1 是 t2对象的一个别名
		System.out.println("2:	t1 level:" + t1.level + "		t2 level:" + t2.level);

		t1.level = 33;
		System.out.println("3:	t1 level:" + t1.level + "		t2 level:" + t2.level);

	}
}
