package interfaces.interfaceprocessor;

public class Apply {

	// �������ģʽ ==>�����д��ݵĲ�������ͬ��Ϊ��ͬ
	public static void process(Processor p, Object input) {
		System.out.println("Using  processor " + p.getProcessorName());
		System.out.println(p.process(input));
	}

	public static void main(String[] args) {

		String input = "A E i o u";
		process(new Upcase(), input);
		process(new Downcase(), input);
		process(new Splitter(), input);
	}
//	Using  processor Upcase
//	A E I O U
//	Using  processor Downcase
//	a e i o u
//	Using  processor Splitter
//	[A, E, i, o, u]


}
