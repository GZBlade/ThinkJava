package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestOutputStreamWrite {

	public static void main(String[] args) {

		// 1 ѡ������Դ
		File destFile = new File("a.java");
		File srcFile = new File("E:\\ThinkInJava\\ThinkJava\\src\\io\\Person.java");

		OutputStreamWriter outWriter = null;
		InputStreamReader reader = null;

		// 2ѡ����
		try {
			System.out.println(destFile.getAbsolutePath());
			
			outWriter = new OutputStreamWriter(new FileOutputStream(destFile));
			reader = new InputStreamReader(new FileInputStream(srcFile));
			//��˵�ϻ�,��д����

			// 3 ѡ�����
			char[] cbuf = new char[1024];
			int len = -1;
			while ((len = reader.read(cbuf)) != -1) {
				outWriter.write(cbuf, 0, len);
				System.out.println("len="+len);
			}

			System.out.println("file write ok!");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4�ͷ���Դ
			if (null != outWriter) {
				try {
					outWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
