package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		/*숫자(정수) 3개를 입력 받아 가장 작은 수를 출력하세요*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();	
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		System.out.print("숫자3: ");
		int num3 = sc.nextInt();
		
		if (num1<num2) {
			if(num1<num3) {
				System.out.println("가장 작은 수는 " + num1 + "입니다.");
			}else {
				System.out.println("가장 작은 수는 " + num3 + "입니다.");
			}
		}else if(num2<num3) {
			System.out.println("가장 작은 수는 " + num2 + "입니다.");
		}else {
			System.out.println("가장 작은 수는 " + num3 + "입니다.");
		}
		sc.close();
		
		
	}
	
	
	
	
}
