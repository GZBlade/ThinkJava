package arrays;

import static com.wwj.util.Print.print;
import static com.wwj.util.Print.printnb;

public class ArrayMaoPaoSort {

	public static void main(String[] args) {
		int[] arr = { 25, 20, 19,3,26, 24, 18, 21, -3,
				30, 180, -999, 1230, 62,1180, 12 };

		maopaoSort(arr);
		printArr(arr);

		maopaoSort_2(arr);
		printArr(arr);
	}

	static void maopaoSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) { //����ѭ������
			for (int j = 0; j < arr.length - 1 - i; j++) {//Ԫ�ؽ��бȽ�
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	static void maopaoSort_2(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	private static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			printnb(arr[i] + "\t");
		}
		print("");
	}

}
