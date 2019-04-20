package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class SplitFile {

	// Դ�ļ�
	private File srcFile;
	// Ŀ���ļ�
	private File destFile;

	// 1 �ļ���С
	long length;
	// 2 ÿ�ζ�ȡ���ֽ���
	int blockSize = 1024;
	// 3 ��ȡ����
	int block;

	private ArrayList<FileRecord> records = new ArrayList<FileRecord>();

	SplitFile(File srcFile, File destFile) {
		this.srcFile = srcFile;
		this.destFile = destFile;
		init();
	}

	private void init() {

		if (!destFile.exists()) {
			destFile.mkdirs();
		}

		// 1 �ļ���С
		length = srcFile.length();

		// 3 ��ȡ����
		block = (int) Math.ceil(length * 1.0 / blockSize);

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

			FileRecord fileRecord = new FileRecord(beginPos, actionSize);
			records.add(fileRecord);
//			System.out.println("----->beginPos=" + beginPos + "---->actionSize=" + actionSize);
		}

	}

	public void start() {
		for (int i = 0; i < records.size(); i++) {
			readFile(i, records.get(i).beginPos, records.get(i).actionSize);
		}
	}

	public void merge() {
		for (int i = 0; i < records.size(); i++) {
			mergeFile(i);
		}
	}

	private void mergeFile(int i) {
		if (!srcFile.exists()) {
			System.out.println("Դ�ļ�������");
			return;
		}

		// 2ѡ�������
		FileInputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			File destFile=new File(this.destFile,"qq.java");
			outputStream = new FileOutputStream(destFile,true);
			File srcFile=new File(this.destFile,"i"+i);
			inputStream = new FileInputStream(srcFile);
			// 3 ѡ�����ֲ���
			int len = -1;
			byte[] buff = new byte[1024 * 10];
			while ((len = inputStream.read(buff)) != -1) {
				outputStream.write(buff, 0, len);
			}
			System.out.println("copy file successed!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4 �ͷ���Դ
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (null != outputStream) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static class FileRecord {
		int beginPos = 0; // ÿ�δ��Ķ�ȡ
		int actionSize = 0; // ÿ�ζ�ȡ��ʵ�ʴ�С

		public FileRecord(int beginPos, int actionSize) {
			super();
			this.beginPos = beginPos;
			this.actionSize = actionSize;
		}
	}

	private void readFile(int i, int beginPos, int actionSize) {

		RandomAccessFile randomAccessFile = null;
		RandomAccessFile writeFile = null;
		try {
			randomAccessFile = new RandomAccessFile(srcFile, "r");
			File destFile = new File(this.destFile, "i" + i);
			writeFile = new RandomAccessFile(destFile, "rw");

			byte[] buff = new byte[1024];

			randomAccessFile.seek(beginPos);

			int len = -1;
			while ((len = randomAccessFile.read(buff)) != -1) {
				if (actionSize > len) {
					writeFile.write(buff, 0, len);
//					String str = new String(buff, 0, len, "utf-8");
//					System.out.print(str);
					actionSize -= len;
				} else {
					writeFile.write(buff, 0, actionSize);
//					String str = new String(buff, 0, actionSize, "utf-8");
//					System.out.print(str);
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
