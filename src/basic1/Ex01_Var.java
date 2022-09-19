package basic1;

//import java.lang.*

/*
 * 자료형 (data type)
 * 1.기본형
 *    boolean
 *    char
 *    int / long
 *    double
 *    (다른거 있지만 잘 안씀)
 * 
 * 2.참조형
 *    class  
 *    배열
 *    -> new 예약어를 통해 객체를 생성
 * 
 * (*)String >> 참조형이지만 따로 생각하기!
 * 
 */

public class Ex01_Var { // extends Object
	// *멤버변수 자동초기화가 된다
	String a;
	int b;

	public static void main(String[] args) {

		// *지역변수

		// 문자열 변수 a 선언
		// 정수 변수 b 선언
		String a;
		int b;

		// 변수 b에 200 대입
		b = 200;
		// 변수 a에 "Hello"를 지정
		a = "Hello";
		
        // a = new String("Hello"); 
		//String은 클래스이기 때문에 객체 생성 해야함
		//많이 쓰니까 그냥도 쓰 해줌
		
		// 변수 a와 b를 콘솔에 출력
		System.out.println(a);
		System.out.println(b);

	}

}
