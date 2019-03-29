package holding;

import java.util.LinkedList;

/**
 * ����ȳ�
 * ������,���һ������ȥ,��һ���ó���
 * @param <T>
 */
public class Stack<T> {
	
	LinkedList<T> 	linkedList=new LinkedList<T>();
	
	public void push(T t) {
		linkedList.addFirst(t);
	}
	
	public T pop() {
		return linkedList.removeFirst();
	}

	public boolean isEmpty() {
		return linkedList.isEmpty();
	}
	
	/**
	 * ��ȡջ�Ķ���Ԫ��,��ɾ��
	 * @return
	 */
	public T get() {
		return linkedList.getFirst();
	}
	
}
