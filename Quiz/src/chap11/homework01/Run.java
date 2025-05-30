package chap11.homework01;

import java.util.Arrays;

public class Run {

	public static void main(String[] args) {
		
		String str = "김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		
		String[] a = str.split("\n");
		Person[] personarr = new Person[a.length];
		
		for (int i = 0; i < a.length; i++) {
			String[] b = a[i].split(",");
//			return str1 - str2;
			personarr[i] = new Person(b[0], Integer.parseInt(b[1]), b[2], b[3].charAt(0));
			System.out.println(personarr[i]);
		}		

	}

}
