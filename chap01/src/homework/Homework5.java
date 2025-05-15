package homework;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		System.out.println("국어 : " + (int) a );
		System.out.println("영어 : " + (int) b );
		System.out.println("수학 : " + (int) c );
		System.out.println("총점 : " + (int) (a + b + c));
		System.out.println("평균 : " + (int) (a + b + c)/3);

	}

}
