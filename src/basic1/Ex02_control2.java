package basic1;


import java.util.Scanner;

public class Ex02_control2 {

	public static void main(String[] args) {
   //      "2019111001"
		
		  
		String studentID = null;
		Scanner input = new Scanner (System.in);
		System.out.println("학번을 입력하세요.");
		studentID=input.nextLine();
		
		
		//String studentID=input.nextLine();
		
		
		char number = studentID.charAt(4);
		
		
		
		//변수를 선언해야됨
		String aa= null;
		if(number == '1' ) {
			aa = "공대";
		}else if (number =='2') {
			aa = "사회대";
		}
		
		
	
		 String number1 = studentID.substring(5, 7);     //"11"
		 int	number2 = Integer.parseInt(number1);        // 11
		 String year = studentID.substring(0,4);	
		 
		
		 
	
		 
		 String bb = null;
		 if (number=='1') {
			 switch(number2) {
		  case 11 :
			   bb="컴퓨터학과";
			   break;
		  case 12 : 
			bb="소프트웨어학과";
			   break;
		  case 13 :
			bb="모바일학과";
			   break;
		  case 22 :
			 bb="자바학과";
			   break;
		  case 33 :
			  bb="서버학과";
			   break;
		 }
			 
		 }
		 
		 if (number=='2') {
			 switch(number2) {
		 case 11 :
			bb="사회학과";
			  break;
		 case 12 :
			 bb="경영학과";
			  break;
		 case 13 :
			bb="경제학과";
			  break;
		 } 
		 
	   }
	   
		System.out.println( year +"년도에 입학한" + aa +" "+bb +" "+"학생입니다");
	 
	   
	}

}
