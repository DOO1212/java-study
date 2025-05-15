package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println("몸무게(kg) : " + a);
		System.out.println("키(m) : " + b);
		System.out.println("BMI 지수 : " + ((double) a/(b*b)) * 10000);

	}

}
