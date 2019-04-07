package arrays;

public class Scale {
	

	static char[] table= {
			'0','1','2','3',
			'4','5','6','7',
			'8','9','A','B',
			'C','D','E','F'
	};

	public static void main(String[] args) {
		int num = 100;
		
		toBinary(num);
		toOct(num);
		toHex(num);
	}
	
	private static void toBinary(int num) {
		toScale(num,1,1);
	}
	
	private static void toOct(int num) {
		toScale(num,7,3);
	}

	private static void toHex(int num) {
		toScale(num,15,4);
	}
	
	/**
	 * @param num  Ҫת��������
	 * @param base  ���ֽ���    16����  15            �˽���  7             ������  1
	 * @param offset  ���Ƽ�λ           16���� ����4   8���� ����3λ     ������ ���� 1λ
	 */
	public static void toScale(int num,int base, int offset) {
		//int 32λ 4���ֽ�     ʮ������ ����һ���ֽ�,4λ
		char[] arr = new char[32];
		int pos = arr.length;

		while (num != 0) {
			int temp = num & base;
			arr[--pos] = table[temp];
			num = num >>> offset;
		}

		for (int i = pos; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();

//		int temp = num & 15; // ȡ�������ֵ
//		System.out.println(temp);
//
//		num = num >>> 4;
//		temp = num & 15;
//		System.out.println(temp);
//
//		num = num >>> 4;
//		temp = num & 15;
//		System.out.println(temp);

	}

}
