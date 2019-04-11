package offtenuseclass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFile {

	public static void main(String[] args) {

		File file = new File("E:\\Java���˼��\\15������\\aa.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("File�Ƿ���ڣ�" + file.exists());
		System.out.println("File�Ƿ���Ŀ¼��" + file.isDirectory());
		System.out.println("File�Ƿ����ļ���" + file.isFile());
		System.out.println("File����޸�ʱ�䣺" + new Date(file.lastModified()));
		System.out.println("File�Ĵ�С��" + file.length());
		System.out.println("File���ļ�����" + file.getName());
		System.out.println("File��Ŀ¼·����" + file.getPath());
		
//		File f2 = new File("d:/��Ӱ/����/��½");
//        boolean flag = f2.mkdirs(); //Ŀ¼�ṹ����һ�������ڣ��򲻻ᴴ������Ŀ¼��
//        System.out.println(flag);//����ʧ��
		System.out.println("File�ܶ���"+file.canRead());
		System.out.println("File��д��"+file.canWrite());
		System.out.println("File�ĸ�Ŀ¼��"+file.getParentFile());
		File[] files=file.getParentFile().listFiles();
		for(File f:files) {
			System.out.println(f);
		}

	}

}
