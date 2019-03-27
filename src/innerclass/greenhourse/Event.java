package innerclass.greenhourse;

public abstract class Event {

	// �¼�����ʱ��
	private long eventTime;
	
	//ʱ���ӳٶ��
	protected final long delayTime;
	
	public Event(long delayTime) {
		this.delayTime = delayTime;
		start();
	}
	
	//�¼�����ʱ��
	public void start() {
		eventTime = System.currentTimeMillis() + delayTime;
	}
	
	/**
	 * �¼��Ƿ񴥷�
	 * true ����
	 */
	public boolean ready() {
		return System.currentTimeMillis() >= eventTime;
	}
	
	//ʱ�䴥������ɶ��������ʵ��
	public abstract void action();

	public long getEventTime() {
		return eventTime;
	}
	
	
	
}
