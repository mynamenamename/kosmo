package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if04 {

	public static void main(String[] args) {
         // 에스프레소, 카페라떼, 아포가토 주문할 경우 가격이 3,500원
		 // 아메리카노 주문할 경우 가격이 2,500원 
         // 그 외의 메뉴를 주문할 경우: 우리 매장에 없는 메뉴 입니다.		
		
		
		 // 출력: 주문하신 <에스프레소>는 가격이 <3500>원 입니다.
		 //      우리 매장에 없는 메뉴 입니다.  
		
		 Scanner sc = new Scanner (System.in);
		 
		 
		 System.out.println("주문할 커피 메뉴를 고르세요>>>");
		 String order = sc.next();
		 int money1 = 3500;
		 int money2 = 2500;
		
		 
		 
		 if (order.equals("아메리카노")) {
				System.out.println("주문하신 " + order + "는 가격이 " + money2 + "원 입니다.");
		 }else if (order.equals("카페라떼") || order.equals("에스프레소") || order.equals("아포가토"))  {
				System.out.println("주문하신 " + order + "는 가격이 " + money1+ "원 입니다.");
			}else {
				System.out.println("우리 매장에는 없는 메뉴입니다.");
			}
		 
		 
		 /*쌤
		  
		 System.out.println("주문할 메뉴를 입력하세요. >>>");
		 System.out.println("======================");
		 System.out.println("에스프레소 카페라떼 아포카토 아메리카노");
		 System.out.println("======================");
		 
		 String order = sc.next();
		 int price = 0;
		   
		 if (order.equals("에스프레소") || order.equals("카페라떼") || order.equals("아포가토"))  {  
		   price = 3500;
		   
		 }elseif (order.equals("아메리카노")) {
		   price = 2500;
		 }else{
		 System.out.println("우리 매장에 없는 메뉴 입니다.")
		 }
		 System.out.printf("주문하신 %s는 가격이 %d원 입니다.", order, price);
		   
		 */
		 
		 
		 
		 sc.close();
		
		
	}

}
