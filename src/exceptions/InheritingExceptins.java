package exceptions;

public class InheritingExceptins {

	
	static void f() throws SimpleException{ //�쳣��������
		//throws ����ʱ�쳣��
		System.out.println("f()");
		throw new SimpleException(); //throw ����ʱ�쳣����
//		int a = 0;
	}
	
	public static void main(String[] args) {

		try {
			f();		
		}catch(SimpleException e) { //�쳣�������
			System.out.println("������������쳣");
			e.printStackTrace();
//			exceptions.SimpleException  �쳣���ƴ�������ʲô��
//			at exceptions.InheritingExceptins.f(InheritingExceptins.java:9)  �������ĸ��ط�
//			at exceptions.InheritingExceptins.main(InheritingExceptins.java:15)
		}
		//���쳣�������������������쳣״̬��������״̬
		System.out.println("main over");
	}

}

class SimpleException extends Exception {

	SimpleException() {
		super();
	}

//	�����ָ����ϸ��Ϣ
	SimpleException(String message) {
		super(message);
	}

}
