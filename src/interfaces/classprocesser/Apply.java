package interfaces.classprocesser;

public class Apply {

	//�������ģʽ ==>�����д��ݵĲ�������ͬ��Ϊ��ͬ
	public static void process(Processor p, Object input) {
		System.out.println(p.process(input));
	}

	public static void main(String[] args) {

		String input= "A E i o u";
		process(new Upcase(), input);
		process(new Downcase(), input);
		process(new Splitter(), input);
		
	}
	//A E I O U
//	a e i o u
//	[A, E, i, o, u]


}
