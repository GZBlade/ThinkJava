package io;

import java.io.File;

public class FileCount {

	public static void main(String[] args) {
		String path = "E:\\Java���˼��\\9�ӿ�";
		File file = new File(path);
		printFileCont(file);

		System.out.println("�ļ�����=" + fileCount);
		System.out.println("�ļ�������=" + dirCount);

	}

	static int fileCount; // �ļ�����
	static int dirCount; // �ļ�������

	private static void printFileCont(File file) {
		if (file == null || !file.exists()) {
			return;
		}

		if (file.isDirectory()) {
			dirCount++;
			File[] files = file.listFiles();
			for (File f : files) {
				if (f.isFile()) {
					fileCount++;
				} else {
					printFileCont(f);
				}
			}
		} else {
			fileCount++;
		}

	}

}
