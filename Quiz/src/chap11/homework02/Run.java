package chap11.homework02;

public class Run {

	public static void main(String[] args) {
		
		String[] list = new String[4];
		
		list[0] = "서울특별시 금천구 구로디지털2로 95";
		list[1] = "서울특별시 서대문구 연희로 248";
		list[2] = "울산광역시 남구 돋질로 233";
		list[3] = "경상북도 구미시 송정대로 55";
				
		for (int j = 0; j < list.length; j++) {
			System.out.println(Practice.takeState(list[j]));
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
