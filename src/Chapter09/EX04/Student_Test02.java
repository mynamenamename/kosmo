package Chapter09.EX04;

class Student02 {

	// 필드의 접근제어자 : default로 구성됨 : 외부 클래스에서 객체를 생성 후 직접 수정이 가능함.
	static int serialnum = 1000; // 모든 객체에서 공유하는 필드, 객체를 생성할때마다 1씩 증가
	int studentID; // 학생 고유ID
	String studentname; // 학생 이름
	int grade; // 학년 : 기본값 - 4
	String address; // 주소 : 기본값 - 서울

}

class Student03 {
	// 필드의 접근 제어자는 보안을 위해서 private으로 선언 할 수 있다.
	// --필드의 값을 직접적으로 수정할 수 없다.
	// --

	private static int serialnum = 1000; // 모든 객체에서 공유하는 필드, 객체를 생성할때마다 1씩 증가
	private int studentID; // 학생 고유ID
	private String studentname; // 학생 이름
	private int grade; // 학년 : 기본값 - 4 (값이 1~4)
	private String address; // 주소 : 기본값 - 서울
	private int month; // 값이 1~12

	/*
	 * 필드의 접근 제어자를 private로 설정하면 외부 클래스에서 접근 불가함 
	 * 생성자나 setter(메소드)를 사용해서 필드의 내용 수정
	 * 원하는 값을 제어해서 입력 할 수있다.
	 */

	Student03() {
		serialnum++;
		studentID = serialnum;
		grade = 4;
		address = "서울";
	}

	Student03(String studentname) {
		this(); // 기본 생성자를 다시 호출
		this.studentname = studentname;

	}

	void print() {
		System.out.println("학생 ID : " + studentID);
		System.out.println("학생 이름 : " + studentname);
		System.out.println("학년 : " + grade);
		System.out.println("주소 : " + address);
		System.out.println("월 : " + month);
	}
	
	public void setGrade(int grade) {           //setter : grade 필드의 값을 할당하는 setter
	    //set필드대문자
		
		if(grade >= 1 && grade <=4) { 
		 this.grade = grade;
		}else {
			System.out.println("잘못된 값을 입력했습니다. 1~4 까지만 입력하세요");
			return;         //메소드 종료
		}
	}
	
	public void setMonth(int month) {           //외부 클래스에서 접근 가능
		if (month >=1 && month <=12) {
			this.month=month;
		}else {
		System.out.println("잘못된 값을 입력했습니다. 1~12 까지만 입력하세요");
	    return;            //메소드 종료
	}
  }
}

public class Student_Test02 {

	public static void main(String[] args) {
		// 객체 생성
		Student02 s = new Student02();

		// default 접근 제어자: 동일한 패키지에 존재하는 클래스에서 필드의 값을 직접 수정
		s.serialnum = 2000;
		s.studentID = 100;
		s.studentname = "홍길동";

		// 객체 생성
		Student03 s3 = new Student03("홍길동");
//		s3.serialnum = 2000;          //접근제어자 : private, 접근 불가능
//      s3.studentID = 100;
//		s3.studentname = "홍길동";
		
		// 필드의 값을 직접 입력하는 경우는 넣는 값을 제어할 수 없다.
//		s3.grade = 100;               //1~4     private
//		s3.month = 200;               //1~12    private
		
		
		s3.setGrade(4);
		s3.setMonth(1);
		s3.print();
		
		

	}
}
