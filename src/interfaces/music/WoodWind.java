package interfaces.music;

//ľ������
public class WoodWind extends Wind {
	
	@Override
	public void play(Note note) {
		System.out.println("WoodWind.play() "+note);
	}
	
	public void adjust() {
		System.out.println("WoodWind.adjust()");
	}

}
