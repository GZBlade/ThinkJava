package interfaces.classprocesser;

public class Upcase extends Processor {

	//��������Э������
	public String process(Object input) {
		return ((String) input).toUpperCase();
	}

}
