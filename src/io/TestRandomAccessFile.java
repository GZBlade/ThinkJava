package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {

	public static void main(String[] args) {

		File file = new File("E:\\ThinkInJava\\ThinkJava\\src\\io\\CopyFile.java");

		// 1 �ļ���С
		long length = file.length();

		// 2 ÿ�ζ�ȡ���ֽ�
		int blockSize = 1024;

		// 3 ��ȡ����
		int block = (int) Math.ceil(length * 1.0 / blockSize);

		int beginPos = 0; // ÿ�δ��Ķ�ȡ
		int actionSize = 0; // ÿ�ζ�ȡ��ʵ�ʴ�С

		for (int i = 0; i < block; i++) {
			beginPos = i * blockSize;
			if (i + 1 == block) {
				actionSize = (int) length;
			} else {
				actionSize = blockSize;
				length -= actionSize;
			}

//			System.out.println("----->beginPos=" + beginPos + "---->actionSize=" + actionSize);
			readFile(i,file, beginPos, actionSize);

		}

	}

	private static void readFile(int i, File file, int beginPos, int actionSize) {

		RandomAccessFile randomAccessFile = null;
		RandomAccessFile writeFile=null;
		try {
			randomAccessFile = new RandomAccessFile(file, "r");
			writeFile=new RandomAccessFile("i"+i, "rw");
			
			byte[] buff = new byte[1024];

			randomAccessFile.seek(beginPos);

			int len = -1;
			while ((len = randomAccessFile.read(buff)) != -1) {
				if (actionSize > len) {
					String str = new String(buff, 0, len, "utf-8");
					writeFile.write(buff,0,len);
					System.out.print(str);
					actionSize -= len;
				} else {
					writeFile.write(buff,0,actionSize);
					String str = new String(buff, 0, actionSize, "utf-8");
					System.out.print(str);
					break;
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4 �ͷ���Դ
			if (randomAccessFile != null) {
				try {
					randomAccessFile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (writeFile != null) {
				try {
					randomAccessFile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

}
