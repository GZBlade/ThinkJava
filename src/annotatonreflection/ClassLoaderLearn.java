package annotatonreflection;

public class ClassLoaderLearn {

	public static int a=15;
	
	static {
		System.out.println("static a="+a);
	}
	
	//----����------
	//1 �ҵ��ֽ����ļ�,����ҵ��ֽ����ļ�
	//2 ���ֽ����ļ�����Class����
	
	//-----����------
	//1  �ֽ�����а�ȫ���
	//2 int a ����4���ֽڵ��ڴ�  a=0
	//3 �����еķ�������ת��Ϊֱ������
	
	//-----��ʼ��------
	//��ľ�̬����������ȷ�ĳ�ʼֵ
	// a = 15
	
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		System.out.println("main a="+ClassLoaderLearn.a);
//		
//		ClassLoaderLearn classLoaderLearn=new ClassLoaderLearn();
		
//		try {
//			@SuppressWarnings("all")
//			Class<ClassLoaderLearn> clazz=(Class<ClassLoaderLearn>) Class.forName("annotatonreflection.ClassLoaderLearn");
//			System.out.println(clazz);
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
//		ClassLoaderLearn.add(5,6);
		
		
	}

}
