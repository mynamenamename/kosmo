package Chapter07.EX05;

//반드시 this keyworld를 사용 해야하는 경우:
//      -생성자, 메소드의 매개변수이름, 필드이름이 동일할 경우 필드이름에 this를
//       명시해야 한다!!

class AA {
	int m;                //0
	int n;                //0
	
	void init(int m, int n) {     //this키를 명시하지 않는 경우
		m= m;            //3개의 m모두 지역변수
		n= n;
	}
}


class BB {
	int m;
	int n;
	
	void init (int m, int n) {    //this키를 명시한 경우
		this.m=m;        //this.m : 필드, m : 지역변수
		this.n=n;
	}
}




public class ThisKeyword02 {

	public static void main(String[] args) {
      
	AA aa = new AA();     //기본 생성자 호출
	aa.init(10, 20);
	System.out.println(aa.m);   //0
	System.out.println(aa.n);   //0
	
	System.out.println("========");
    
	BB bb = new BB();
	bb.init(10, 20);
	System.out.println(bb.m);
	System.out.println(bb.n);
	
	
		
		
	}

}
