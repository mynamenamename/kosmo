package Chapter07.EX05;

class Car {
	
	String companyName;       //현대자동차
	String color;             //검은색
	double maxSpeed;          //200.0 km/h
	
	
	//생성자
	Car () {
		companyName = "현대자동차";
		color = "검은색";
		maxSpeed = 200.0;
	}
	
	Car(String companyName) {
		this();
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
