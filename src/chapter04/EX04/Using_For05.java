package chapter04.EX04;

import java.util.Scanner;

public class Using_For05 {

	public static void main(String[] args) {
         //이중 for문을 사용해서 1-9단까지 출력.
		 /*   \n: enter, \t: tab
		         1*1=1   1*2=2    1*3=3 ....... 1*9=9
		         2*1=2   2*2=4..................2*9=18
		         ....
		         9*1=9   9*2=18  ..........     9*9=81
		     
		    <완료시간: 17:45까지 ㅋㅎ>         
		         단이 바깥쪽, 숫자가 안쪽
		  */
		
		 /*1단
		
		for(int i= 1; i<=9; i++) {
				System.out.print("1*"+i+"="+ i + "\t");

		   }
		  */
		
				
				
				
		for(int k=1 ; k<=9 ; k++) {
			for(int i=1 ; i<=9 ; i++) {
				System.out.print(k+ "*" +i+ "=" +k*i );
				System.out.print("\t");
			}
                System.out.println();
		} 

		System.out.println("===================");
		
		//1단 ~ 19단까지 3의 배수단만 출력
		
	/*	for(int k=1 ; k<=19 ; k++) {
			for(int i=1 ; i<=19 ; i++) {
				if((k*i)%3==0) {
					System.out.print(k+ "*" +i+ "=" +k*i );
					System.out.print("\n");}                     */
				
				
	               
				//선생님이 하신거랑 미묘하게 다름... :이유 괄호를 잘못 설정함ㅋㅋ
				//선생님이 하신 것
		  
			  for(int i = 1; i<=19; i++){
			   for(int j = 1; j<=19; j++){
			    if (i%3==0)
			     System.out.print(i+"X"+j+"="+i*j+" ");
			   }
			   System.out.println(); 
			  }
			
			
		
		
		
		
				
				
		
		     
		
		  	System.out.println("============");
			
			 //스캐너에서 입력받은 단만 출력 (1~9단)
	         // 출력할 단을 입력하세요 (1~9단) >>
	         // ======
			
			
			
			
			
			  Scanner sc = new Scanner (System.in);
			
			  System.out.println("원하는 구구단을 입력하세요");
			  int i = sc.nextInt();
			  
			  for (int p=1; p<=9; p++) {
				  System.out.println(i+"*"+p+"="+i*p);
				  
			  }
			 
			  
			  
			  
			  
			  sc.close();
						 
				
				
				
				
			} 
					
				
					
 }        
		    
 