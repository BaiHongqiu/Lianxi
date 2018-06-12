package com.aowin.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

	public static int getInt() {
		Scanner scan = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("请输入数量");
				int num = scan.nextInt();
				return num;
			} catch (InputMismatchException e) {
				System.err.println("输入的格式有误！");
				scan.nextLine();   //取走所有内容   
			}

		}

	}

}
