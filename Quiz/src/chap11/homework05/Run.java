package chap11.homework05;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String name = scanner.nextLine();
		
		System.out.println("생년월일을 입력하세요");
		String age = scanner.nextLine();
		
		char a = name.charAt(0);
		String b = name.substring(1);
		String month = age.substring(4,8);
		
		System.out.println("이름 : " + name);
		System.out.println("생년월일 : " + month);
		System.out.println("암호 : " + a + month + b);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
