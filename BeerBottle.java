class BeerBottle //����һ��ƽ��ƿ��
{
	int bottom; // 70mm ����<===>��Ա���� <==> ���  <==> ��Ա
	int height;// 280
	int outside;// 26
	int inside; //15
	float capacity; //580ml   //����ע��
	String capacityUnit="ml";
	//java���Զ�����ĳ�Ա������ʼ��ֵ��������ʱ���ʼ����ֵ����ȷ�����������ֶ���ʼ������ĳ�ʼֵ�Ǻ���Ҫ��

	Beer beer=new Beer(); // Beer ���� <===> �������  ��������


	public static void main(String[] args) 
	{
		BeerBottle beerBottle=new BeerBottle();  //ͨ��new �ؼ��ִ���ơ��ƿ����
		//beerBottle ���������
		beerBottle.bottom=70;
		beerBottle.height=280;
		beerBottle.capacity=580;

		System.out.println("----bottom="+beerBottle.bottom+"mm---height="+beerBottle.height+
		"mm---capacity="+beerBottle.capacity+beerBottle.capacityUnit);

		beerBottle.beer.alcohol=15;
		beerBottle.beer.expirationDate=180;

		System.out.println("---�ƾ���="+beerBottle.beer.alcohol+"%"+"---��Ч��="+beerBottle.beer.expirationDate+"��");

		//beerBottle.beer; //����.����
	}

	//�������Ϊ�������ĺ��� <===> ����
}
