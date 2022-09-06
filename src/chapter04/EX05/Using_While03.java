package chapter04.EX05;

import java.util.Scanner;

public class Using_While03 {

	public static void main(String[] args) {
          // "그만" 할 때까지 정수값을 넣어서 합계와 평균을 출력.
		  // 완료시간 11:15
		  // 힌트 : String으로 인풋받아서 int로 변환
		  // 1. String s = sc.nextLine();   인풋 받는다. 
		  // 2. s.split(" ") ; <== 공백을 기준으로 잘라서 배열에 저장
		  // 3. 문자형 String 을 정수형으로 변환 , Inter.PersInt() 
		  // 4. 합계와 평균을 구하면 됩니다.
		
		 //나중에 다시,, 배우고 나서 ( 9/1 배움 ) 

		 Scanner sc = new Scanner (System.in);
		 
		 String s;
		 do {
			 System.out.println("정수 값을 공백을 이용해 입력하세요.");
			 s = sc.nextLine();
			 if (s.equalsIgnoreCase("그만")) {
				 break;
			 }
			 String []arr;
			 arr=s.split(" ");
			 
			 
			 int b;
			 int sum=0;
			 
			 int count=0;
			 for (int i=0; i < arr.length ; i++) {
				 
			      b=Integer.parseInt(arr[i]);
			      sum += b;
			      count++;
		       
	      	 }
	         
			 System.out.println("정수의 개수:" + count);
			 System.out.println("정수의 합:" + sum);
			 System.out.println("정수의 평균:" + sum/(double)count);
			 
		 } while(true);
		 System.out.println("프로그램을 종료합니다");
		
			 
		
	}

}
