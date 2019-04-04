package exceptions;

import static com.wwj.util.Print.*;

class Pig {
	String name;

	Pig(String name) {
		this.name = name;
	}
}

public class PigSty {

	// RunntimeException ������ʱ�쳣�������������������Դ����޸ĳ��������������
	// [] [] []
	public String getPigName(Pig[] pigs, int index) {
		// java.lang.NullPointerException
		// java.lang.ArrayIndexOutOfBoundsException
		
//		if (pigs == null) {
//			throw new NullPointerException("С�����鲻����Ϊ��");
//		}
//
//		if (index > pigs.length) {
//			throw new ArrayIndexOutOfBoundsException("���ǣ��㴫�ݴ������鳤�ȵ������ǲ��Ƿ��ˣ�");
//		}
//		if (index < 0) {
//			throw new ArrayIndexOutOfBoundsException("�����㴫��С��0�����������!");
//		}
		String name = pigs[index].name;
		return name;
	}

	public static void main(String[] args) {

		PigSty pigSty = new PigSty();
		Pig[] pigs = { new Pig("С��1"), new Pig("С��2"), new Pig("С��3") };

		print(pigSty.getPigName(pigs, 30));

	}

}
