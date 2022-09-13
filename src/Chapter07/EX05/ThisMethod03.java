package Chapter07.EX05;


class Book {
	String bookname;     //책 이름
	String author;       //책 저자
	
	Book() {
		bookname = "책 이름없음";
		author = "작자미상";
	}
	
	Book(String bookname) {
		this();
		this.bookname=bookname;
	}
	
	Book(String bookname, String author) {
		this(bookname);          //this() 메소드  : 생성자 호출
		this.author=author;      //this keyword : 자신의 객체의 필드, 메소드
	}
	
	void print () {      //메모리의 필드의 값을 출력해줌
		System.out.println("책의 이름은: " + bookname);
		System.out.println("책의 저자는: " + author);
	}
	
	
}


public class ThisMethod03 {

	public static void main(String[] args) {
     
		//1. 기본 생성자 호출
		System.out.println("===기본생성자 호출===");
		Book book1 = new Book ();  //기본 생성자 호출
		book1.print();
		
		//2. 매개변수 1개인 생성자 호출
		System.out.println("===매개변수 1개인 생성자 호출===");
		Book book2 = new Book ("자기앞의 生");
		book2.print();
		
		//3. 매개변수 2개인 생성자 호출
		System.out.println("===매개변수 2개인 생성자 호출===");
		Book book3 = new Book ("파과", "구병모");
		book3.print();		
		
		
		//4. 매개변수 2개인 생성자 호출
		System.out.println("===매개변수 2개인 생성자 호출===");
		Book book4 = new Book ("어린왕자", "생텍쥐베리");
		book4.print();
		
		//5. 매개변수 1개인 생성자 호출
		System.out.println("===매개변수 1개인 생성자 호출===");
		Book book5 = new Book ("포청천뎐");
		book5.print();
		
		
	}

}
