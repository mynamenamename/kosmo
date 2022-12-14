package Chapter07.EX01;

public class Using_Method03 {
	
	
	//인스턴스 필드 : 객체화 해야만 사용가능
	int c;               //인스턴스 필드 : static키가 붙지 않는 필드 (객체화를 해야 사용가능)
	int d;
	
	
	//static 필드 : 객체화 하지 않고 사용가능
	static int e;
	static int f;
	
	
	//인스턴스 메소드 : 객체화 해야만 사용가능
	void abc() {         //main 메소드에서 선언하면 안됨
		System.out.println("abc() 메소드 호출");
	}
    
	//static 메소드 : 객체화 없이 호출 가능
	static void def( ) {
		System.out.println("def() 메소드 호출");
	}
	
	
	//static 메소드 내부에는 인스턴스 필드나, 메소드를 바로 사용할 수 없다. (객체화 시켜야 사용가능)
	
	
	public static void main(String[] args) {
          // main method도 method다.
		int a;           //지역변수      <- stack에 저장
		                 //stack 영역은 강제 초기화가 안됨
		                 //main() 메소드 내에서만 사용됨
		
		a = 10;
		
		System.out.println(a);       //초기값을 넣지 않고 출력하면 오류 발생
		
		
		
		//메소드 내부의 메소드 선언 >> 오류
		//메소드는 클래스 블락에서 선언되어야 한다
		
//		void abc () {
//	System.out.println("안녕하세요");
//		}
		
		
		//필드명, 메소드명 앞에 static 키가 적용되어 있으면 객체 생성 없이 호출 가능
		// static 메소드 내에서는 인스턴스 필드나 인스터스 메소드를 사용할 수 없다
		// static 메소드 내에서는 static 필드나 static 메소드를 사용할 수 있다
		
		
//		c = 5;       //인스턴스 필드  /오류 발생(static 메소드 내부에서 인스턴스 필드 직접 호출 X)
		e = 10;      //static필드  /같은 클래스 내에서 직접 호출
		
//		abc();       //인스턴스 메소드 /오류발생
		def();       //static 메소드 /직접호출
		
	}

}
