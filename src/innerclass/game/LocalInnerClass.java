package innerclass.game;

public class LocalInnerClass {

	private int count = 0;

	//�ֲ��ڲ���
	public Counter getCount() {
		class MyLocalInnerClass implements Counter {
			@Override
			public int next() {
				count ++;
				return count;
			}

			@Override
			public void count() {
			}
		}
		return new MyLocalInnerClass();
	}
	
	//�ֲ������ڲ���
	public Counter getCount2() {
		return new Counter() {
			@Override
			public int next() {
				count ++;
				return count;
			}

			@Override
			public void count() {
			}
		};
	}
	
	public static void main(String[] args) {
		LocalInnerClass localInnerClass=new LocalInnerClass();
		int count=localInnerClass.getCount().next();
		System.out.println(count);
		
		count = localInnerClass.getCount2().next();
		System.out.println(count);
		
	}

}
