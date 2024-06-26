package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		/*알파벳을 입력받아 자음 모음을 구분하세요.
		 * if~else문을 사용합니다.
		 * 영문 소문자 이외의 입력값은 고려하지 않습니다.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		char letter = sc.next().charAt(0);
		
		
		if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u') {
			System.out.println("모음 입니다.");
		
		}else {
			System.out.println("자음 입니다.");
		} 
		 //영문자가 아닌 키를 눌렀을때 에러 메시지 출력하는 방법??
		
		sc.close();

	}

}
