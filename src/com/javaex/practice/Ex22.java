package com.javaex.practice;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		/*숫자(정수) 3개를 입력받아 가장 큰 수를 출력하세요*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력해 주세요");
		System.out.print("숫자1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("숫자3 : ");
		int num3 = sc.nextInt();
		
		boolean a = num1>num2 && num1>num3;
		boolean b = num1<num2 && num2>num3;
		boolean c = num1<num3 && num2<num3;
		
		if(a) {
			System.out.println("가장 큰 수는 " + num1 + " 입니다.");
		}else if(b) {
			System.out.println("가장 큰 수는 " + num2 + " 입니다.");
		}else if(c) {
			System.out.println("가장 큰 수는 " + num3 + " 입니다.");
		}
		
		sc.close();

	}

}
