package annotatonreflection;

public class TestClassLoader {

	public static void main(String[] args) {

		Class clazz = TestClassLoader.class;
		ClassLoader classLoader = clazz.getClassLoader();

		while (classLoader != null) {
			System.out.println(classLoader);
			classLoader = classLoader.getParent();
		}
		System.out.println("�����������"+classLoader); //�������������null

//		AppClassLoader ϵͳ���������,Ҳ����Ӧ�ó����������
//		������� Class ���������������������,��JVM�Զ�������
//		���������඼��ClassLoader���ص�

		String[] strs = new String[1];
		strs[0] = new String();

		System.out.println(strs.getClass());
		System.out.println(strs.getClass().getClassLoader());
		System.out.println(strs[0].getClass().getClassLoader());

		int[] arr = new int[3];
		System.out.println(arr.getClass());
		System.out.println(arr.getClass().getClassLoader());

	}

}
