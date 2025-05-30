package chap11.homework04;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String text = "";
		
		while (true) {
			String a = scanner.nextLine();
			
			if (a.equalsIgnoreCase("n")) {
				System.out.println("프로그램을 종료합니다");
				System.out.println(text);
				break;
			
			} else {
				text = text + a;				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
