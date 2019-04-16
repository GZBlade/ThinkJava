package generic.shape;

public class Holder1<T> {

	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public void draw() {
//		t.draw();
	}
	
	//T ֻ������״������״������
	public class Holder2<T extends Shape> {
		
		T t;
		public T getT() {
			return t;
		}
		public void setT(T t) {
			this.t = t;
		}
		public void draw() {
			t.draw();
		}
		
	}
	
	//���͵Ĳ���
	public class Holder3{
		
		Shape t;
		public Shape getT() {
			return t;
		}
		public void setT(Shape t) {
			this.t = t;
		}
		public void draw() {
			t.draw();
		}
		
	}
	
	//�ֽ����ļ���
	public class Holder4{
		
		Object t;
		public Object getT() {
			return t;
		}
		public void setT(Object t) {
			this.t = t;
		}
		public void draw() {
			if(t instanceof Shape) {
				((Shape) t).draw();
			}
		}
		
	}
	
	
}


