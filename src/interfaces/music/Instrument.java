package interfaces.music;

/**
 * ����
 */
public abstract class Instrument {
	
	public abstract void play(Note note) ; //����
	
	public abstract void adjust(); //����
	
	public String what() {
		return getClass().getSimpleName();
	}

}
