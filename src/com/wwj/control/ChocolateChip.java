package com.wwj.control;
import static com.wwj.util.Print.print;

//extends �̳�
public class ChocolateChip extends Cookie {
	
	float size;
	float weight;
	
	protected void setName(String name) {
		print(name);
		this.name = name;
		super.setName(name);
	}
	
	public static void main(String[] args) {
		
		ChocolateChip chip=new ChocolateChip();
		chip.setName("��ܽ�ɿ�����");
		
		print("---"+chip.getName());
		
	}
	

}
