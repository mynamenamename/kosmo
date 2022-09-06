package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if02 {

	public static void main(String[] args) {
       //점수(score) int 와 학년(year) int을 인풋 받아서 60점 이상이면 합격, 미만이면 불합격
	   //4학년인 경우, 70점 이상이면 합격	, 중첩if문 사용 (if문 내에 if문)
	   // 완료시간: 16시 40분 까지	
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수와 학년을 입력하세요.>>>");
		
		int score;
		score = sc.nextInt();
		
		int year;
		year = sc.nextInt();
		
		
	    if (score >=60 ) {
	    	System.out.println("합격");
	    }else {
	    	System.out.println("불합격");
	    }
	    if(year == 4 & score >= 70){
	    	 System.out.println("합격");
	    }else  {
	    	System.out.println("불합격");
	    }
		*/ 
		 //내가한거 ㅋ ㅠ
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요(0~100)>>");
		int score = sc.nextInt();
		System.out.println("학년을 입력하세요(1~4)>>");
		int year= sc.nextInt();
		
		if(score >= 60) {
			if(year != 4) {
			System.out.println("합격");  //4학년이 아니면 60점 이상이면 합격
			} else if ( score >= 70) {
		    System.out.println("합격");  //4학년이고 70점 이상이면 합격
			}else {
				System.out.println("불합격");  //4학년이고 70점 이상이 아니면 불합격
			}
		}else {
			System.out.println("불합격");  //60점 미만이면 1,2,3,4 모두 불합격
		}
	  
		
		
		
        sc.close();		
		
		
        
        
        
		
	}

}
