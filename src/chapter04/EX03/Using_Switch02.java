package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch02 {

	public static void main(String[] args) {

		  //switch 문으로 처리 ""
		 // 스캐너 사용
		 // 에스프레소, 카페라떼, 아포가토 주문할 경우 가격이 3,500원
		// 아메리카노 주문할 경우 가격이 2,500원 
        // 그 외의 메뉴를 주문할 경우: 우리 매장에 없는 메뉴 입니다.		
		
		
		 // 출력: 주문하신 <에스프레소>는 가격이 <3500>원 입니다.
		 //      우리 매장에 없는 메뉴 입니다.  
		 // 완료 시간 11시 5분까지
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("주문할 커피 메뉴를 고르세요.");
		String order = sc.next();
		int prise = 0;
		
		switch(order) {
		case "에스프레소" : case "카페라떼" : case "아포카토" :
		       prise = 3500;
		       break;
		case "아메리카노" :
			   prise = 2500;
			   break;
		default :
			  System.out.println("우리 메장에 없는 메뉴입니다.");
		       
		}
		
		System.out.printf("주문하신 커피는 %s이고, 가격은 %d 원입니다.",order, prise);
		
		
		

		sc.close(); 
		
	/*	String aa = "에스프레소";
		aa = "카페라떼";
		aa = "아포가토";		
		aa = "아메리카노";
		
		int a= 3500;
		int b= 2500;
		
		switch (aa) {
		case "에스프레소" : case "카페라떼" : case "아포가토" :
			System.out.println("주문하신 " + aa + "는 가격이 " + a + "원 입니다." );
		    break;
		case "아메리카노": 
			System.out.println("주문하신 " + aa + "는 가격이 " + b +" 원 입니다.");
			break;
		default:
			System.out.println("우리 매장에 없는 메뉴입니다.");
		} 
		*/
		
		// 내가한거 ㅋ ㅎ
		
		
		
		
	}

}
