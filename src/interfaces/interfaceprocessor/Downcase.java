package interfaces.interfaceprocessor;

public class Downcase extends StringProcessor {
	
	// ��������Э������
	public String process(Object input) {
		return ((String) input).toLowerCase();
	}

}
