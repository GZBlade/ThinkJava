package innerclass.parcel;

import static com.wwj.util.Print.*;

/**
 * ���
 */
public class Parcel {
	
	private String name;

	// ���� <==> ����
	class Content {
		String content;

		public Content(String gift) {
			this.content = gift;
		}
	}

	// Ŀ�ĵ�
	class Destination {
		String label;

		Destination(String whereTo) {
			label = whereTo;
//			ship("���","����");
//			name = "��è���";
		}
		
	}

	public Content content(String gift) {
		return new Content(gift);
	}

	Destination to(String whereTo) {
		return new Destination(whereTo);
	}

	private void ship(String gift, String whereTo) {
		Content content = content(gift);
		Destination destination = to(whereTo);
		print(content.content);
		print(destination.label);
	}

	public static void main(String[] args) {
		Parcel parcel = new Parcel();
		parcel.ship("������", "����������");
		
//		Destination destination=new Destination("");

	}

}
