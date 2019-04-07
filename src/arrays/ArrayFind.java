package arrays;

public class ArrayFind {

	public static void main(String[] args) {
		int[] arr = { 18, 20, 21, 24, 25, 26, 30, 90, 180, 999 };
		int key = 33333;
		int position = findStudentPostion(arr, key);
		System.out.println("ѧ��λ��=" + position);

		position = findStudentPositionBinary(arr, key);
		System.out.println("ѧ��λ�ö��ַ�����=" + position);
		
		position = findStudentPositionBinary_2(arr, key);
		System.out.println("ѧ��λ�ö��ַ�����=" + position);

	}

	public static int findStudentPositionBinary(int[] arr, int key) {
		int head = 0;// ͷԪ������
		int tail = arr.length - 1; // βԪ������
		int mid = (head + tail) / 2;// �м�Ԫ������
		int count = 0;
		while (arr[mid] != key) {
			if (key > arr[mid]) {
				head = mid + 1;
			} else if (key < arr[mid]) {
				tail = mid - 1;
			}
			mid = (head + tail) / 2;
			count++;
			if (tail < head) {
				return -1;
			}
		}
		System.out.println(String.format("������%d��", count));
		return mid;
	}

	public static int findStudentPositionBinary_2(int[] arr, int key) {
		int head = 0;// ͷԪ������
		int tail = arr.length - 1; // βԪ������
		int mid = 0;
		int count = 0;
		while (head <= tail) {
			count++;
			mid = (head+tail) >>1; //����2
			if(key>arr[mid]) {
				head=mid+1;
			}else if(key<arr[mid]) {
				tail = mid-1;
			}else {
				System.out.println(String.format("������%d��", count));		
				return mid;
			}
		} 	
		return -1;
	}

	private static int findStudentPostion(int[] arr, int stuNo) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == stuNo) {
				System.out.println(String.format("������%d��", i));
				return i;
			}
		}
		return -1;
	}

}
