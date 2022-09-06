package chapter04.EX07;

public class Using_Break {

	public static void main(String[] args) {
          //break ; <== 해당 구문 ({}) 을 탈출 할 때 사용, if 조건과 같이 사용
		  //    -1단계만 탈출
		  //for, while, do while (반복문을 탈출 할 때 사용),
		
		
		  // #1. 단일 loop에서  탈출
		  for ( int i = 0 ; i <10 ; i ++) {
			  System.out.println(i);
			  break;                         //한단계 탈출
		  }
		
		  
		  System.out.println("==================");
		  
		  //break는 for, while, do while 내에서 if 조건문과 같이 사용 
		  
		  for ( int i = 0 ; i <10 ; i ++) {
			  System.out.println(i);
			  if (i==5) { break; }                  //i가 5일때 탈출
		  }
		  
		  
		  // #2. 다중 loop문에서 break 사용
		  //   case 1. 하나의 loop문만 탈출
		  
		  System.out.println("==================");
		  
		  for (int i = 0; i < 5; i ++) {   // 0~4 : 5번 loop
			   for (int j = 0; j < 5; j ++) { // 0~4 : 5번 loop
				   if (j==2) {break;}         // 하나의 for문만 빠져나감
				   System.out.println(i + "," + j);
			   }
 		  }
		  
		  System.out.println("==================");
		  //   case 2. 한꺼번에 탈출 ( 바깥쪽 for문의 변수의 값을 조건이 false가 나도록 증가시켜서 
		  for (int i = 0; i < 5; i ++) {   // 0~4 : 5번 loop
			   for (int j = 0; j < 5; j ++) { // 0~4 : 5번 loop
				   if (j==2) {
					   i = 100;               // 바깥쪽 for문의 변수값을 증가시켜서 한꺼번에 탈출
					                          // i=100이라 false 그래서 빠져나옴
					   break;}         // 하나의 for문만 빠져나감
				   System.out.println(i + "," + j);
			   }
		  }
		  
		  System.out.println("======이중for문 탈출(lable)======="); 
		  //   case 2. 한꺼번에 탈출 (lable을 사용해서 탈출)
		 jump: for (int i = 0; i < 5; i ++) {   // 0~4 : 5번 loop
			   for (int j = 0; j < 5; j ++) { // 0~4 : 5번 loop
				   if (j==2) {
					             
					   break jump;}         // 하나의 for문만 빠져나감
				   System.out.println(i + "," + j);
			   }
		  }
		  
		  
		  
		  
		  
	}

}
