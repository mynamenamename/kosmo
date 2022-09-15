package Chapter10.EX01;

//클래스 내부 구성요소 : 1. 필드  2. 생성자 3. 메소드 4. 이너클래스 (뒤에서 배움)

//클래스 외부 구성요소 : 1. 패키지 2. 임포트 3. 외부클래스 

/*상속(Inheritance) : 객체지향 언어의 꽃
        -- 부모 클래스(Super Class)의 필드와 메소드, 이너클래스를 자식클래스에서 물려준다.
        -- 자식 클래스(Child Class)는 부모 클래스의 코드(
        -- 중복된 코드를 방지할 수 있음
        -- 코드를 간결하게 사용할 수 있음
        -- 유지 보수를 아주 쉽게 할 수 있음 
        -- 다형성 사용 : 부모 클래스의 메소드를 자식 클래스에서 재정의해서 사용
                - 다양한 타입으로 사용이 가능함
*/

//부모 클래스(Super Class) : 자식 클래스의 공통적인 특징을 가지는 클래스 

class Human {    //사람  : 자식 클래스의 공통적인 필드와 메소드를 선언
	//필드
	String name;
	int age;
	
	//메소드
	void eat() {
		System.out.println("모든 사람은 먹는다.");
	}
	void sleep() {
		System.out.println("모든 사람은 잠을 잔다.");
	}
	void print () {
		System.out.println(name + "," + age);
	}
	
}

//자식 클래스(Child Class) : 부모 클래스의 필드와 메소드를 그대로 상속받음
          // -- 자식 클래스만의 특징이 적용된 필드와 메소드를 선언

class Student extends Human {  //Student 클래스는 Human 클래스를 상속 받는다
	
	// 부모 클래스의 필드와 메소드가 그대로 내려온다.
	// 자식 클래스의 특징을 가진 필드와 메소드를 선언
	int studentID;            //자식 클래스에서 선언된 필드
	void goTOschool () {      //자식 클래스에서만 사용가능한 메소드
		System.out.println("학생이 학교에 갑니다.");
	}
}

class Worker extends Human {   //직장인
	
	// 부모 클래스의 필드와 메소드가 그대로 내려온다.
	// 자식 클래스의 특징을 가진 필드와 메소드를 선언
    int workerID;
    void goTOwork () {
    	System.out.println("직장인이 일하러 갑니다.");
    }
	
}

class Professor extends Human {  //교수
	
	// 부모 클래스의 필드와 메소드가 그대로 내려온다.
	// 자식 클래스의 특징을 가진 필드와 메소드를 선언
	int professorID;
	void goTOcollage () {
		System.out.println("교수님은 대학에 갑니다.");
	}
}




public class Using_Inheritance01 {

	public static void main(String[] args) {
		
		//1. Human 클래스 객체 생성 (부모)
		System.out.println("===Human 객체 출력===");
		Human h = new Human ();
		
		h.name = "홍길동";
	    h.age = 30;
	    
	    h.eat();
	    h.sleep();
	    h.print();
	    
	    //2. Student 클래스 객체 생성 (자식)
	    System.out.println("===Student 객체 출력===");
	    Student s = new Student ();
	    
	    s.name = "세종대왕";         //부모에서 상속된 필드
	    s.age = 50;               //부모에서 상속된 필드
	    s.studentID = 1000;       //Student 클래스에 존재하는 필드
	    
	    s.eat();                  //부모의 메소드
	    s.sleep();                //부모의 메소드
		s.print();                //부모의 메소드
		s.goTOschool();           //Student 클래스의 메소드

		//3. Worker 클래스 객체 생성 (자식)
		System.out.println("===Worker 객체 출력===");
		Worker w = new Worker ();
		
		w.name = "신사임당";         //부모에서 상속된 필드
		w.age = 40;               //부모에서 상속된 필드
		w.workerID = 1001;        //Worker 클래스에 존재하는 필드
		
		w.eat();                  //부모의 메소드
		w.sleep();                //부모의 메소드
		w.print();                //부모의 메소드
		w.goTOwork();             //Worker 클래스의 메소드
		
		
		//3.Professor 클래스 객체 생성 (자식)
		System.out.println("===Professor 객체 출력===");
		Professor p = new Professor();
		
		p.name = "이순신";          //부모에서 상속된 필드
		p.age = 40;               //부모에서 상속된 필드
		p.professorID = 1002;     //Professor 클래스에 존재하는 필드
		
		p.eat();                  //부모의 메소드
		p.sleep();                //부모의 메소드
		p.print();                //부모의 메소드
		p.goTOcollage();          //Professor 클래스의 메소드
		
		
	}

}
