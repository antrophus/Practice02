package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		/*두 개의 정수를 입력받아 큰수를 작은수로 나눈 몫과 나머지를 출력하는 프로그램을 작성하세요*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		int x = num1/num2;
		int y = num2/num1;
		int xx = num1%num2;
		int yy = num2%num1;
				
		if (num1>num2) {
			System.out.println("몫: " + x );
			System.out.println("나머지 " + xx);
						
		} else {
			System.out.println("몫: " + y );
			System.out.println("나머지 " + yy);
		}
		sc.close();
		
	}

}
