package reusing;

class Circle extends Shape {

	Circle() {
		super();
		System.out.println("Circle()");
	}

	void erase() {
		System.out.println("Erase Circle");
		super.erase();
	}

//	//�������������
//		final void size() {
//			
//		}
	// û����д�����position����
	// �Լ���ĵ�һ�γ������û 
	final void position(int x, int y) {
		System.out.println("Circle x=" + x + "  y=" + y);
	}

}
