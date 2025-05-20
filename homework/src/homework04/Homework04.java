package homework04;

import java.util.Arrays;
import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		
//	int a  = (int) (Math.random() * 45) + 1;
	
		int[] arr1 = new int[6];
		for (int i = 0; i < arr1.length; i++) {
		    arr1[i] = (int) (Math.random() * 45) + 1;
		}
		System.out.println(Arrays.toString(arr1)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]	
	
		if (arr1[0] == arr1[1] ||
			arr1[0] == arr1[2] ||
			arr1[0] == arr1[3] ||
			arr1[0] == arr1[4] ||
			arr1[0] == arr1[5]

			) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
