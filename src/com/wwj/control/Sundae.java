package com.wwj.control;

/**
 * ʥ�������
 * @author wwj
 */
public class Sundae {
	
	/**
	 * �������ٸ������
	 */
	private static int count;
	
	/**
	 * ���캯��˽��,�ⲿ����ͨ�����캯����������
	 */
	private Sundae() {
		
	}
	
	/**
	 * ͨ����̬��������һ��ʥ�������
	 * @return
	 */
	public static Sundae makeSundae() {
		count++;
		return new Sundae();
	}
	
	public void print() {
		System.out.println("------ʥ�������"+count+"��");
	}

}
