package Chapter07.EX05;

class Car {
	
	//this 키워드 : 필드나 메서드 선언시 사용 불가
	//           - 생성자나 메소드 내부에서 필드나 메소드 사용할때 자신의 객체 필드나 메소드를 지칭할때
	//           - 자신의 객체의 필드나 메소드를 가르킨다. 기본적으로 생략해서 많이 사용한다
	//           - 반드시 사용해야 할 경우: 메소드, 생성자에서 입력매개변수 이름, 필드 이름이 동일할 경우
	//this ()   : 생성자 내부에서만 사용 가능, 반드시 첫 라인에 위치 해야한다
	//           - 자신의 객체의 다른 생성자를 호출
	//           - 생성자를 오버라이딩 할 때 코드를 간략하게 사용할 수 있다
	//9.14 복습
	String companyName;       //현대자동차
	String color;             //검은색
	double maxSpeed;          //200.0 km/h
	
	
	//생성자
	Car () {                  //리턴 타입이 없고 클래스이름과 동일하다
		this.companyName = "현대자동차";   //this 키 생략시 자동으로 컴파일러가 할당
		color = "검은색";
		maxSpeed = 200.0;
	}
	
	Car(String companyName) {          //매개변수 이름, 필드이름이 같을때 this 사용
		this();                        //this() 메소드, 기본 생성자 호출
		this.companyName=companyName;
	}
	
	Car(String companyName, String color) {
		this(companyName);
		this.color=color;
	}
	
	Car(String CompanyName, String color, double maxSpeed) {
		this(CompanyName,color);
		this.maxSpeed=maxSpeed;
	}
	
	
	//필드의 모든값을 출력 메소드 print()
	
	void print() {
		System.out.println("회사이름은 " + companyName);
		System.out.println("색깔은 " + color);
		System.out.println("최고속도는 " + maxSpeed);
	}
}



public class ThisMethod04 {

	public static void main(String[] args) {
		//this keyword, this method 사용
		
		//1. 매개변수 0개, 기본 필드의 값 출력
		 System.out.println("==매개변수 0개==");
		 Car car = new Car ();
		 car.print();
		
		//2. 매개변수 1개, companyName만 출력, 나머지는 기본값 출력
		 System.out.println("==매개변수 1개==");
		 Car car2 = new Car ("기아자동차");
		 car2.print();
		
        //3. 매개변수 2개
		 System.out.println("==매개변수 2개==");
		 Car car3 = new Car ("쌍용자동차", "빨간색");
		 car3.print();		 
		
		//4. 매개변수 3개
		 System.out.println("==매개변수 3개==");
		 Car car4 = new Car ("제네시스", "회색", 250.0);
		 car4.print();
		 
		 
	}

}
