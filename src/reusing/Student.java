package reusing;

public class Student extends Person {

	//ͨ���̳п��Է������еķ���
	public void learn() {
		System.out.println("Student learn");
	}

	private int age;

	@Override
	public String toString() {
		return "name=" + getName() 
		+ "   sex=" + getSex() + "  age=" + age;
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("�");
		student.setSex(1);
		student.age = 28;
		System.out.println(student);
	}

}
