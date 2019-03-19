package reusing;

public class SpaceControlDelegation {

	//̫�մ�����������
	SpaceControls spaceControls = new SpaceControls();

	// ��ǰ
	public void foward() {
		spaceControls.foward();
	}

	public void back() {
		spaceControls.back();
	}

	public void left() {
		spaceControls.left();
	}

	public void right() {
		spaceControls.right();
	}

	public static void main(String[] args) {
		SpaceControlDelegation spaceControlDelegation=
				new SpaceControlDelegation();
		spaceControlDelegation.left();
		spaceControlDelegation.foward();
	}

}
