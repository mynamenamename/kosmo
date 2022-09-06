package chapter05.EX01;

import java.util.Arrays;

public class Using_Array05 {

	public static void main(String[] args) {
        // 1~500 까지 3의 배수를 배열에 저장!
		// 출력  : 1. 직접출력 , 2. for문 출력 , 3. Enhanced For문 4. toString()
		// 합계  :            평균:     (for문사용)
		// 완료시간 : 11시 45분까지
		
		//1.직접출력
		int [ ] a = new int [166];    
		a[0]=3;
		a[1]=6;
		
		/*선생님 갯수 찾는 방법
		
		int [ ] a = new int [500];   
		int count1 =0;
		for (int i=0, j=3; i <a.length;i++, j+=3) {
		   if (j<=500) {
		   a[i]=j;
		   count1++;
		System.out.println(count1);  >> 갯수 나옴   
		  
			}
		}
		*/
		
		
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println("=========================");
		
		
		//2.for문 출력
		// 내가한것
		for(int i=0, j=3 ; i < a.length ; i++, j+=3) { 
			a[i]=j;      
			System.out.println(a[i]);
		}
		 
		
		/*
		선생님
		for(int i=0; i < a.length ; i++) {
			System.out.println(a[i]);
		}
		*/
		
		
		System.out.println("=========================");
		//3.Enhanced for문 출력
		
		for (int k :a) {
			System.out.println(k);
		}
		
		System.out.println("=========================");
		//4.toString()
		
		System.out.println(Arrays.toString(a));
		
		
		System.out.println("=========================");
		//합계
		int sum = 0;
		for(int i=0, j=3 ; i < a.length ; i++, j+=3) { 
			sum+=a[i];       
		}
		System.out.println("합계:" +sum);
		
		
		System.out.println("=========================");
		//평균
		int avg = 0;
		for(int i=0,j=3 ; i < a.length ; i++, j+=3) {
			avg=sum/a.length;
		}
		System.out.println("평균:" + (double)avg);
		
		
		
		System.out.println("========================");
		
		
		
	
		
	}

}
