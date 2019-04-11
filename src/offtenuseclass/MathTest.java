package offtenuseclass;

import java.util.Random;

public class MathTest {
	
	public static void main(String[] args) {
		 //ȡ����ز���
        System.out.println(Math.ceil(3.2));
        System.out.println(Math.floor(3.2));
        System.out.println(Math.round(3.2));
        System.out.println(Math.round(3.8));
        //����ֵ��������a��b���ݵȲ���
        System.out.println(Math.abs(-45));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.pow(5, 2));
        System.out.println(Math.pow(2, 5));
        //Math���г��õĳ���
        System.out.println(Math.PI);
        System.out.println(Math.E);
        //�����
        System.out.println(Math.random());// [0,1)
        
        System.out.println("-----------------");
        
        Random rand = new Random();
        //�������[0,1)֮���double���͵�����
        System.out.println(rand.nextDouble());
        //�������int��������Χ֮�ڵ���������
        System.out.println(rand.nextInt());
        //�������[0,1)֮���float���͵�����
        System.out.println(rand.nextFloat());
        //�������false����true
        System.out.println(rand.nextBoolean());
        //�������[0,10)֮���int���͵�����
        System.out.println(rand.nextInt(10));
        //�������[20,30)֮���int���͵�����
        System.out.println(20 + rand.nextInt(10));
        //�������[20,30)֮���int���͵����ݣ����ַ��������Ϊ���ӣ�
        System.out.println(20 + (int) (rand.nextDouble() * 10));
	}

}
