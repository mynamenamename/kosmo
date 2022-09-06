package chapter05.EX01;

import java.util.Arrays;
import java.util.Scanner;

public class Using_Array08 {

	public static void main(String[] args) {
		    //스캐너로 인풋받아 임의의 정수 10개 등록 후 
            //정수 배열 방 10개를 생성하고, 
		    //임의의 값을 10개에 방에 저장
		    //그 중 최대값을 뽑아서 출력하는 프로그램을 생성해보세요.
		    //출력 : 배열방 10개에서 최대값은 : 000 
		    //15시 10분까지 
		
		
		 Scanner sc = new Scanner (System.in);
		 
		 int [] arr = new int [10];
		
		 
		 System.out.println("정수를 입력하세요.");
		 
		 //스캐너로 임의의 정수값 입력
		 for (int i = 0 ; i <10 ; i++) {
			 arr[i] = sc.nextInt();
		 }
		
		 int max = arr[0];   //최대값
		 int min = arr[0];   //최소값 
		 
		 
		//최댓값을 봅아서 max 변수에 저장후 출력
		 for (int i=0 ; i <10 ; i++) {
			 if (arr[i] > max) {        //arr의 i번째 방의 값이 max 변수의 값보다 크면
				 max =arr[i];           //max 변수에 arr[i]번 방의 값을 max 변수에 대입
			 }
		 }
		 System.out.println("배열방 10개에서 최댓값은 :" + max);
		
		 
		 //최소값을 뽑아서 min 변수에 저장 후 출력
		 for (int i=0; i <10 ; i++) {
			 if (arr[i] < min) {
				 min = arr[0];
			 }
		 }
		 System.out.println("배열방 10개에서 최솟값은 :" + min); 
			 
		 
		 System.out.println("=====2번째 방법은 Arrays.sort()=====");	
		 
		 Arrays.sort(arr);    //배열 방의 값을 정렬을 한다. 0 (최소값) , 1, 2, 3.... arr.length -1 (최대값)
		 
		 System.out.println("최대값: " + arr[arr.length-1]); // 최대값
		 
		 System.out.println("최소값: " + arr[0]);
	
		 System.out.println("====Stream을 사용하는 경우=====");
		 System.out.println("최대값:" + Arrays.stream(arr).max().getAsInt());
		 System.out.println("최소값:" + Arrays.stream(arr).min().getAsInt());
		 
		 
		 
		 
		
	}

}
