package annotatonreflection;

import java.util.Random;

//�ӿڳ�ʼ����Ҫ�󸸽ӿڳ�ʼ��
public class ClassLoadUse2 {

//	�����Ϊ��������� 
	public static void main(String[] args) {
		System.out.println(Art.a);
	}

	static {
		System.out.println("ClassLoader2");
	}

}

interface Art {
	public static final int a = new Random().nextInt(10);
	Thread thread = new Thread() {
		{
			System.out.println("Art thread ����");
		}
	};
}

interface Draw extends Art {
	Thread thread = new Thread() {
		{
			System.out.println("draw thread ����");
		}
	};
	int b = new Random().nextInt(20);
}
