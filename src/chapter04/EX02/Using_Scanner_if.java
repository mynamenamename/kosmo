package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if {

	public static void main(String[] args) {
       // 문제 : Scanner로 정숫값을 인풋 받아서
	   // 국어(aa), 영어(bb), 수학(cc), 과학(dd), 음악(ee) 점수를
	   // 인풋 받습니다.
	   // if문을 사용해서 평균이 90점 이상이면 "A학점", 80점 이상이면 "B학점",
	   // 70점 이상이면 "C학점", 60점 이상이면 "D학점" , 나머지는 "F학점"
	   // 완료시간 > 15:50 분 까지!	
		
		
		
	 	
	   Scanner sc = new Scanner(System.in);
		 
	 
		System.out.println("국어, 영어, 수학, 과학, 음악 점수를 "
				+ "공백으로 구분해서 입력하세요.>>>");
		
		int aa = sc.nextInt();
		int bb = sc.nextInt();
		int cc = sc.nextInt();
		int dd = sc.nextInt();
		int ee = sc.nextInt();
	    
		
		double avg = (aa + bb + cc + dd + ee)/ 5.0;
        
		
		if ( avg >= 90 ) {                         //쌤이 하신 것: 90.0
			System.out.println("A학점:" + avg);       // 학점 뒤에 +avg
		}else if( avg >= 80 ) {
			System.out.println("B학점:" + avg);
		}else if( avg >= 70 ) {
			System.out.println("C학점:" + avg);
		}else if( avg >= 60 ) {
			System.out.println("D학점:" + avg);
		}else {
			System.out.println("F학점:" + avg);
		}
		   
	    
		sc.close();
		
	}

}
