package com.wwj.control;

//��ʵ��
public class SingleInstance {

	/**
	 * ���캯��˽�л�,�ⲿ�Ͳ��ܴ�������
	 */
	private SingleInstance() {
	}

	private static SingleInstance mSingleInstance;

	/**
	 * ͨ����̬����ָ����δ�������
	 * @return
	 */
	public static SingleInstance getSingleInstance() {
		if (null == mSingleInstance) {
			mSingleInstance = new SingleInstance();
		}
		return mSingleInstance;
	}
	
	protected void print() {
		System.out.println("����һ����ʵ������");
	}

}
