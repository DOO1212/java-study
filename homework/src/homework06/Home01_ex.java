package homework06;

import java.util.Scanner;

public class Home01_ex {
	
	void add() {
		System.out.println("문자열을 두개 작성하세요");
		Scanner scan1 = new Scanner(System.in);
		
		String a = scan1.nextLine();
		String b = scan1.nextLine();
		
		System.out.println(a + b);
	}



	int x() {		
	
	while (true) {		
		System.out.println("숫자 두개를 입력하세요");
		Scanner scan2 = new Scanner(System.in);
		
		int c = scan2.nextInt();
		int d = scan2.nextInt();
		
		if (c < d) {
			System.out.println("계산할 수 없습니다");
			System.out.println(c * d * 0);
		} else {
			return c * d;
		}		
		
		}
	}
	
	void bool() {
		System.out.println("문자 두개를 입력하세요");
		Scanner scan = new Scanner(System.in);
		
		String tr = scan.nextLine();
		String fa = scan.nextLine();
		
		if (tr.equals(fa)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

