package reusing;

/**
 * ��ˮ��ϵͳ
 * @author wwj
 *
 */
public class SprinklerSystem {

	// ���
	// ��һ���µ����д���������Ķ���

	Water water = new Water();

	private String name; // �ַ���Ҳ��һ������
	private int i;
	private float f;
	// �� <==> ���� <==>��Ա

	@Override
	public String toString() {
		return "name=" + name + "   i=" + i
				+ "    f=" + f + "    water=" + water;
	}

	public static void main(String[] args) {
		SprinklerSystem sprinklerSystem = new SprinklerSystem();
		System.out.println(sprinklerSystem.toString());
	}

}
