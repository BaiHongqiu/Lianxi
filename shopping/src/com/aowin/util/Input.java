package com.aowin.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

	public static int getInt() {
		Scanner scan = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("����������");
				int num = scan.nextInt();
				return num;
			} catch (InputMismatchException e) {
				System.err.println("����ĸ�ʽ����");
				scan.nextLine();   //ȡ����������   
			}

		}

	}

}
