package sec01.exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
//		객체 추가
//		list.add(null)
		list.add("Java");
		list.add("JDBC");
		list.add(2, "Datebase");
		list.add("Servlet/JSP");
		list.add("iBATIS");
		
//		list.add(7, null);
		
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		
//		특정 인덱스의 객체 가져오기
		String skill = list.get(2);
		System.out.println(skill);
		
//		리스트 출력하기
		System.out.println(list);
		
//		객체 수정
		list.set(4, "MyBatis");
		System.out.println(list);
		
//		모든 객체를 하나씩 가져오기
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		
//		객체 삭제
		list.remove(2);
		list.remove("MyBatis");
		System.out.println(list);
		
//		향상된 for 문으로 모든 객체를 하나씩 가져오기
		for (String str1 : list) {
			System.out.println(str1);
		}
		
//		객체 검색
		if (!list.isEmpty()) {
			System.out.println("JDBC 있니? " + list.contains("JDBC"));
			System.out.println("어디에 있니? " + list.indexOf("JDBC"));
			System.out.println("Database 있니? " + list.contains("Database"));
			System.out.println("어디에 있니? " + list.indexOf("Database"));
		}
		
//		저장된 모든 객체 삭제
		list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
//		요소 정렬
		List<String> strList = new ArrayList<>();
		strList.add("나");
		strList.add("가");
		strList.add("사");
		strList.add("하");
		strList.add("마");
		
		System.out.println(strList);
		
//		오름차순
		Collections.sort(strList);
		System.out.println(strList);
		
//		내림차순
		Collections.sort(strList, Collections.reverseOrder());
		System.out.println(strList);
		
		List<Integer> numlist = new ArrayList<>();
		
		numlist.add(11);
		numlist.add(5);
		numlist.add(1);
		numlist.add(9);
		numlist.add(3);
		
		System.out.println(numlist);
		
//		오름차순
		Collections.sort(numlist);
		System.out.println(numlist);
		
//		내림차순
		Collections.sort(numlist, Collections.reverseOrder());
		System.out.println(numlist);
		
		
		
		
		
		
		
		
		
		
		

	}

}
