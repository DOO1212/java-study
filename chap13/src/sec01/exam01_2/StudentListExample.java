package sec01.exam01_2;

import java.util.ArrayList;
import java.util.List;

public class StudentListExample {

	public static void main(String[] args) {
		
//		타입 파라미터로 사용자 정의 객체를 사용할 경우
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("김재현", 30));
		studentList.add(new Student("이수진", 25));
		studentList.add(new Student("박민수", 40));
		
//		객체 검색
		if (studentList.indexOf(new Student("김재현", 30)) != -1) {
			System.out.println("indexOf: 있다");
		} else {
			System.out.println("indexOf: 없다");			
		}
		
		if (studentList.contains(new Student("김재현", 30))) {
			System.out.println("indexOf: 있다");
		} else {
			System.out.println("indexOf: 없다");			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
