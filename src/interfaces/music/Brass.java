package interfaces.music;

//ͭ������
public class Brass extends Wind {
	
	@Override
	public void play(Note note) {
		System.out.println("Brass.play() "+note);
	}
	
	public void adjust() {
		System.out.println("Brass.adjust()");
	}

}
