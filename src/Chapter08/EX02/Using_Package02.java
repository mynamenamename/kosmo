package Chapter08.EX02;

//import를 사용해서 외부 패키지 접근
      //동일한 클래스(이름이 같을때)는 import로 사용불가 


import Chapter08.EX01.A;
//import Chapter08.EX01.com.A;     //오류 발생, 동일한 클래스는 import 할 수 없음

//import Chapter08.EX01.B;         //오류 발생, 접근 제어자가 default


public class Using_Package02 {

	public static void main(String[] args) {
		
		  //A 클래스는 동일한 패키지 내에 존재하지 않는다. (import를 해서 사용)
		  //      -- A class는 접근 제어자가 public, protected (상속) 지정되어 있어야 한다.
		 
		   System.out.println("===A클래스(public)===");
           A a = new A ();
		
		   System.out.println(a.m);      //다른 패키지에서 접근
		   System.out.println(a.n); 
		   
		   a.print();
		
		
		   System.out.println("===B클래스(defalut)===");
         //B클래스는 다른 패키지에 존재하고, 접근 제어자가 default로 할당 되어 있음
	     //외부 패키지에서는 접근이 불가하다	   
	     // B b = new B ();
		   
		   
		   System.out.println("===com.A클래스 객체 생성===");
		   //동일한 클래스는 import가 불가능, 전체 이름 사용해서 객체 만들어야함
		   
		   Chapter08.EX01.com.A aa = new Chapter08.EX01.com.A ();
		   System.out.println(aa.aa);
		   System.out.println(aa.bb);
		   aa.print();
		
	}

}
