package com.aowin.customer;

import com.aowin.food.Apple;
import com.aowin.food.Food;

public class Father {
	
	Food[] foods;
	
	//���췽�� 
	public Father() {
		foods = new Food[2];
		foods[0] = new Apple("",0);
		//foods[1] = new Apple("",0);
	}
	
	
	public Food[] getFoods() {
		return foods;
	}
	
	
	//�Զ���
	
	

}
