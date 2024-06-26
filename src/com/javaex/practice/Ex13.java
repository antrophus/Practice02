package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		/*두개의 정수를 입력받은 후에 작은 수가 큰 수의 약수인지 확인하는 프로그램을 작성하세요.
		 (0은 입력하지 않습니다.) */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		if (num1>num2 && num1%num2==0) {
			System.out.println(num2 + "는(은) " + num1 + "의 약수입니다.");
		}else if (num1>num2 && num1%num2!=0) {
			System.out.println(num2 + "는(은) " + num1 + "의 약수가 아닙니다.");
		}else if (num1<num2 && num2%num1==0) {
			System.out.println(num1 + "는(은) " + num2 + "의 약수입니다.");
		}else if (num1<num2 && num2%num1!=0) {
			System.out.println(num1 + "는(은) " + num2 + "의 약수가 아닙니다.");
		}
		sc.close();
		
	}

}
