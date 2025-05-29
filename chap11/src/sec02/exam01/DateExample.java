package sec02.exam01;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) throws InterruptedException {
		
		Date now = new Date();
		
		String strNow1 = now.toString();
		System.out.println(strNow1);
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		sdf = new SimpleDateFormat("yy년 M월 dd일 E a hh시 mm분 ss초");
		String strNow3 = sdf.format(now);
		System.out.println(strNow3);
		
		
		// 1. LocalDate
		// 날짜(년, 월, 일) 정보만 가짐
		// 시간 정보 없음
		// 시간대 정보 없음
		// 생일, 기념일, 마감일 등 "날짜만 필요한 경우"에 사용
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		// 2. LocalDateTime
		// 날짜 + 시간(시, 분, 초, 나노초) 정보를 가짐
		// 시간대 정보 없음
		// 로그 생성 시간, 예약 시간 등 "날짜 + 시간"이 필요한 경우 사용
		
		while (true) {
			LocalDateTime dateTime = LocalDateTime.now();
			System.out.println(dateTime);		
			Thread.sleep(1000);
		}
		
		// 3. ZonedDateTime
		// 날짜 + 시간 + 시간대(ZoneId) 정보를 모두 포함
		// 표준 시간대 간의 변환 필요할 때 사용
		// 서버 간 시간 동기화, 국제화 시스템 등에 유용
		
		
		// 4. DateTimeFormatter
		// 날짜/시간 -> 문자열 또는 문자열 -> 날짜/시간 변환에 사용
				
		
		

	}

}
