package homework04;

import java.util.Iterator;
import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		
		System.out.println("배열의 수를 입력하세요");		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int[] arr = new int[a];
		System.out.println(a +"개 입력 하셨습니다");
				
		int plus = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("배열" + i + "번째 인덱스에 넣을 값을 입력하세요");
			int num = scan.nextInt();
			arr[i] = num;
			plus = plus + num;
		}
				
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		System.out.println(plus);

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
