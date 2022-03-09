package org.opentutorials.javatutorials.method;

public class MethodDemo6 {
	
	
	public static String numbering(int init, int limit) {//매개변수 parameter
		int i = init;
		String output = "";
		while (i < limit){
			//System.out.println(i);
			output += i;
			i++;
		}
		return output;
	}
	
	
	public static void main(String[] args) {
		String result = numbering(1, 5);
		
		System.out.println(result);
	}
}
