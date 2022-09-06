package Chapter03.EX02;

public class BitwiseOperator {

	public static void main(String[] args) {
         //bit 연산 
		 //자바 메서드를 사용해서 진법 변환 (2진수, 8진수, 16진수)
		 int data = 13;
		 
		 //Integer 객체의 함수를 사용  (총 32bit , 4byte , int)
		 //  -- toBinaryString(입력값) : 10진수 >> 2진수
		 
		 System.out.println(Integer.toBinaryString(data)); //정수를 2진수로 출력
		 System.out.println(Integer.toOctalString(data)); //정수를 8진수로 출력
		 System.out.println(Integer.toHexString(data)); //정수를 16진수로 출력 
         System.out.println("================");
         
         //2진수 , 8진수 , 16진수의 값을 10진수로 변환
         
         System.out.println(Integer.parseInt("1101",2)); //2진수를 10진수로 변환 		 
         System.out.println(Integer.parseInt("15",8)); //8진수를 10진수로 변환
         System.out.println(Integer.parseInt("d",16)); //16진수를 10진수로 변환
	     System.out.println("================");
         
         //다양한 진법 표현
         System.out.println(13);
         System.out.println(0b1101);       //0b : 2진수
         System.out.println(015);          //0  : 8진수
         System.out.println(0xd);          //0x :16진수
         System.out.println("===============");
         
         //비트연산자 And :  &   << 두 비트 모두 1일때 1
         System.out.println(3 & 10);               //2 
         System.out.println(0b0011 & 0b1010);      //2
         System.out.println(0x03 & 0x0A);          //2
         System.out.println("===============");
         
         //비트연산자 Or :   |   << 비트 하나라도 존재하면 1
         System.out.println(3 | 10);               //11
         System.out.println(0b0011 | 0b1010);      //11
         System.out.println(0x03 | 0x0A);          //11
         System.out.println("===============");
         
         //비트연산자 Xor :  ^   << 두 비트가 동일할 때: 0, 두 비트가 다를때: 1
         System.out.println(3 ^ 10);               //9
         System.out.println(0b0011 ^ 0b1010);      //9
         System.out.println(0x03 ^ 0x0A);          //9
         System.out.println("===============");
	     
         //비트연산자 Not :  ~   << 0일때 1, 1일때 0 , 마이너스 붙이고 +1 
         System.out.println(~3);                   //-4   
         System.out.println(~0b0011);              //-4  
         System.out.println(~0x03);                //-4
         
         
         System.out.println(~100) ;                //-101
         
         int abc = 123;                  //10진수
         int bcd = 0123;                 //8진수 - java에선 0이 앞에오면 그럼        
         int efg = 0x123;                //16진수 - java에선 0x가 앞에오면 그럼
         
         System.out.println(abc);
         System.out.println(bcd);
         System.out.println(efg);
         
         
         
	}

}
