package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestOutStream {

	public static void main(String[] args) {

		// 1 ѡ������Դ ���̵�һ���ļ�
		File file = new File("E:\\ThinkInJava\\ThinkJava\\a.txt");

		// 2ѡ�������
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(file);

			// 3 ѡ�����ֲ���
			outputStream.write('e');
			outputStream.write('l');
			outputStream.write('\r');
			
			byte[] buff= new String("I'm a good program! �ǵ�").getBytes();
			outputStream.write(buff);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4 �ͷ���Դ
			if (null != outputStream) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
