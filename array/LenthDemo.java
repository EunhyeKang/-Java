package org.opentutorials.javatutorials.array;

public class LenthDemo {
	public static void main(String[] args) {
		
		//String[] classGroup = {"아라","유빈","우주","미나","진우"};
		String[] classGroup = new String[4];
		
		classGroup[0] = "aa";
		System.out.println(classGroup.length);;
		
		classGroup[1] = "bb";
		System.out.println(classGroup.length);;
		
		classGroup[2] = "cc";
		System.out.println(classGroup.length);;
		
		classGroup[3] = "dd";
		System.out.println(classGroup.length);;
	
		
		for(int i=0; i<classGroup.length; i++) {
			String member = classGroup[i];
			System.out.println(member +"이상담받았습니다");
		}
	}
}
