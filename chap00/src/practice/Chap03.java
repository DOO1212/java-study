public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		byte b = 100;
//		byte result3 = -b; // int 이하 정수의 산술(부호) 연산은 int로 연산
		int result3 = -b;
		System.out.println(result3);
	}

}

//----------------------------------------------------------------------

public class IncreaseDecreaseExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("--------------------");
		x++; // x = x + 1; => 11
		++x; // x = x + 1; => 12
		System.out.println("x=" + x);
		
		System.out.println("--------------------");
		y--; // y = y - 1; => 9
		--y; // y = y - 1; => 8
		System.out.println("y=" + y);
		
		// 다른 연산자와 같이 쓸 때
		System.out.println("--------------------");
		z = x++; // z = x; x = x + 1;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("--------------------");
		z = ++x; // x = x + 1; z = x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");				
		z = ++x + y++; // x = x + 1; z = x + y; y = y + 1;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		// 가독성을 고려하여 명확하게 작성하는 것도 좋은 방법
		++x;
		z = x + y;
		y++;
	}

}

//----------------------------------------------------------------------

public class DenyLogicExample {

	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
	}

}

//----------------------------------------------------------------------

import java.util.Scanner;

public class ArithmeticExample {

	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1=" + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2=" + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3=" + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4=" + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5=" + result5);
		// 주로 배수를 확인할 때 사용
		// 예) 3의 배수 확인 => 9 % 3 == 0 이 나오면 3의 배수
		
		// 정확한 나누기 결과값을 얻으려면 애초에 double 변수로 선언하던가 아니면 타입변환을 통해 가능
		double result6 = (double) v1 / v2;
		System.out.println("result6=" + result6);
		
		// Quiz
//		화면에서 2자리 정수를 입력받아 10의 자리 미만을 버리고
//		출력하는 프로그램을 구현하시오
//
//		[입력] [출력]
//		 55 => 50
//		 60 => 60
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("2자리 정수를 입력하세요: ");
		int num = scanner.nextInt();
		
		// 일의 자리 버리기(나누기 후 곱하기)
		int result = num / 10 * 10;
		System.out.println("출력: " + result);
	}

}

//----------------------------------------------------------------------

public class CharOperationExample {
	public static void main(String[] args) {
		// 참고만 할 것!
		char c1 = 'A' + 1; // 65 + 1 => 리터럴을 더해서 char에 넣는 것은 가능(자바 컴파일러에서 연산)
		char c2 = 'A';
//		char c3 = c2 + 1; // c2 변수가 int로 형변환 됨(JVM에서 연산)
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
//		System.out.println("c3: " + c3);
	}
}

//----------------------------------------------------------------------

public class StringConcatExample {
	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;
		String str2 = str1 + " 특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0; // "JDK" + "3" + 3.0 => "JDK3" + "3.0"
		String str4 = 3 + 3.0 + "JDK"; // 3.0 + 3.0 + "JDK" => "6.0" + "JDK"
		System.out.println(str3);
		System.out.println(str4);		
	}
}

//----------------------------------------------------------------------

import java.util.Scanner;

public class CompareOperatorExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		
		char char1 = 'A'; // 유니코드 65 저장
		char char2 = 'B'; // 유니코드 66 저장
		boolean result4 = (char1 < char2); // 65 < 66, 유니코드 값으로 비교
		System.out.println("result4=" + result4);
		
		// Quiz
//		두개의 숫자를 입력받아
//		앞의 수가 크거나 같은 경우 true를
//		뒤의 수가 큰 경우는 false를 출력하는 프로그램을 구현하시오.
//
//		[입력]   [출력]
//		 1 2 => false
//		10 5 => true
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("두 개의 정수를 입력하세요: ");
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        boolean result = num3 >= num4;

        System.out.println(result);
	}

}

//----------------------------------------------------------------------

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // true
		// v2가 double 타입으로 변환, 1.0 == 1.0
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); // false
		// v5가 double 타입으로 변환, 두 타입의 정밀도 차이때문에 발생
		System.out.println(v4 + " == " + (double) v5);
		// 실수를 저장하는 부동소수점 방식은 정확하게 0.1을 저장할 수 없음
		// v4도 정확히 0.1은 아님
		
		// 해결책
		// 1. float로 바꿔서 비교
		System.out.println((float) v4 == v5); // true
		System.out.println((float) v4 + " == " + v5);
		
		// 2. 정수로 바꿔서 비교
		System.out.println((int) (v4 * 10)  == (int) (v5 * 10)); // true
		
		// 정리: float 타입과 double 타입을 비교하도록 코드를 작성하지 않는 것이 좋음
		// 실수 타입을 하나로 통일하는 것이 좋음(주로 double 타입 사용)
	}

}

//----------------------------------------------------------------------

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A'; // 65
		System.out.println(charCode);
		
		if ((charCode >= 65) & (charCode <= 90)) { // t & t => t
			System.out.println("대문자 이군요");
		}
		
		if ((charCode >= 97) && (charCode <= 122)) { // f && => f (short-circuit 동작)
			System.out.println("소문자 이군요");
		}
		
		if (!(charCode < 48) && !(charCode > 57)) { // t && f => f
			System.out.println("0~9 숫자 이군요");
		}
		
		int value = 6;
		
		if ((value % 2 == 0) | (value % 3 == 0)) { // t | t => t (뒤에 로직까지 검사)
			System.out.println("2 또는 3의 배수 이군요");
		}
		
		if ((value % 2 == 0) || (value % 3 == 0)) { // t || => t (short-circuit 동작)
			System.out.println("2 또는 3의 배수 이군요");
		}
		
		// 정리: 연산의 결과는 같은데 효율성(속도)이 더 높으므로 &&, || 를 사용
	}

}

//----------------------------------------------------------------------

import java.util.Scanner;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 0;		
		
		result += 10;
		System.out.println("result=" + result);	// 10
		
		result -= 5;
		System.out.println("result=" + result);	// 5	
		
		result *= 3;
		System.out.println("result=" + result);	// 15
		
		result /= 5;
		System.out.println("result=" + result);	// 3
		
		result %= 3;
		System.out.println("result=" + result);	// 0
		
		// Quiz
//		금액을 입력받아 500원, 100원, 50원, 10원, 1원 동전으로 변경하려고 합니다.
//		최소 필요한 동전의 개수를 출력하는 프로그램을 구현하시오.
//
//		[입력]
//		5640
//
//		[출력]
//		500원:11개
//		100원:1개
//		50원:0개
//		10원:4개
//		1원:0개
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요: ");
		int amount = scanner.nextInt();
		
		int coin500 = amount / 500;
		amount %= 500;
		
		int coin100 = amount / 100;
		amount %= 100;
		
		int coin50 = amount / 50;
		amount %= 50;
				
		int coin10 = amount / 10;
		amount %= 10;
		
		int coin1 = amount; // 남은 금액은 전부 1원
		
		System.out.println("500원: " + coin500 + "개");
		System.out.println("100원: " + coin100 + "개");
		System.out.println("50원: " + coin50 + "개");
		System.out.println("10원: " + coin10 + "개");
		System.out.println("1원: " + coin1 + "개");
	}

}

//----------------------------------------------------------------------

import java.util.Scanner;

public class ConditionalOperatorExample {

	public static void main(String[] args) {
		int score = 85;
		
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
		// Quiz
//		0~100사이의 점수를 입력받아
//		점수가 60점 이상이면 "합격",
//		60점 미만인 경우 "불합격"을 출력하는 프로그램을 구현하시오.
//		단 음수이거나 100이 넘는 점수는 "점수입력오류"로 출력한다.
//
//		[입력] [출력]
//		 85 => 합격
//		 50 => 불합격
//		-10 => 점수입력오류
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		score = scanner.nextInt();
		
		String result = (score < 0 || score > 100) ? 
						"점수입력오류" : 
						((score >= 60) ? "합격" : "불합격");
		
		System.out.println(result);
		
		
		
		
		
		
		
		
	}

}