class Tank	//̹��
{
	int level; //̹�˵�ս������

	// ������ <==>  ����������������������ݵ�

	public static void main(String[] args) 
	{
		
		Tank t1=new Tank(); // t1 ̹�˶�������ã�ͨ��new �ؼ��� ������һ��̹�˶��󣬶����ڶ��ڴ���
		// ͨ����������ò�������
		// = ��ֵ����  ����̹�˶�������ø�ֵ��t1,���ǰѵ�ַ��ֵ��t1
		// ������ + = * / -

		t1.level=9;

		Tank t2=new Tank();
		t2.level=47;

		System.out.println("t1 level:"+t1.level+"		t2 level:"+t2.level);

		t1 = t2;
		System.out.println("t1 level:"+t1.level+"		t2 level:"+t2.level);

		// ������󣺶������� ��������

		t1.level=33;
		System.out.println("t1 level:"+t1.level+"		t2 level:"+t2.level);


	}
}
