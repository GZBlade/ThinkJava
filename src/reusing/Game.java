package reusing;

public class Game {

	Game(int i) {
		System.out.println("Game() i=" + i);
	}
	
	//��Ϸʱ��
	protected int duration ;
	
	protected void printGameDuration() {
		System.out.println("---��Ϸʱ��="+duration);
	}

}
