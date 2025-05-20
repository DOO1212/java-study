package homework04;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("3 이상의 홀수를 입력하세요");
		int a = scan.nextInt();
		
		while (a < 3 || (a % 2 == 0)) {
			System.out.println("다시 입력하세요");
			a = scan.nextInt();
		}
		
		int[] arr = new int[a];
		
		for (int i = 0; i < arr.length; i++) {
			
			if (i < arr.length/2+1) {
				arr[i] = i + 1;
			} else {
				arr[i] = arr.length - i;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		

		
		
			
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
