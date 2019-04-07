package arrays;

import static com.wwj.util.Print.print;
import static com.wwj.util.Print.printnb;

public class ArraySelectSort {

	public static void main(String[] args) {

		int[] arr = { 25, 20, 19,3,26, 24, 18, 21, -3,
				30, 180, -999, 1230, 62,1180, 12 };

		selectSort(arr);

		printArr(arr);

		selectSort_2(arr);

		printArr(arr);

		selectSort_3(arr);
		
		printArr(arr);

	}

	private static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			printnb(arr[i] + "\t");
		}
		print("");
	}

	private static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) { //����ѭ������
			for (int j = i + 1; j < arr.length; j++) { //ÿ��Ԫ�����Ƚ�
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

	//���ٶ��ڴ�Ԫ�ؽ�������,�����������
	private static void selectSort_3(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			int num = arr[i];
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (num > arr[j]) {
					num = arr[j];
					index = j;
				}
			}
			arr[index] = arr[i];
			arr[i] = num;
		}
	}

	private static void selectSort_2(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

}
