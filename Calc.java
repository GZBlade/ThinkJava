class Calc 
{
	public static void main(String[] args) 
	{
		Calc calc=new Calc();

		//��������������֮�󣬵��ü������Ĺ���

		int result=calc.add(3,5);
		System.out.println("result=add(3,5)="+result);

		result=calc.minus(30,18);
		System.out.println("result=minus(30,18)="+result);

		result=calc.mulit(20,30);
		System.out.println("result=calc.mulit(20,30)="+result);

		int h=calc.dive(1000,50);
		System.out.println("h=calc.dive(1000,50)="+h);

	}

	/*
	*	�ӷ�
	*/
	public int add(int a,int b)
	{
		return a+b; // + ����������a��b�ļӷ�����
	}

	/**
	*	����
	*/
	public int minus(int a,int b)
	{
		return a-b;
	}

	//�˷�
	public int	mulit(int a,int b)
	{
		return a*b;
	}

	//����
	public int dive(int a,int b){
		return a/b;
	}

}
