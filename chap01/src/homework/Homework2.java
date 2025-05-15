package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		
		System.out.println("가로 : " + a);
		System.out.println("세로 : " + b);
		System.out.println("면적 : " + a * b);
		System.out.println("둘레 : " + (a+b)*2);

	}

}
