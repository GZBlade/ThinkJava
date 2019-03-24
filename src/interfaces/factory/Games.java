package interfaces.factory;

public class Games {

	static void playGame(GameFactory gameFactory) {
		Game game = gameFactory.getGame();
		while(game.move()) {
		}
	}
	
	//͸���Ľ�ĳһ��ʵ���滻Ϊ��һ��ʵ��
	public static void main(String[] args) {
		playGame(new ChessFactory());
		playGame(new GobangFactory());
		
	}
	
//	Chess move 0
//	Chess move 1
//	Chess move 2
//	Chess move 3
//	Gobang move 0
//	Gobang move 1
//	Gobang move 2
//	Gobang move 3
//	Gobang move 4

}
