package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		/*나이를 입력받아 19세이상 65세미만이면 "1번그룹" 그 이외에는 "2번그룹"으로 출력하는 프로그램을 작성하세요*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해 주세요");
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		boolean group1 = age>=19 && age<65;
		
			
		if(group1==true) {
			System.out.println( "1번그룹 입니다.");			
			
		}else {
			System.out.println("2번그룹 입니다.");
		}
		sc.close();
	}

}
