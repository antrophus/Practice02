package com.javaex.practice;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		/*사번(양의정수)을 입력하면 팀을 확인 할 수 있는 프로그램을 작성하세요.
		 * 팀은 A팀, B팀, C팀 3개의 팀으로 구성합니다.
		 * 사번을 3으로 나누어서 나머지가 0이면 A팀, 1이면 B팀, 2면 C팀으로 구분합니다.
		 * 사번 0번을 입력하면 "잘못된 사번입니다." 라고 출력하세요
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번: ");
		int no = sc.nextInt();
		
		int team = no%3;
		
		if (no==0) {
			System.out.println("잘못된 사번입니다.");
			
		}else if (team==0) {
			System.out.println("A팀 입니다.");
			
		}else if(team==1){
			System.out.println("B팀 입니다.");
		
		}else if(team==2) {
			System.out.println("C팀 입니다.");
			
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		sc.close();
		
	}

}