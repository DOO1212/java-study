package sec01.exam26;

public class ValueCompareExample {

	public static void main(String[] args) {
		
		System.out.println("[-128~-127 초과값일 경우]");
		Integer obj1 = 300; // 자동 박싱
		Integer obj2 = 300; // 자동 박싱
		System.out.println((obj1 == obj2));
		System.out.println("언박싱 후 결과 : " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals() 결과 :" + obj1.equals(obj2));
		System.out.println();
		
//		예외
		System.out.println("[-128~-127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println((obj3 == obj4));
		System.out.println("언박싱 후 결과 : " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과 :" + obj3.equals(obj4));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
