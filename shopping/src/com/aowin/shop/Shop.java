package com.aowin.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.aowin.customer.Father;
import com.aowin.excep.NoSuchFoodException;
import com.aowin.food.Apple;
import com.aowin.food.Food;
import com.aowin.util.Input;

//�̵���
public class Shop {
	//����
	
	//ʳƷ����
	Food[] foods; 
	
	public Shop() {
		foods = new Food[2];
		foods[0] = new Apple("",0);
		//foods[1] = new Apple("",0);
	}
	
	//����
	/*
	 * ����������
	 * ��1����ʾ��ӭ��
	 * ��2���г����Խ�������Ʒ   
	 * (3)ѡ�������ʳƷ  ����ǽ��������ӡ�����嵥������ѭ��
	 * (4)ȷ������������   
	 * ��5������   ִ�У�2�� 
	 */
	public void stock() {
		System.out.println("��ӭ����������");
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("��ѡ�������Ʒ��1.Apple;2.Pear;...3.����");
				String str = scan.next();
				if("3".equals(str)) {
					//��ӡ�嵥
					
					break;
				}
				else if("1".equals(str)||"apple".equalsIgnoreCase(str)) {
					System.out.println("��ǰѡ����ƻ��");
					int num = Input.getInt();   
					//����
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
	
	
	//�ۻ�
	//�����Ĳ���
	public void sell(Father fa) {
		
		
		
	}
	
	
	
	

}
