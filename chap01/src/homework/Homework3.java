package homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		
		String a = scanner.nextLine();

		System.out.println("첫번째 문자 : " + a.charAt(0) );
		System.out.println("두번째 문자 : " + a.charAt(1) );
		System.out.println("세번째 문자 : " + a.charAt(2) );

	}

}
