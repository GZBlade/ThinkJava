package holding;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {

	public static void main(String[] args) {
		List<Pet> petList=new LinkedList<Pet>();
		petList.add(new Pet("С������"));
		petList.add(new Pet("ϲ����"));
		petList.add(new Pet("��̫��"));
		
		for (Pet p : petList) {
			System.out.println(p);
		}
		System.out.println("----remove(1)----------");
		petList.remove(1);

		int size = petList.size();
		for (int i = 0; i < size; i++) {
			System.out.println(petList.get(i));
		}
		
		Pet pet = petList.get(0);
		System.out.println("contains=" + petList.contains(pet));
		petList.remove(pet);
		int index = petList.indexOf(pet);
		System.out.println("indexOf=" + index);
		
		Pet[] petArr = new Pet[petList.size()];
		petList.toArray(petArr);
		for (Pet p : petArr) {
			System.out.println(p);
		}
		
		petList.add(new Pet("������"));
		petList.add(new Pet("��ľ��"));

		Iterator<Pet> iterator = petList.iterator();
		while (iterator.hasNext()) {
			Pet p = iterator.next();
			System.out.println("iterator----" + p);
		}
		
		ListIterator<Pet> listIterator = petList.listIterator();
		while (listIterator.hasNext()) {
			Pet p = listIterator.next();
			System.out.println(p);
		}
		while(listIterator.hasPrevious()) {
			Pet p=listIterator.previous();
			System.out.println("---listiterator-"+p);
		}

	}

}
