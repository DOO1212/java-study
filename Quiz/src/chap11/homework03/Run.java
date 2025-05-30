package chap11.homework03;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String email = scanner.nextLine();
		
		String emailtrim = email.trim();
		
		if (!emailtrim.endsWith("@goodee.co.kr")) {
			System.out.println("유효하지 않은 이메일입니다");
		} else {
			int a = emailtrim.indexOf("@");
			String b = emailtrim.substring(0 , a);
			System.out.println(b.toUpperCase());
		}
		
		
		
		
		
		
		
		
		

	}

}
