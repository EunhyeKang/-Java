package org.opentutorials.javatutorials.method;

public class MethodDemo5 {
	
	public static void numbering(int init, int limit) {//매개변수 parameter
		int i = init;
		while (i < limit){
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		numbering(1,5);//인자 argument
	}
}
