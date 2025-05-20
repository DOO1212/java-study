public class VariableInitExample {
	public static void main(String[] args) {
//		int value;
//		int result = value + 10; // 컴파일 에러
		// 초기화를 하지 않은 변수는 메모리에 생성되지 않기에 값을 읽을 수 없음
		// 초기화: 변수에 최초로 값을 저장하는 행위
		
		int value = 30;
		int result = value + 10;
		System.out.println(result);
	}
}

//----------------------------------------------------------------------

public class VariableUseExample {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalMinute = (hour * 60) + minute;
		System.out.println("총 " + totalMinute + "분");
	}

}

//----------------------------------------------------------------------

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
//		y = x; // x에 저장된 값을 변수 y에 저장(복사)
//		System.out.println("x:" + x + ", y:" + y);
		
		// x와 y의 값을 서로 교환. 즉, 바꾸고 싶다면
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
	}

}

//----------------------------------------------------------------------

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15; // main 메소드 블록에서 선언
		
		if (v1 > 10) {
			int v2; // if 블록에서 선언
			v2 = v1 - 10;
		}
		
//		int v3 = v1 + v2 + 5; // v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생
	}

}

//----------------------------------------------------------------------

public class IntegerLiteralExample {

	public static void main(String[] args) {
		// int(4byte)
		
		int var1 = 0b1011; // 2진수(하드웨어 제어 프로그래밍 시)
		int var2 = 013; // 8진수
		int var3 = 11; // 10진수(주로 사용)
		int var4 = 0xB3; // 16진수(RGB 색상값 저장 시)
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
	}

}

//----------------------------------------------------------------------

public class ByteExample {

	public static void main(String[] args) {
		// byte(1byte)
		// 값의 범위: -128 ~ 127
		
		byte var1 = -128;
		byte var2 = 0;
		byte var3 = 127;
//		byte var4 = 128; // 범위를 벗어난 값을 저장하려고 하면 컴파일 에러 발생
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		// 참고: 실행 중에 값의 범위를 벗어난 경우(순환)
		System.out.println();
		
		byte var5 = 126;
		System.out.println(var5);
		var5++;
		System.out.println(var5);
		var5++; // 오버플로우 발생
		System.out.println(var5);
		var5++;
		System.out.println(var5);
		
		System.out.println();
		
		byte var6 = -127;
		System.out.println(var6);
		var6--;
		System.out.println(var6);
		var6--; // 언더플로우 발생
		System.out.println(var6);
		var6--;
		System.out.println(var6);
	}

}

//----------------------------------------------------------------------

public class LongExample {

	public static void main(String[] args) {
		// long(8byte)
		
		long var1 = 10;
		long var2 = 20L; // L을 붙이거나 안붙이거나 문제 없음
//		long var3 = 20000000000; // 자바 컴파일러는 정수 리터럴을 기본적으로 int 타입으로 간주
		// 200억이 int 타입의 범위를 넘기때문에 컴파일 에러 발생
		// 컴파일러에게 int 타입이 아니라 long 타입의 숫자임을 알려줘야 함
		long var4 = 20000000000L; // L 또는 l 을 붙임
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}

//----------------------------------------------------------------------

public class CharExample {

	public static void main(String[] args) {
		// char(2byte)
		// 하나의 문자를 유니코드로 저장
		// 유니코드: 세계 각국의 문자들을 2byte(0~65535) 범위에 맵핑한 국제 표준 규약
		
		char c1 = 'A'; // 실제로는 유니코드 값인 65가 메모리에 저장됨
		char c2 = 65; // 정수 타입이라 정수값도 저장 가능
//		char c = -65; // 음수값 저장 안됨, 유니코드는 0부터 시작
		char c3 = '\u0041'; // 유니코드를 의미 + 16진수(잘 안씀)
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uAC00';
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		// (참고) 유니코드 값 알아내기
		char var = '각';
		int unicode = var;
		System.out.println(unicode);
		System.out.println((int) var); // 강제 타입 변환
		
		// (참고) char 타입의 산술 연산
		char var1 = 'A' + 1;
		System.out.println(var1);
		char var2 = 'A';
//		char var3 = var2 + 1; // char변수 var2가 산술 연산에 쓰이면 int로 먼저 변환됨
		
		// 문자 '0' -> 유니코드 48
		System.out.println('1' - 0); // 49 - 0
		System.out.println('1' - '0'); // 49 - 48
		
		// 이런 방식은 문자를 숫자로 변환할 때 쓰일 수 있음
		char digit = '8';
		int numericValue = digit - '0';
		System.out.println(numericValue);
		
		/*
		 * 중요
		 * 1) 문자와 문자열은 다르다.
		 * 2) 빈(empty) 문자 처리에 대해
		 * */
//		char c = ''; // 컴파일 에러
		char c = ' '; // 공백 문자(유니코드: 32) 존재하므로 가능
		String str = ""; // 빈 문자열(empty string) 가능
	}

}

//----------------------------------------------------------------------

public class StringExample {

	public static void main(String[] args) {
		// 타입이 대문자로 시작함에 주의!
		String name = "홍길동";
		String job = "프로그래머";
		
		System.out.println(name);
		System.out.println(job);
	}

}

//----------------------------------------------------------------------

public class EscapeExample {

	public static void main(String[] args) {
		// 이스케이프(escape) 문자: 역슬래쉬가 붙은 문자로 특수한 용도로 사용된다.
		// 보통 문자열 작성할 때 이용
		
		System.out.println("번호\t이름\t직업");
		System.out.println("번호\n이름\n직업"); // ln은 개행을 뜻함
//		System.out.print("행 단위 출력");
//		System.out.print("행 단위 출력");
		System.out.print("행 단위 출력\n");
		System.out.print("행 단위 출력\n");
		System.out.println("우리는 개발자 입니다.");
		System.out.println("봄여름가을겨울");
		
	}

}

//----------------------------------------------------------------------

public class FloatDoubleExample {

	public static void main(String[] args) {
		// float(4byte), double(8byte)
		// 부동소수점: 가수 * 10의 지수 제곱으로 표현
		// 부동소수점 방식으로 저장 => 같은 크기를 갖는 int(4byte), long(8byte) 보다 더 큰 수를 저장할 수 있음
		
//		float var1 = 3.14; // 자바 컴파일러는 실수 리터럴을 기본적으로 double 타입으로 해석
		// double 타입을 float 타입에 바로 넣을 수 없음
		// F 또는 f 를 붙여 float 타입임을 알려줌
		float var2 = 3.14f;
		double var3 = 3.14;
		
		System.out.println(var2);
		System.out.println(var3);
		
		// 정밀도 테스트
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println(var4);
		System.out.println(var5);
		
		// e 사용하기
		double var6 = 3e6; // 3.0 * 10^6;
//		int var = 3e6; // E 또는 e가 포함되어 있을 경우 => 실수 리터럴
		float var7 = 3e6F;
		double var8 = 2e-3; // 2.0 * 10^-3
		
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
	}

}

//----------------------------------------------------------------------

public class BooleanExample {

	public static void main(String[] args) {
		// boolean(1byte)
		// true, false 2가지 상태값을 저장
		// 제어문(조건문, 반복문)에서 실행 흐름을 변경할 때 주로 사용
		
//		boolean stop = true;
		boolean stop = false;
		
		if (stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
	}

}

//----------------------------------------------------------------------

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; // 1byte -> 4byte, 자동 형변환
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue; // 2byte -> 4byte, 자동 형변환
		System.out.println("intValue: " + intValue);
		
		intValue = 30;
		long longValue = intValue; // 4byte -> 8byte, 자동 형변환
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue; // 실제 저장할 수 있는 값의 범위는 long < float, 자동 형변환
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue; // 4byte -> 8byte, 자동 형변환
		System.out.println("doubleValue: " + doubleValue);
		
		// 주의! byte -> char로 자동 형변환 불가
		byte byteVal = 65;
//		char charVal = byteVal; // char는 음수를 포함하지 않는데 byte 타입은 음수를 포함
	}

}

//----------------------------------------------------------------------

import java.util.Scanner;

	public static void main(String[] args) {
		int intValue = 44032;
//		int intValue = 65601;
		char charValue = (char) intValue; // char 타입으로 강제 형변환
		System.out.println(charValue);
		
		long longValue = 500;
//		long longValue = 20000000000L;
		intValue = (int) longValue; // 강제 형변환 시 4byte로 쪼개서 마지막 4byte만 넣음
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue; // 정수 부분만 저장됨
		System.out.println(intValue);
		
		// Quiz
//		long 타입을 입력받아 변수 number에 저장 후 number 변수의 값을
//		int 형으로 변환한 결과를 출력하시오.
		Scanner scanner = new Scanner(System.in);
		System.out.print("long 타입 입력: ");
		long number = scanner.nextLong();
		System.out.println((int) number);
	}

}

//----------------------------------------------------------------------

public class ByteOperationExample {

	public static void main(String[] args) {
		// 기본 전제: 두 개의 값 중 크기가 큰 타입으로 자동 변환
		
		// 산술 연산에서 int 타입 이하일 경우에는 int로 자동 변환
		byte x = 10;
		byte y = 20;
//		byte result = x + y; // 연산 시 우선적으로 byte가 int로 변환됨, int + int
		int result = x + y;
	}

}

//----------------------------------------------------------------------

public class LongOperationExample {

	public static void main(String[] args) {
		// 정수 타입의 산술 연산에서 하나라도 long 타입이면 long으로 자동 변환
		byte x = 20;
		long y = 40;
//		int result = x + y; // byte가 long으로 변환됨, long + long
		long result = x + y;
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result2 = value1 + value2 + value3; // int + int + long -> long + long
		System.out.println(result2);
	}

}

//----------------------------------------------------------------------

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2; // int + int
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		// char도 마찬가지(연산 시 int로 형변환)
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2; // int + int
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		// 문자로 출력하고 싶다면 char 타입으로 강제 형변환		
		System.out.println("출력문자=" + (char) intValue2);
		
		// 정수 / 정수 = 정수
		int intValue3 = 10;
		int intValue4 = intValue3 / 4; // 정수 연산의 결과는 정수, 10 / 4 = 2
		System.out.println(intValue4);
		
		double doubleValue1 = intValue3 / 4;
		System.out.println(doubleValue1);
		
		// 실수 결과를 얻으려면
		double doubleValue2 = intValue3 / 4.0; // 10.0 / 4.0 = 2.5
		System.out.println(doubleValue2);
		
		int x = 1;
		int y = 2;
//		double result = (double) x / y;
//		double result = x / (double) y;
		double result = (double) x / (double) y;
		System.out.println(result);
		
	}

}

//----------------------------------------------------------------------

public class StringConcatExample {

	public static void main(String[] args) {
		int value = 10 + 2 + 8;
		System.out.println("value: " + value);
		
		String str1 = 10 + 2 + "8"; // 12 + "8" -> "128"
		System.out.println("str1: " + str1);

		String str2 = 10 + "2" + 8; // "102" + 8 -> "1028"
		System.out.println("str2: " + str2);
		
		String str3 = "10" + 2 + 8; // "102" + 8 -> "1028"
		System.out.println("str3: " + str3);
				
		String str4 = "10" + (2 + 8); // "10" + 10 -> "1010"
		System.out.println("str4: " + str4);
	}

}

//----------------------------------------------------------------------

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
//		System.out.println(Integer.parseInt("1a")); // 숫자로 변환 불가한 경우 예외 발생
//		System.out.println(Byte.parseByte("128")); // byte 값의 범위를 벗어남
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
	}

}

//----------------------------------------------------------------------

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격: %d원\n", value);
		System.out.printf("상품의 가격: %6d원\n", value);
		System.out.printf("상품의 가격: %-6d원\n", value);
		System.out.printf("상품의 가격: %06d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %1$d인 원의 넓이: %2$10.2f\n", 10, area);
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area); // 순번을 생략하면 차례대로 대입됨
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s", 1, name, job);
	}

}

//----------------------------------------------------------------------

public class KeyCodeExample {

	public static void main(String[] args) throws Exception { // 발생한 예외를 모니터(콘솔)에 출력하고 끝내라
		int keyCode;
		
		// 키보드로부터 키코드를 읽는데 에러가 날 수 있음 -> 예외처리
		keyCode = System.in.read(); // 콘솔에서 키보드로부터 입력을 받을 때까지 기다림(입력이 없으면 멈춰있음)
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
	}

}

//----------------------------------------------------------------------

public class ContinueKeyCodeReadExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while (true) { // 무한 반복
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
		}
	}

}

//----------------------------------------------------------------------

public class QStopExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while (true) { // 무한 반복
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			
			// q를 입력하면 종료되도록 만들기
			if (keyCode == 113) {
				break;
			}
		}
		
		System.out.println("종료");
	}

}

//----------------------------------------------------------------------

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while (true) {
			inputData = scanner.nextLine(); // 스캐너에서 읽은 한 라인 전체(엔터키 이전까지)
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			
			if (inputData.equals("q")) {
				break;
			}
		}
		
		System.out.println("종료");
		
		// Quiz
//		2개의 int 값을 입력받아 입력받은 값을 화면에 ,로 연결하여 출력하시오.
//		[입력]    [출력]
//		10 20 => 10,20
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(a + "," + b);
	}

}