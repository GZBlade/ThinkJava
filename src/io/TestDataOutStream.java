package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataOutStream {

	public static void main(String[] args) {

		// 1 ѡ������Դ
		File file = new File("ios.java");

		// 2 ѡ����
		DataOutputStream dataOutputStream = null;
		DataInputStream dataInputStream = null;
		try {

			dataOutputStream = new DataOutputStream(new FileOutputStream(file));
			dataInputStream=new DataInputStream(new FileInputStream(file));
			
			// 3 ѡ�����
			dataOutputStream.writeInt(10);
			dataOutputStream.writeByte(127);
			dataOutputStream.writeUTF("�����±�����");
			
			
			int q=dataInputStream.readInt();
			System.out.println(q);
			
			int b=dataInputStream.readByte();
			System.out.println(b);
			
			String str=dataInputStream.readUTF();
			System.out.println(str);
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != dataOutputStream) {
				try {
					dataOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
