package polymorphic.music;

public class Music {

	/**
	 * ����
	 * ���ڰ�  <==> ����ʱ��  <==> ��̬��
	 * ǰ�ڰ�  <==> ����δִ�� 
	 * ͨ����̬��ʵ�ֶ�̬�Ͷ����й�
	 * 
	 * ��ͨ��������Ȩ�����δ�
	 * public protected ������Ȩ��
	 * 
	 * ��������ͨ����
	 * private final static field
	 */
	public  static void tune(Instrument instrument) {
		instrument.play(Note.MIDDLE);
	}
	
	public static void main(String[] args) {
		Wind wind=new Wind();
		tune(wind);
	}

	//Wind play MIDDLE
	
}
