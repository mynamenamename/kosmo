package chapter04.EX04;

import java.util.Scanner;

public class Using_For03 {

	public static void main(String[] args) {
		// for문 내의 if문
        // 정수 (음수, 양수)를 스캐너로 5개 인풋 받아서
		// 양수만 더한 값과 평균값을 출력하세요.~!
		// 
		// 16:20분 까지,,,,
		
		Scanner sc = new Scanner (System.in);
		int sum = 0;     //양수만 더함
		int sum1 = 0;    //모든 수를 더함
		int count = 0;   //양수 카운트 하는 변수
		int count1 = 0;  //모든 수를 카운트 하는 변수
		System.out.println("정수 5개를 입력하세요.(음수,양수)");
		for(int i=0 ; i < 5 ; i++) {   //i가 0부터 4까지의 의미가 아니고 걍 갯수;;
			int n = sc.nextInt();
			sum1 += n;    //입력받은 모든 수 더함
			count1++;     //모든 수를 카운트 
			if (n > 0) {
				sum +=n;
				count++;   //양수일때 1씩 증가
			}
		}
		System.out.println("양수의 합: " + sum + ", 양수의 평균: "+ sum/ (double)count);
		System.out.println("모든 수의 합: " + sum1 + ", 모든수의 평균" + sum/(double)count1 );

		
		sc.close();
			
		}
		
	   
	 
		
		
	/*	int a=0;
		
		for (int i=-2; i< 5; i++) {
			a= sc.nextInt();
			System.out.println(a);
			if(i>=0) {
				System.out.println();
			}else {
			
				System.out.println("");
			}
			
		}
		 모르겠다~! */ 
		
		
		
	
		
	
 }
