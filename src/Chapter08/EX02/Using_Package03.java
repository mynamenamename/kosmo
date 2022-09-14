package Chapter08.EX02;

//import 사용 없이 외부 패키지 접근  : 클래스의 전체이름을 사용 (패키지명 + 클래스명)
 // A 클래스 (public) >> 접근 가능 , B 클래스 (default) >> 접근 불가능

public class Using_Package03 {

	public static void main(String[] args) {

		//전체 이름 : 패키지명.클래스명 (public)
		Chapter08.EX01.A a = new Chapter08.EX01.A();
		
		System.out.println(a.m);      //외부 패키지에서 접근가능 (public)
		System.out.println(a.n);      //외부 패키지에서 접근가능 (public)
		a.print();
		
		
	}

}
