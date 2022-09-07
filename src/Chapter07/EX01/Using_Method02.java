package Chapter07.EX01;


class Circle{
	
         
      int radius;        //넓이
      String name;       //음식
    
      
      Circle(int radius, String name) {
    	  this.name = name;
    	  this.radius = radius;
      }
	
      void call () {
    	  double area;
    	  area = 3.14 * radius * radius ;
    	  System.out.println(name + "의 넓이는 " + area + "입니다.");
    	  
      }
      
      
}
         //여기까지 맞음 순서 바꾸니까 됨;


public class Using_Method02 {
	public static void main(String[] args) {
		
		
		Circle pizza = new Circle (10, "피자");
		pizza.call();
		
		Circle donut = new Circle (5, "도넛");
		donut.call();
		
		
		//^ 선언 방법 헷갈림
		
		// 원의 지름을 넣엇을때 전체 넓이를 구하는 객체 생성 후 출력
		// 피자 : (반지름) 10
		// 도넛 : (반지름) 5 
		// <피자>의 넓이는 <00>입니다. 
        // <도넛>의 넓이는 <00>입니다.
		// 3.14 * 반지름 ^2
		
		
		
		
	}

}
