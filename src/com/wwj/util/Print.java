package com.wwj.util;

/**
 * ��ӡ������
 * @author wwj
 *
 */
public class Print {
	
	public static void print(Object ...objs) {
		for(Object obj:objs) {
			System.out.println(obj);
		}
	}
	
	public static void printnb(Object ...objs) {
		for(Object obj:objs) {
			System.out.print(obj);
		}
	}

}
