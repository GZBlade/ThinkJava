package annotatonreflection;

public class ClassLoadUser {

	public static void main(String[] args) {

		Circle circle=new Circle();
//		static Shape
//		static Circle
//		Shape()
//		Circle()
	}

}

class Shape{
	static {
		System.out.println("static Shape");
	}
	Shape(){
		System.out.println("Shape()");
	}
}

//��ʼ���������
class Circle extends Shape{
	static {
		System.out.println("static Circle");
	}
	Circle(){
		System.out.println("Circle()");
	}
}
