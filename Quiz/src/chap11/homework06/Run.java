package chap11.homework06;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String sentence = "the quick brown fox jumps over the lazy dog";
				
		String a = scanner.nextLine();		
		
		if (sentence.contains(a)) {
			
			String[] words = sentence.split(" ");
			
				for (int i = 0; i < words.length; i++) {					
					if (words[i].equals(a)) {						
						if (i == words.length-1) {							
							System.out.println("마지막 단어입니다");
						} else {
							System.out.println(words[i] + "다음 단어 : " + words[i+1]);
						}
					break;
				}
		}
								


		
		
		
		
		}		
		

	}

}
