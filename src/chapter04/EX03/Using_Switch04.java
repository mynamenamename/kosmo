package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch04 {

	public static void main(String[] args) {

		/*
		   
		   2. 문제
		      스캐너로 월을 인풋 받아서 해당 월의 총 날짜를 입력
		      "<월>월은 <몇일>일까지 이 있습니다."   
		  
		  
		 */
		
		
		 Scanner sc = new Scanner (System.in);
		 System.out.println("월을 입력하세요~!");
	        int yue = sc.nextInt();
	        
	        // 1,3,5,7,8,10,12 = 31
	        // 4,6,9,11 = 30 
	        // 2 =28 
	        int ri = 0;
	       
	        switch (yue) {
	        case 1 :  case 3 : case 5 :
	        case 7 : case 8 : case 10 : case 12 :
	        	ri = 31;
	            break;
	        case 4 :  case 6 : case 9 : case 11 :   
	            ri = 30;
	            break;
	        default :
	        	ri = 28;
	        }
	       System.out.printf("%d월은 %d일 까지 있습니다.",yue, ri);
	      
		
		 sc.close();
		 
		
		//쌤이랑 거의 ㄷ독같이 함.
		// 쌤은 case 2 : day =28;
		//     default : Sytem.out.println("존재하지 않는 달입니다.");
		//까지 하심~~~!
		
		 
		 
		 		 
		 
	}

}
