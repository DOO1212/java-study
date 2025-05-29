package sec02.exam02;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Locale;

public class CalendarExample {

	public static void main(String[] args) {
		
//		Calendar now = new Calendar();
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY:
			strWeek = "일";
			break;
		}
		
		System.out.println(strWeek + "요일");
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmpm = null;
		
		if (amPm == Calendar.AM_PM) {
			strAmpm = "오전";
		} else {
			strAmpm = "오후";
		}
			
		System.out.println(strAmpm);
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		LocalDateTime now2 = LocalDateTime.now();
		
		int year2 = now2.getYear();
		int month2 = now2.getMonthValue();
		int day2 = now2.getDayOfMonth();
		
		System.out.println(year2);
		System.out.println(month2);
		System.out.println(day2);
		
		DayOfWeek dayOfWeek = now2.getDayOfWeek();
		String strWeek2 = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.KOREAN);
		System.out.println(strWeek2);
		
		int hour24 = now2.getHour();
		String strAmpm2 = hour24 < 12 ? "오전" : "오후";
		System.out.println(strAmpm2);
		
		int hour12 = hour24 % 12;
		if (hour12 == 0) hour12 = 12;
		
		LocalDateTime plusDays = now2.plusDays(3);
		System.out.println(plusDays);
		
//		날짜 시간 비교
		LocalDate today = LocalDate.now();
		LocalDate targetDate = LocalDate.of(2025, 12, 25);
		
		if (today.isBefore(targetDate)) {
			System.out.println("오늘은 크리스마스 전입니다");
		} else if (today.isAfter(targetDate)) {
			System.out.println("오늘은 크리스마스 이후입니다");
		} else {
			System.out.println("오늘은 크리스마스입니다");
		}
		
//		시간 비교
		LocalDateTime todayTime = LocalDateTime.now();
		LocalDateTime deadLine = LocalDateTime.of(2025, 5, 29, 18, 0);
		
		if (todayTime.isBefore(deadLine)) {
			System.out.println("마감시간 전입니다. 작업을 계속 하세요");
		} else if (todayTime.isAfter(deadLine)) {
			System.out.println("마감시간 지났습니다. 제출을 마감합니다");
		} else {
			System.out.println("지금이 마감 시간입니다");
		}
		
//		날짜 시간 차이 구하기
//		날짜 차이
		LocalDate startDate = LocalDate.of(2025, 4, 7);
		LocalDate endDate = LocalDate.of(2025, 10, 24);
		
		Period period = Period.between(startDate, endDate);
		
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		
//		시간 차이
		LocalTime start = LocalTime.of(10, 0, 0);
		LocalTime end = LocalTime.of(10, 5, 30);
		
		Duration duration = Duration.between(start, end);
		
		System.out.println(duration.getSeconds());
		System.out.println(duration.toMinutes());
		
		
//		전체 일수 차이 계산
		long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println(daysBetween);
		
		
		
		
		


	}

}
