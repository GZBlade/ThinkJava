package reusing;

public class FinalData {

	// ���� <==> ��
	// �����ڳ���
	static final int VALUE_1 = 10;
	public static final int VLAUE_2 = 20;

	// ��final���ε��򸳳�ֵ���Ǻ㶨�����
	private final int like = 30;

	// final ���εĶ������ò��ܸı�,�������ݿ��Ա�
	final Value value = new Value(like);

	// final ���ε���ʱû�г�ʼ��
	private final int j;
	private final Value value2;

	FinalData() {
		j = 10;
		value2 = new Value(j);
	}

	//������μ��ص�
	public static void main(String[] args) {
//		VALUE_1 =20;
//		value =new Value(VLAUE_2);
		FinalData finalData = new FinalData();
		
		finalData.value.i =30;
		
		System.out.println("j="+finalData.j
				+"  value.i="+finalData.value.i);
	}

	class Value {
		int i;

		Value(int i) {
			this.i = i;
		}
	}

}
