package basic1;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 제어문: 프로그램 흐름을 변경하기 위해서
 * 
 *     1) if
 *     2) switch
 *     3) for
 *     4) while / do~while
 *
 *     5) break / continue 
 * 
 * 
 * 
 */


public class Ex02_control {

	public static void main(String[] args) {

		String id =null;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("주민번호를 입력하세요.");
		
		id = input.nextLine();
		
		char sung = id.charAt(7);
		System.out.println(sung);
		
		//sung 변수의 문자가 1이면 남자 출력
		// 그렇지 않으면 여자 출력
		
		
		 if (sung=='1')   {      //숫자 1이 아님 '문자' 1
			 System.out.println("남자");
		 }else {
			 System.out.println("여자");
		 }
		
		 System.out.println("====="); 
		//sung 변수의 문자가 1이면 남자 출력
		// 그렇지 않고 문자가 2라면 출력
			
		
		 if (sung=='1') {
			 System.out.println("남자");
		 }else if(sung =='2') {
			 System.out.println("여자");
		 }
		 
		 System.out.println("=====");
		 //sung 변수의 문자가 1이거나 3이거나 9라면 남자
		 //그렇지 않고 문자가 2이거나 4거나 0이라면 여자
		 // 논리연산자 || 하나만 true면 뒤에 무시
		 // 바이트연산자 | 써도 됨
		 
		 if (sung == '1'||sung =='3'||sung =='9') {
			 System.out.println("남자");
		 }else if (sung =='2'||sung =='4'||sung =='0') {
			System.out.println("여자");
		 }
		
		 System.out.println("=====");
		 //8번째 문자를 하나 얻어와서 chul 이라는 문자에 저장하세요.
		 
		 char chul = id.charAt(8);
		 System.out.println(chul);
		 //chul변수가 0이라면 '서울'
		 //chul변수가 1이라면 '인천/부산'
		 //chul변수가 2라면  '경기도'
		 //chul변수가 9라면  '제주도'
		 
		 System.out.println("=====");	 
 		 
		 //내가한것
		 //chul을 또 선언하고 ' '사용안함
		 
		 switch (chul) {
		 case '0':
			 System.out.print("서울");
			 break;
		 case '1':
			 System.out.print("인천/부산");
			 break;
		 case '2':  case '3': case '4': case '5':
			 System.out.print("경상북도");
			 break;
		 case '6': case '7': case '8':
			 System.out.print("경상남도");
			 break;
		 case '9':
			 System.out.print("제주도");
			 break;
	     default:
	    	 System.out.print("한국 사람이 아닙니다.");
	    	 break;
		 }
		 System.out.print( " 출신입니다" );
		 System.out.println();
		 System.out.println("=====");
		 
		 //선생님
		 
		 /* 
		 
		 switch (chul) {     //문자, 정수, 문자열
		 case '0' : home = "서울"; break;
		 case '1' : home = "인천/부산";  break;
		 case '2' : home = "경기";  break;
		 case '9' : home = "제주";   break;
	    }
	    System.out.println(home + "출신");
	    
	    */
		 
	
		 
		 
		
		 String nai = id.substring(0, 2); // nai = "앞 두자리"
			         //0부터 2앞에까지 주의할것
		 
		//문자열 > 정수로 변환
		//불가	 int sunai = (int) nai;
		 int sunai = Integer.parseInt(nai); // sunai = 앞 두자리
		 
		 
		 char sung2 = id.charAt(7);
			
		     int sum =0;
		     
			 if (sung2 == '0'||sung2 == '9') {
				sum=1800;
			 }else if (sung2 =='1'||sung2 =='2') {
				sum=1900;
			 }else if (sung2 =='3'||sung2 =='4') {
				sum=2000;
			 }
			 
			 Calendar c = Calendar.getInstance();
			 int year = c.get(Calendar.YEAR);
			 int age = 0;
			 
			 age= year- (sum + sunai) + 1;
			 System.out.println(age);
		     
	}

}
