package org.opentutorials.javatutorials.classninstance;

class C1 {
	static int static_variable = 1;
	int instance_variable = 2;

	static void static_static() {
		System.out.println(static_variable);
	}
	static void static_instance() {
		// 클래스 메소드에서는 인스턴스 변수에 접근 할 수 없다.
	//	System.out.println(instance_variable); //아예 인스턴스에 접근할 수 없게 막아놓
	}
	void instance_static() {
		// 인스턴스 메소드에서는 클래스 변수에 접근 할 수 있다.
		System.out.println(static_variable);
	}
	void instance_instance() {
		System.out.println(instance_variable);
	}
}

class ClassMemberDemo {
	public static void main(String[] args) {
		C1 c = new C1();
		// 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
		// 인스턴스 메소드가 정적 변수에 접근 -> 성공
		c.static_static();
		// 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
		// 정적 메소드가 인스턴스 변수에 접근 -> 실패
		c.static_instance();
		// 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
		// 인스턴스 메소드가 클래스 변수에 접근 -> 성공
		c.instance_static();
		// 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
		// 인스턴스 메소드가 인스턴스 변수에 접근 -> 성공
		c.instance_instance();
		// 클래스를 이용해서 클래스 메소드에 접근 -> 성공
		// 클래스 메소드가 클래스 변수에 접근 -> 성공
		C1.static_static();
		// 클래스를 이용해서 클래스 메소드에 접근 -> 성공
		// 클래스 메소드가 인스턴스 변수에 접근 -> 실패
		C1.static_instance();
		// 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
		// C1.instance_static();
		// 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
		// C1.instance_instance();

		/*******************************************************************/
		
		float f1 = 3.14f;
		// float f1 = 3.14; 기본형이 double이기 때문에 오류
		double d1 = 3.140; // 기본형이 double 이니까 오케

		short st = 4000; // 리터럴상수값이라,,? short의 범위를 벗어나지 않으므로 에러처리 /////////////
		short stt = 10;
		byte by = 5;

	///	// float f = 5.0; //이거랑은 또 다른가 ,,, ? 기본형 다르고.. 그래도 표현 범위가 ..? 속하지않나?
		
		//명시적으로 형변환해주는거랑 기본으로 int 나 double로 때려박는거랑은 다른건가? 
		//메모리사이즈랑 허용(표현)범위는 따

		short s1 = 1;
		short s2 = 2;

		short s3 = (1 + 2); // 오류안남
		// short s3 = (s1+s2); //변수라서 오류남. . 
		short s4 = (short) (s1 + s2); //예측할수없는값은.. 변수에 +1 등등 더했을때 이뤄지는거지.. /////

	}

}

/*
 * 
 * float f1 = 3.14f //float f1 = 3.14; 기본형이 double이기 때문에 오류
 * 
 * double d1 = 3.140; 기본형이 double 이니까 오케
 * 
 ** short s = 4; //리터럴상수값이라,,? short의 범위를 벗어나지 않으므로 에러처리 short s2=10; byte by=5;
 * 
 ** float f = 5.0; 이거랑은 또 다른가 ,,, ? 기본형 다르고.. 그래도 표현 범위가 ..? 속하지않나?
 * 
 * 
 * short s1 = 1; short s2 = 2;
 * 
 * short s3 = (1+2); 오류안남 short s3 = (s1+s2); 변수라서 오류남. . . short s3 =
 * (short)(s1+s2)
 * 
 */
