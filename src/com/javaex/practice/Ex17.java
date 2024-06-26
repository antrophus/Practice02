package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		/*다음과 같이 수익을 입력받아 소득세를 계산하는 프로그램을 작성하세요 
		 * 세금계산법
		 * 0원 이상 1000만원 이하인 경우 tax: 0.09*수익
		 * 1000만원 초과 4000만원 이하인 경우 tax: 1000*0.09 + 0.18*(수익-1000)
		 * 4000만원 초과 8000만원 미만인 경우 tax: 1000*0.09 + 3000*0.18 + 0.27*(수익-4000)
		 * 8000만원 이상인 경우 tax: 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(수익-8000)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수익을 입력해 주세요");
		System.out.print("금액: ");
		double income = sc.nextDouble();
		
		double A = 0.09*income;
		double B = 1000*0.09 + 0.18*(income-1000);
		double C = 1000*0.09 + 3000*0.18 + 0.27*(income-4000);
		double D = 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(income-8000);
		
		if (income>0 && income<=1000) {
			System.out.println("소득세는 " + A + " 만원 입니다.");
			
		}else if(income>1000 && income<=4000) {
			System.out.println("소득세는 " + B + " 만원 입니다.");
			
		}else if(income>4000 && income<8000) {
			System.out.println("소득세는 " + C + " 만원 입니다.");
		
		}else if(income>=8000) {
			System.out.println("소득세는 " + D + " 만원 입니다.");
		
		}else {
			System.out.println("잘못 입력했습니다.");
		}
			
		sc.close();
		
		

	}

}
