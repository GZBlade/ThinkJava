package reusing;

public class Chess extends BoardGmae {

	Chess(int i) {
		super(i);
		System.out.println("Chess() i="+i);
	}
	
	//��������
	private int count;
	
	public static void main(String[] args) {
		Chess chess=new Chess(10);
		
		//��������ָ���������
		//������ת��
		Game game=new Chess(30);
		game.duration =10;
		game.printGameDuration();
//		game.printChessCount();
		
		chess.count = 40;
		chess.printChessCount();
	}
	
	public void printChessCount() {
		System.out.println("��������="+count);
	}

}
