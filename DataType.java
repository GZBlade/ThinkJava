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
		//������һ����ҵ���Լ�ʵ��  Char  Int  Long   Float  Double  �������ռ�����ֽڣ���Сֵ�����ֵ����λ

	}
}
