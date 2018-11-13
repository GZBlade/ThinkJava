package com.wwj.first;

class DataType 
{
	public static void main(String[] args) 
	{
		int byteSize=Byte.SIZE; //��ȡ�ֽ�λ��
		int byteMinValue=Byte.MIN_VALUE;
		int byteMaxValue=Byte.MAX_VALUE;
		int byteCount=Byte.BYTES;
		System.out.println("һ���ֽڼ�="+byteSize+"λ-----byteMinValue="+byteMinValue+"-----byteMaxValue="+
			byteMaxValue+"byteCount="+byteCount);
		//2^8 = 2 * 2 * 2 * 2 = 16   16 * 16=256  �з��ŵ�byte���ֽ����� -2^7=-128  2^7-1=127
		//2^5 = 32  2^6=64  2^7=128  2 * 2 * 2 * 2 * 2 * 2 * 2=128
		//byteSize=8-----byteMinValue=-128-----byteMaxValue=127
		//1 JAVA �з��ŵ���������, 256/2=128  -128  -1  0  1 127   

		int shortSize=Short.SIZE;
		int shortMinValue=Short.MIN_VALUE;
		int shortMaxValue=Short.MAX_VALUE;
		int shortCount=Short.BYTES;

		System.out.println("--�����ͼ�"+shortSize+"λ---shortMinValue="+shortMinValue+"----shortMaxValue="+shortMaxValue
			+"----�����ͼ����ֽ�="+shortCount);
		// --�����ͼ�16λ---shortMinValue=-32768----shortMaxValue=32767----�����ͼ����ֽ�=2
		//����ע�ͣ�����������
		// 256 * 256  = 2^8 * 2^8 = 2^16= 65536
		//��������Сֵ 2^15= 32768    ���������ֵ 2^15-1=32768-1=32767
		// �з��Ŵ������������޷��Ŵ�������   

		//Char  Int  Long   Float  Double  
		//������һ����ҵ���Լ�ʵ��  Char  Integer  Long   Float  Double Boolean �������ռ�����ֽڣ���Сֵ�����ֵ����λ
		
		int charSize=Character.SIZE;
		int charMinValue=Character.MIN_VALUE;
		int charMaxValue=Character.MAX_VALUE;
		int charCount=Character.BYTES;
		// Character char ��װ����   Short  short
		System.out.println("char λ"+charSize+"--char ��Сֵ="+charMinValue+"---char ���ֵ="+charMaxValue+"---char �ֽ�="+charCount);

		int intSize=Integer.SIZE;
		int intMinValue=Integer.MIN_VALUE;
		int intMaxValue=Integer.MAX_VALUE;
		int intCount=Integer.BYTES;
		// Character char ��װ����   Short  short
		System.out.println("int λ"+intSize+"--int ��Сֵ="+intMinValue+"---int ���ֵ="+intMaxValue+"---int �ֽ�="+intCount);

		//int λ32--int ��Сֵ=-2147483648---int ���ֵ=2147483647---int �ֽ�=4
		//21��4ǧ7��4ʮ8��3ǧ6��4ʮ8
		// 256 * 256  = 2^8 * 2^8 = 2^16= 65536
		// 2^32 = 2^16 * 2^16 = 4294967296

		int longSize=Long.SIZE;
		long longMinValue=Long.MIN_VALUE;
		long longMaxValue=Long.MAX_VALUE;
		int longCount=Long.BYTES;
		// Character char ��װ����   Short  short
		System.out.println("long λ"+longSize+"--long ��Сֵ="+longMinValue+"---long ���ֵ="+longMaxValue+"---long �ֽ�="+longCount);
		//long λ64--long ��Сֵ=-9223372036854775808---long ���ֵ=9223372036854775807---long�ֽ�=8
		//JAVA���Կ�ƽ̨һ������Ҫ��һ�㣬�������͵Ĵ�С�������ھ���Ļ���Ӳ������������������ͨ��Ӳ��ƽ̨�϶���һ����

		int floatSize=Float.SIZE;
		float floatMinValue=Float.MIN_VALUE;
		float floatMaxValue=Float.MAX_VALUE;
		int floatCount=Float.BYTES;
		// Character char ��װ����   Short  short
		System.out.println("float λ"+floatSize+"--float ��Сֵ="+floatMinValue+"---float ���ֵ="+
			floatMaxValue+"---float �ֽ�="+floatCount);
		// float λ32--float ��Сֵ=1.4E-45---float ���ֵ=3.4028235E38---float �ֽ�=4
		// 1.4E-45 = 1.4* 10 -45
		// 3.4028 * 10^38

		int doubleSize=Double.SIZE;
		double doubleMinValue=Double.MIN_VALUE;
		double doubleMaxValue=Double.MAX_VALUE;
		int doubleCount=Double.BYTES;
		// Character char ��װ����   Short  short
		System.out.println("double λ"+doubleSize+"--double ��Сֵ="+doubleMinValue
			+"---double ���ֵ="+floatMaxValue+"---double �ֽ�="+doubleCount);
		//double λ64--double ��Сֵ=4.9E-324---double ���ֵ=3.4028235E38---double �ֽ�=8
	}
}
