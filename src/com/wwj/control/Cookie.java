package com.wwj.control;

//С���
public class Cookie {
	
	public String name;
	
	public Cookie() {
		System.out.println("----Cookie Construct---");
	}
	
	void bite() { //������Ȩ��
		System.out.println("----Cookie bite------");
	}
	
	public void sayHello() { //ÿ�����󶼿��Է���
		System.out.println("------Cookie sayHello------");
	}

	protected String getName() {
		return name;
	}

	//protected �̳�
	protected void setName(String name) {
		this.name = name;
	}
	
}
