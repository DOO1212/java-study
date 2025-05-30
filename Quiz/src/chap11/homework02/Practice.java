package chap11.homework02;

public class Practice {
	
	
	
	
	
	
	public static String takeState(String str) {
		String[] lo = str.split(" ");
		
		for (int i = 0; i < lo.length; i++) {
			if (lo[i].indexOf("구") == lo[i].length() -1) {
				return lo[i];
			}			
		}
		return null;
	}
	
	
	
	
	
	
	
	

}
