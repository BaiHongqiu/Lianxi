package com.aowin.food;

public abstract class Food {
	
	private String name;   	//ʳƷ����
	private int num;		//ʳƷ����
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Food(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}
	
	//��������
	public void add(int n) {
		//TODO
	}
	
	//��������
	
	
	
	
	

}
