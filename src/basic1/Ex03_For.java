package basic1;

/*
 * 반복문 : for / while / do~while
 * 
 * 
 * (1) for (초기치; 조건문; 증가치) {
 *          반복구문      
 *  }
 * 
 * 
 * 
 */

public class Ex03_For {

	public static void main(String[] args) {
		
		// 1) 1부터 10까지 숫자 출력
		 for (int i = 1; i<=5 ; i++) {
			 System.out.println(i);
		 }
		System.out.println("====");
		 // [1] 위의 for 원리 이해하기
		 // [2] 1부터 10까지 합을 출력
		 int a=0;
		 for (int i =1; i<=10; i++) {
			    a+=i;   
		 }
		    System.out.println(a);
		 
		 System.out.println("====");
		 
		 // [3] 1부터 10까지의 홀수의 합을 출력
		 
		 int aa=0;
		 for (int i=1; i<=10; i++) {
			 if(i%2==1) {
				 aa+=i;
			 }
		 }
		 System.out.println(aa);
		 
		 System.out.println("====");
		 
		 
	    int aa1 =0;
	    for (int i=1; i<=10;i+=2) {
	    	aa1+=i;
	    }
		 System.out.println(aa1);
		 
		 
		 
		 
		/*
		// 2) 'A'부터 'Z'까지 출력
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		// 2-2) 하나씩 건너서 출력
		for (char i = 'A'; i <= 'Z'; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 3) 'Z'부터 'A'까지 출력
		for (char i = 'Z'; i >= 'A'; i--) {
			System.out.print(i+ " ");
		}
		System.out.println();
		*/
	}

}
