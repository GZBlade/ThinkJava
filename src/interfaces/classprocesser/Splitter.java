package interfaces.classprocesser;

import java.util.Arrays;

public class Splitter extends Processor {

	// ��������Э������
	public String process(Object input) {
		return Arrays.toString(((String) input).split(" "));
	}

}
