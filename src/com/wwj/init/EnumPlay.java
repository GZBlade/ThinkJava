package com.wwj.init;

public class EnumPlay {

//	public enum STATUS {
//		GOOD, BAD, VERY_GODD, NICE, JUST_SO_SO
//	}

	public static void main(String[] args) {

		STATUS status = STATUS.BAD;

		print(status);
		print(STATUS.VERY_GODD);

		for (STATUS s : STATUS.values()) {
			System.out.println(s + "----" + s.ordinal());
		}

	}

	static void print(STATUS status) {
		// switch(�������ʽ){
		// case:��������
		// break;
		// }

		switch (status) {
		case GOOD:
			System.out.println("ͦ�õ�");
			break;
		case BAD:
			System.out.println("----����---");
			break;
		case VERY_GODD:
			System.out.println("---�ü���----");
			break;
		default:
			break;
		}
	}

}
