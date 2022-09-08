package Chapter07.EX03;

class A{
	//클래스 내부에 생성자가 존재하지 않을경우 컴파일러가 기본생성자를 자동으로 만들어 준다
	//A ( ) { }
	
	//필드 (인스턴스 필드: 객체를 생성후 호출)
	int m;
	
	//메소드 (인스턴스 메소드: 객체를 생성후 호출)
	void work() {
		System.out.println(m);
	}
}


class B{
  
	//1. 필드
	int m;
	
	//2. 생성자 (순서 상관 없음)
	B () { }    //기본생성자 : 명시
	
	//3. 메소드
	void work() {
		System.out.println(m);
	}
}


class C {
	//1. 필드
	int m;
	
	//2. 생성자 : 매개변수가 하나인 생성자
	  //클ㄹㅐ 스 내부에 생성자가 존재하면 컴파일러가 생성자를 넣지않음
	

	
	C (int a) {               //입력매개변수, 입력매개변수를 받는 변수,필드의 매개변수
		m = a ;               //3개의 이름이 모두 같을때 <<this. 사용
	}
	
	//3. 메소드
	void work () {
		System.out.println(m);
	}
}







public class Using_Constructor01 {

	public static void main(String[] args) {
		//객체 생성
		A a = new A ();      //기본생성자 호출 : A(), 생성자 생략된 경우(컴파일러가 자동으로 생성)
		
		System.out.println(a.m);  //0
		a.work();  //0
		System.out.println("==========");
 
		B b = new B ();      //기본생성자 호출: B()
		System.out.println(b.m);  //0
		b.work();  //0
		System.out.println("==========");
		
//	    C c = new C();  //오류 발생> 생성자가 클래스 내부에 하나라도 존재하면 생성자를 자동으로 넣지않음
		
		C c = new C(10);  //필드의 값을 초기화 할때 생성자를 사용
		System.out.println(c.m);
		c.work();
		
		
		
	}

}
