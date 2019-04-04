package exceptions;

public class School {

	public static void main(String[] args) {
		Techer techer = new Techer("����ʦ");
		try {
			techer.prelect();
		} catch (NoPlanException e) {
			System.out.println("���ܽ��ε�ԭ��:" + e.getMessage());
			System.out.println("����");
		}
	}

}

class Techer {
	private String name;
	private Computer computer;

	public Techer(String name) {
		this.name = name;
		computer = new Computer();
	}

	public void prelect() throws NoPlanException {
		try {
			computer.run();
			System.out.println(name + "��ʼ����");
		} catch (LanPingException e) {
			System.out.println(e.toString());
			computer.reset();
			prelect();
		} catch (MaoYangException e) {
			System.out.println("���ܽ�����");
			throw new NoPlanException(e.getMessage());
		}

	}
}

class Computer {

	private int state = 2;

	public void run() throws LanPingException, MaoYangException {
		if (state == 1) {
			throw new LanPingException("��������");
		} else if (state == 2) {
			throw new MaoYangException("����ð��");
		}
		System.out.println("��ʼ����");
	}

	public void reset() {
		state = 0;
		System.out.println("��������");
	}

}

class LanPingException extends Exception {
	LanPingException(String message) {
		super(message);
	}
}

class MaoYangException extends Exception {
	MaoYangException(String message) {
		super(message);
	}
}

class NoPlanException extends Exception {
	NoPlanException(String message) {
		super(message);
	}
}
