class BeerBottle //����һ��ƽ��ƿ��
{
	int bottom; // 70mm ����<===>��Ա���� <==> ���
	int height;// 280
	int outside;// 26
	int inside; //15
	float capacity; //580ml   //����ע��
	String capacityUnit="ml";
	//java���Զ�����ĳ�Ա������ʼ��ֵ��������ʱ���ʼ����ֵ����ȷ�����������ֶ���ʼ������ĳ�ʼֵ�Ǻ���Ҫ��

	public static void main(String[] args) 
	{
		BeerBottle beerBottle=new BeerBottle();  //ͨ��new �ؼ��ִ���ơ��ƿ����
		//beerBottle ���������
		beerBottle.bottom=70;
		beerBottle.height=280;
		beerBottle.capacity=580;

		System.out.println("----bottom="+beerBottle.bottom+"mm---height="+beerBottle.height+
		"mm---capacity="+beerBottle.capacity+beerBottle.capacityUnit);

	}

	//�������Ϊ�������ĺ��� <===> ����



}
