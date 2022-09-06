package chapter05.EX01;

import java.util.Arrays;

public class Using_Array12 {

	public static void main(String[] args) {

		// 1 ~ 1000 까지 배열(arr)에 저장 후 출력
		
		
		
		// 1. 배열 선언
		
		// 2. [입력] for문 사용해서 arr 배열변수에 값을 할당
		
		// 3. [출력] for문을 사용해서 arr 배열변수의 값을 출력
		
	    // 4. [출력] Enhanced for문을 사용해서 값을 출력
		
		// 5. [출력] Arrays.toString(arr) 출력
		
		// 11시까지 
		
		
		int [] arr;
		arr= new int [1000];
		
		for(int i=0 ; i<arr.length ; i++) {
			 arr[i]=i+1;
		}
		
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
	
		
		for(int k : arr) {
			System.out.println(k);
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
