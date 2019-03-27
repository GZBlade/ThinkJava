package innerclass.greenhourse;

/**
 * ��ɫС�ݿ���װ��
 */
public class GreenhourseControls extends Control {

	private boolean light = false;

	class LightOn extends Event {

		private int temperature=5;
		
		public LightOn(long delayTime) {
			super(delayTime);
		}
		
		/**
		 * �¼��Ƿ񴥷�
		 * true ����
		 */
		public boolean ready() {
			return System.currentTimeMillis() >= getEventTime() 
					&& temperature>=5;
		}

		@Override
		public void action() {
			light = true;
			// Ӳ������
		}

		@Override
		public String toString() {
			return "LightOn";
		}
	}

	class LightOff extends Event {

		public LightOff(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			light = false;
			// Ӳ������
		}

		@Override
		public String toString() {
			return "LightOff";
		}
	}

	class Clock extends Event {

		public Clock(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			// Ӳ������
//			System.out.println("Ӳ��׼��������");
		}

		@Override
		public String toString() {
			return "Clocking...";
		}
	}

	class Restart extends Event {

		private Event[] eventList;

		public Restart(long delayTime, Event[] eventList) {
			super(delayTime);
			this.eventList = eventList;
			for (Event e : eventList) {
				e.start();
				addEvent(e);
			}
		}

		@Override
		public void action() {
			// Ӳ������
			for (Event e : eventList) {
				e.start();
				addEvent(e);
			}
			start();
			addEvent(this);
		}

		@Override
		public String toString() {
			return "Restart System...";
		}
	}

}
