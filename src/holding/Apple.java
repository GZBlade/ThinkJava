package holding;

import java.util.ArrayList;
import java.util.List;

public class Apple extends Fruit {
	
	public static void main(String[] args) {
//		<���Ͳ���>
		List<Fruit> apple=new ArrayList<Fruit>();
		for(int i=0;i<3;i++) {
			apple.add(new Apple());
		}
		
		//�����Ǳ���������
		apple.add(new Orange());
		
		for(int a=0;a<apple.size();a++) {
//			holding.Apple@7852e922 ����.����@�޷���ʮ������ hashCode��
			//hashCode����C/C++ʵ��
			System.out.println(apple.get(a));
		}
		
//		List
//		Set
//		Map<K, V>
//		Queue
		
		
	}
	
}
