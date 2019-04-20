package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

public class TestByteArrayStream {

	public static void main(String[] args) {

		// 1 ѡ������Դ �ļ� ���ݿ� �ڴ� ���� ������
		byte[] srcBuff = "hello I'm a good programer!\r�ǵ�!".getBytes();
		

		// �ֽ����������Ϊnull
		byte[] destBuff = null; // ���������

		// 2 ѡ����
		ByteArrayInputStream inputStream = new ByteArrayInputStream(srcBuff);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		// 3 ѡ�����
		int len = -1;
		int count = 0;
		byte[] srcReadBuff = new byte[10];
		while ((len = inputStream.read(srcReadBuff, 0, srcReadBuff.length)) != -1) {
			count++;
			outputStream.write(srcReadBuff, 0, len);
			System.out.println(count + " len=" + len);
		}
		
		try {
			System.out.println(outputStream.toString("GB2312"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

}
