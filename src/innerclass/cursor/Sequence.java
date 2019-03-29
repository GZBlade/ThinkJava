package innerclass.cursor;

//��˳���ź�
public class Sequence {

	//���е��α�
	private int next = 0;
	//���еļ���
	private Object[] items;

	public Sequence(int len) {
		items = new Object[len];
	}

	public void add(Object obj) {
		if (next < items.length) {
			items[next++] = obj;
		}
	}

	//����ѡ����
	private class SequenceSelector implements Selector {

		//����ѡ�������α�
		private int next = 0;

		@Override
		public boolean end() {
			return next == items.length;
		}

		@Override
		public Object current() {
			return items[next];
		}

		@Override
		public void next() {
			next++;
		}
	}
	
	//��ȡѡ��������
	public Selector getSelector() {
		return new SequenceSelector();
	}
	
	public static void main(String[] args) {
		Sequence sequence=new Sequence(10);
		sequence.add("Hello World");
		sequence.add("Hello JAVA");
		Selector selector=sequence.getSelector();
		while(!selector.end()) {
			System.out.println(selector.current());
			selector.next();
		}
		
	}

}
