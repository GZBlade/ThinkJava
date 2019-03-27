package innerclass.greenhourse;

import java.util.ArrayList;
import java.util.List;

/**
 * �¼�������
 */
public class Control {

	private List<Event> eventList = new ArrayList<Event>();

	public void addEvent(Event event) {
		eventList.add(event);
	}

	/**
	 * ����������
	 * �ж��¼��Ƿ񴥷�
	 * �������������Ӧ���¼�
	 */
	public void run() {
		while (eventList.size() > 0) {
			for (Event e : new ArrayList<Event>(eventList)) {
				if(e.ready()) {
					System.out.println(e);
					e.action();
					eventList.remove(e);
				}
			}
		}
	}

}
