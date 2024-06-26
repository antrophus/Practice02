package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		/*아래와 같은 계산기 프로그램을 작성하세요.
		 * 기호, 숫자1, 숫자2 순서로 입력받습니다.
		 * 기호는 ( + - * / ) 4가지입니다.
		 * 입력된 내용으로 계산하여 결과값을 출력합니다.
		 * 나눗셈의 경우 분모가 0이면 "계산할 수 없습니다."를 출력합니다.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		char symbol = sc.next().charAt(0);
		System.out.print("숫자1: ");
		double num1 = sc.nextDouble();
		System.out.print("숫자2: ");
		double num2 = sc.nextDouble();
		
		double plus = num1 + num2;
		double subt = num1 - num2;
		double mult = num1 * num2;
		double divi = num1 / num2;
		
			
		if (symbol=='/' && num2==0) {
			System.out.println("계산할 수 없습니다.");
			
		} else if(symbol=='+') {
			System.out.println("결과는: " + plus);
		} else if(symbol=='-') {
			System.out.println("결과는: " + subt);
		} else if(symbol=='*') {
			System.out.println("결과는: " + mult);
		} else if(symbol=='/') {
			System.out.println("결과는: " + divi);
		} else {
			System.out.println("계산할 수 없는 기호입니다.");
		}
		
		sc.close();
	}

}
