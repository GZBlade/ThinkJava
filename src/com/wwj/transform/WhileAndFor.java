package com.wwj.transform;
import java.util.Random;

public class WhileAndFor {

	public static void main(String[] args) {
		while (isCondition()) {
			System.out.println("---while----");
		}
		// for(init ; booleanexpression ; step){
		// ���
		// }
		int[] stu = new int[10];
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int age = random.nextInt(20) + 1;
			stu[i] = age;
		}

		// for(���� x:����){
		// ���
		// }
		for (int x : stu) {
			System.out.println("x=" + x);
		}
	}

	// while(booleanexpresion){
	// ���
	// }
	static boolean isCondition() {
		double dr = Math.random(); // 0 -1 ֮�����֣�������1
		System.out.print(dr);
		if (dr < 0.8) {
			return true;
			// return ��������
			// ִ�з���ֵ
			// ��������
		} else {
			return false;
		}
	}
}
