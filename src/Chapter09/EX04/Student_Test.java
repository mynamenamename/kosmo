package Chapter09.EX04;
//static 활용
//16시 45분까지

class Student {
	
	static int serialnum = 1000;   //모든 객체에서 공유하는 필드, 객체를 생성할때마다 1씩 증가
	int studentID;                 //학생 고유ID
	String studentname;            //학생 이름
	int grade;                     //학년 : 기본값 - 4
	String address;                //주소 : 기본값 - 서울
	
	
	/*선생님이 하신것 
	Student () {
	   serealnum++;       //객체를 생성시 1씩 증가, 모든 객체에서 공유해서 사용
	   studentID = serealnum;
	   grade = 4;
	   address = "서울";
	}
	Student (String studentname) {
	 this();             //기본 생성자 호출 후 아래 내용 실행
	 this.studentname=studentname;
	 
	void print () {
		System.out.println("studentname:" +studentname " stdentID: " + studentID + " grade: " + grade + " address: " + address); 
	
	
	//이렇게 해야 학년,주소가 기본값만 나오는듯
	*/
	
	
	Student () {
		this.grade = 4;
		this.address = "서울";
		
	}
	
	
	Student (String studentname, int grade, String address) {
		studentID = serialnum++;
		this.studentname=studentname;
		this.grade=grade;
		this.address=address;
	
	}
	
	void print () {
		System.out.println("studentname:" +studentname + " stdentID: " + studentID + " grade: " + grade + " address: " + address);
		
	}

}



public class Student_Test {

	public static void main(String[] args) {
		//객체 생성시 자동으로 학번 저장 (1000부터 1씩 증가)
		//student ID : 1000부터 학생객체를 생성 할때마다 고유한 값으로 적용되어 있어야 한다
		 
		Student lee = new Student ("이순신",3,"대구"); //1001
		lee.print();
		
		Student hong = new Student ("홍길동",2,"서울"); //1002
        hong.print();
		
		Student jung = new Student ("정약용",1,"경주"); //1003
		jung.print();
		
		Student Kim = new Student ("김김김", 4, "서울");
		Kim.print();
	}

}
