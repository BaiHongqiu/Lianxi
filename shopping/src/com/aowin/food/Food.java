package com.aowin.food;

public abstract class Food {
	
	private String name;   	//食品名称
	private int num;		//食品数量
	
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
	
	//数量增加
	public void add(int n) {
		//TODO
	}
	
	//数量减少
	
	
	
	
	

}
