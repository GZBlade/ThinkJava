package interfaces.classprocesser;

public class Downcase extends Processor {
	
	// ��������Э������
	public String process(Object input) {
		return ((String) input).toLowerCase();
	}

}
