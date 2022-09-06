package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if05 {

	public static void main(String[] args) {
         /*
          * 스캐너로 나이를 인풋받아서 출력 : 
           나이(age)가 8세 미만이면  : "취학 전 아동입니다."
                                 "입장료는 <1000>원 입니다."
           나이(age)가 14세 미만이면 : "초등학생 입니다."
                                 "입장료는 <2000>원 입니다."
           나이(age)가 20세 미만이면 : "중고등학생 입니다."                                            
                                 "입장료는 <2500>원 입니다."
           나이(age)가 20세 이상이면 : "일반인 입니다."
                                 "입장료는 <3000>원 입니다." 
                                 
           <18시 20분까지 완료>~~                                          
          */
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("나이를 입력하세요");
		
		int age = sc.nextInt();
		int money1 = 1000;
		int money2 = 2000;
		int money3 = 2500;
		int money4 = 3000;
		
		if (age < 8) {
			System.out.println("취학 전 아동입니다. 입장료는 " + money1 + "원 입니다.");
		}else if (age <14) {
			System.out.println("초등학생 입니다. 입장료는 " + money2 + "원 입니다.");
		}else if (age <20) {
			System.out.println("중고등학생 입니다. 입장료는 " + money3 + "원 입니다.");
		}else {
			System.out.println("일반인 입니다. 입장료는 " + money4 + "원 입니다.");
		}
		
		
		
		sc.close();
		
		
		
		/*쌤
		  
		 
		int age=ac.nextInt();
		int price=0;
		
		if (age <8) {
		System.out.println("취학전 아동입니다.");
		price = 1000;
		}else if (age <14){
		System.out.println("초등학생 입니다.");
		price =2000;
		}else if (age <20){
		System.out.println("중고등학생 입니다.");
		price =2500;
		}else{
		System.out.println("일반인 입니다.");
		price =3000;
		}
		System.out.println("입장료는 "+ price + "입니다. "); 
		}  
		  
		  
		  
		 */
		
		
		
		
	}

}
