package exceptions;

import java.io.ObjectInputStream.GetField;

/**
 * ���ӵ�С��
 * 
 * @author wwj
 *
 */
public class RabbitHourse {

	public String getName(Rabbit[] rabbits, int index)
			throws NullPointerException, ArrayIndexOutOfBoundsException, FuShuException {

		if (rabbits == null) {
			throw new NullPointerException();
		}
		if (index >= rabbits.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		if (index < 0) {
			throw new FuShuException();
		}

		return rabbits[index].name;
	}

	public static void main(String[] args) {
		RabbitHourse hourse = new RabbitHourse();
		Rabbit[] rabbits = { new Rabbit("С����1"), new Rabbit("С����2"), new Rabbit("С����3"), };
		try {
			hourse.getName(rabbits, -1);
		} catch (NullPointerException e) {
			System.out.println("��ָ���쳣");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("��������Խ���쳣");
		} catch (FuShuException e) {
			System.out.println("����Ϊ����");
			e.printStackTrace();
		}
		System.out.println("main over");

	}

}

class FuShuException extends Exception {

}

class Rabbit {
	String name;

	Rabbit(String name) {
		this.name = name;
	}
}