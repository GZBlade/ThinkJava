package generic.people;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(new Student("�",26));
		al1.add(new Student("�",25));

		ArrayList<Worker> al2 = new ArrayList<Worker>();
		al2.add(new Worker("������",27));
		al2.add(new Worker("����",26));
		

		printCollection(al1);
		printCollection(al2);
		
		System.out.println("------------------");
		printCollection2(al1);
//		printCollection2(al2);
	}

	//? ͨ������ 	��֪������������
	//ֻ�ܴ�ӡPerson������� ���� ����������  
	//ָ�����͵�����
	private static void printCollection(ArrayList<? extends Person> al1) {
		@SuppressWarnings("unchecked")
		Iterator<Person> iterator = (Iterator<Person>) al1.iterator();
		while (iterator.hasNext()) {
			Person person=iterator.next();
			System.out.println(person.getName()+person.getAge());
		}
	}

	//ָ�����͵�����
	private static void printCollection2(ArrayList<? super Student> al1) {
		@SuppressWarnings("unchecked")
		Iterator<Person> iterator =  (Iterator<Person>) al1.iterator();
		while (iterator.hasNext()) {
			Person person=iterator.next();
			System.out.println(person.getName()+person.getAge());
		}
	}
}
