package chapter04.EX07;

public class Using_Continue {

	public static void main(String[] args) {
          //continue : continue를 만나면 continue 아래의 코드를 실행하지 않고 반복
		  //   -if문과 같이 사용됨.
		
		
		
		  //1. 단일 Loop에서 continue 
		  for (int i = 0; i < 10; i++) { // 0~9 : 총 10번
			  System.out.println("A");
			  continue;             // 구문을 빠져나가지 않고 바로 다음으로
			// System.out.println("B");   // 도달할 수 없는 코드
		  }
			  
		  System.out.println("==========================");
		  
		  for (int i = 0; i < 10; i++) { // 0~9 : 총 10번
			  System.out.println("A");
			  if ( i % 2 == 0) {continue;}   // i가 짝수(0,2,4,6,8) 일때 컨티뉴가 된다
			  System.out.println("B");   
		  }
			  
		  System.out.println("==========================");
		  for (int i=0; i < 10; i++) {
			  if (i == 5 || i == 7) { continue; }
			  System.out.print(i + " ");
			  
		  }
		  
		  
		  //완료시간 4시까지
		  
		  //1. for문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서 
		  // 3의 배수만 출력하세요.
		  
		 
		  System.out.println();
		  System.out.println("=====3의 배수=====");
		  
		  for(int i=1; i <=1000;i++) {
				 if  (i%3 !=0)  continue; 
					 System.out.println(i); {
				 }
			  }
		    
		  
		//2. for문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서 
		// 5의 배수만 출력하세요.
		  
		  System.out.println("=====5의 배수=====");
		  
		  for(int i=1; i <=1000;i++) {
			  if  (i%5 !=0) continue;
			  System.out.println(i); {  //5의 배수가 아닌것은 continue로 올려보냄
				  
			  }
		  }
		  
		  
		  //3. for문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서 
		  // 3,5,7의 배수만 출력하세요.  << 
		  
		  
		  System.out.println("=====3,5,7의 배수=====");
		  
		  for(int i=1; i <=1000;i++) {
			  if ((i%3==0) || (i%5==0) || (i%7==0)) { //쌤 괄호침 빼고 다똑같
			  System.out.println(i); {
				  
			  }
		  }
		  } 
		  
		  System.out.println("===================");
		 //2. 다중 Loop에서 continue
		  for (int i=0; i<5; i++) { //5번 
			  for (int k = 0 ; k<5 ; k++) { //5번
				  if (k==3) {continue;}
				System.out.println(i + "," + k);
			  }
		  }
		  
		  System.out.println("=====lable을 사용해서 점프함.=====");
		  
		 out: for (int i=0; i<5; i++) { //5번 
			  for (int k = 0 ; k<5 ; k++) { //5번
				  if (k==3) {continue out;}
				System.out.println(i + "," + k);
			  }
		  }
		  
		  System.out.println("===========================");
		  
		  out: for (int i=0; i<5; i++) { //5번 
			  for (int k = 0 ; k<5 ; k++) { //5번
				  if (k==3) {
					  i= 100;              //바깥쪽 for문의 변수값을 증대시켜서 false로 빠져나옴.
					  continue out;}
				System.out.println(i + "," + k);
			  }
		  }
		  
		  
		  
	}

}
