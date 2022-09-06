package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch03 {

	public static void main(String[] args) {
		/* 1. 문제 
		      스캐너로 "Gold"를 넣으면 "금메달입니다."를 출력
		      스캐너로 "Silver"를 넣으면 "은메달입니다."를 출력
		      스캐너로 "Bronze"를 넣으면 "동메달입니다."를 출력
		      그 외에는 "메달이 없습니다."
		
		 */
		
        Scanner sc = new Scanner (System.in);
        System.out.println("메달 색깔을 입력하세요~!");
        String medal = sc.next();
     
        switch(medal) {
        case "Gold" :   //쌤이 case "gold" :
        	System.out.println("금메달입니다.");
        	break;
        case "Silver" : // case "silver" :
        	System.out.println("은메달입니다.");
        	break;
        case "Bronze" : // case "bronze" :
        	System.out.println("동메달입니다.");
        	break;
        default :
        	System.out.println("메달이 없습니다.");
        }
       
       
        
            
       
       
    	sc.close();
		
	}

}
