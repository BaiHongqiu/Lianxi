package com.aowin.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.aowin.customer.Father;
import com.aowin.excep.NoSuchFoodException;
import com.aowin.food.Apple;
import com.aowin.food.Food;
import com.aowin.util.Input;

//商店类
public class Shop {
	//名称
	
	//食品数组
	Food[] foods; 
	
	public Shop() {
		foods = new Food[2];
		foods[0] = new Apple("",0);
		//foods[1] = new Apple("",0);
	}
	
	//进货
	/*
	 * 进货的流程
	 * （1）显示欢迎语
	 * （2）列出可以进货的商品   
	 * (3)选择进货的食品  如果是结束，则打印进货清单，结束循环
	 * (4)确定进货的数量   
	 * （5）进货   执行（2） 
	 */
	public void stock() {
		System.out.println("欢迎您来进货！");
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("请选择进货商品：1.Apple;2.Pear;...3.结束");
				String str = scan.next();
				if("3".equals(str)) {
					//打印清单
					
					break;
				}
				else if("1".equals(str)||"apple".equalsIgnoreCase(str)) {
					System.out.println("当前选择购买苹果");
					int num = Input.getInt();   
					//进货
					foods[0].add(num);   
				}
				else if("2".equals(str)||"pear".equalsIgnoreCase(str)) {
					
				}
				else {  
					throw new NoSuchFoodException();
				}
			} catch (NoSuchFoodException e) {
				System.err.println(e.getMessage()); 
			}
		
		
		}
	}	
	
	
	//售货
	//方法的参数
	public void sell(Father fa) {
		
		
		
	}
	
	
	
	

}
