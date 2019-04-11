package offtenuseclass;

import java.io.File;

public class GetAllFile {

	public static void main(String[] args) {

		File file = new File("E:\\Java���˼��");

		printFile(file, 1);
	}

	/**
	 * @param file  Ҫ��ӡ���ļ�
	 * @param level Ҫ��ӡ�Ĳ㼶
	 */
	static void printFile(File file, int level) {
		if (!file.exists()) {
			System.out.println("�ļ�������");
			return;
		}

		for (int i = 0; i < level; i++) {
			System.out.print("=");
		}
		
		System.out.println(file.getAbsolutePath());
		if (file.isDirectory()) {
			File[]  files=file.listFiles();
			for(File f:files) {
				printFile(f, level+1);
			}
		}
	}

}
