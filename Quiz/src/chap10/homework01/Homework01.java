package chap10.homework01;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	      int ran = (int)(Math.random()* (50))+1;
	      int count = 0;
	      
	      while (true) {      
	         System.out.println("1-50 사이의 숫자를 입력하세요");
	         String a = scanner.nextLine();
	         
	         try {
	            int num = Integer.parseInt(a);
	            count++;            
	         
	            if (num > ran) {
	               System.out.println("DOWN");
	            } else if (num < ran) {
	               System.out.println("UP");
	            } else {
	               System.out.println("정답입니다!");
	               System.out.println("총 시도 횟수 : " + count);
	               break;
	            }            
	            
	         } catch (NumberFormatException e) {
	            System.out.println("잘못된 값입니다. 숫자를 입력해주세요");
	         }
		
		

	      }

	}

}