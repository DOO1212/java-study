package sec01.exam28.quiz;

import java.time.LocalDate;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		System.out.println("반 전체 학생의 수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		scanner.nextLine();
		
		String[] num1 = new String[num];		
		
		for (int i = 0; i < num1.length; i++) {
			
			String person = scanner.nextLine();
			
			num1[i] = person;
			
		}
		
		int ran = (int) (Math.random() * (num));
		
		System.out.println(num1[ran]);
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		
		
		
		
		

	}

}
