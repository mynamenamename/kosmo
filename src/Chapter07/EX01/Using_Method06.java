package Chapter07.EX01;

import java.util.Arrays;

public class Using_Method06 {

	static int add(int[] a) {
		// 들어온 배열의 모든값을 더해서 더한값을 리턴
		int sum = 0;           //각 배열의 방의 값을 가져와서 더해서 저장
		for (int i = 0; i < a.length; i++) {
			sum += a[i];       //sum=sum+a[i]
		}

		return sum;
	}

	static int div(int[] a) {
		// 들어온 배열의 모든값을 빼서 뺀값을 리턴
		int div = 7;
		for (int i = 0; i < a.length; i++) {
			if (i==0) {continue;}         // i=0일때는 아래 내용 실행하지 않기
			div -= a[i];      //div=div-a[i]
		}                     //1>> 7-7\0  2>> 0-14 3>>14-21 -7... //계상해보깅ㅋ

		return div;
	}

	static long mul(int[] a) {
		// 들어온 배열의 모든값을 곱해서 곱한값을 리턴
		long mul = 1;                    //곱하기 할때는 초기값을 1로 설정!
		for (int i = 0; i < a.length; i++) {
			mul *= a[i];  // mul= mul *a[i]
		}

		return mul;
	}

	static double avg(int[] a) {
		// 들어온 배열의 모든값을 균낸값을 리턴
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
		    sum += a[i];      //sum=sum+a[i]
		}
        double avg =  (double)sum /  a.length;
        
		return avg;
	}

	public static void main(String[] args) {
		// 1 ~ 100까지 7의 배수만 저장 후 각 메소드 호출
		// 완료시간: 1시 20분까지

		// 배열의 7의 배수 저장
		int[] aa = new int[100 / 7]; // 배열의 방의 갯수 //지정못함, 뒤에 다다름
		for (int i = 0, j = 7; i < aa.length; i++, j += 7) {
			aa[i] = j; // a[0]=7, a[1]=14 . . .8   
   
	
			
			
			//if로해보깅ㅋ
		}

		// 배열의 각 방의 내용 출력
		for (int i = 0; i < aa.length; i++) {
			System.out.print(aa[i] + " ");
		}
		System.out.println();
		System.out.println("==================");
         
		// 메소드 호출 : add(arr1)
	   int sum = add(aa);
	   System.out.println("더한값:" + sum);	
		
	    // 메소드 호출 : div(arr1)
	   int div = div(aa);                  //변수명과 메소드명은 같아도 사용법이 다르기 때문에 괜찮음
	   System.out.println("뺀값:" + div);	
	   
	   // 메소드 호출 : mul(arr1) 
	   long mul = mul(aa);                 //int범위를 넘으니 long으로
	   System.out.println("곱한값:" + mul);  //int : 1760012288	 
	                                       //long :4513787149822699520

	   // 메소드 호출 : avg(arr1)
	   double avg = avg(aa);
	   System.out.println("평균값:" + avg);		
		
	   
	   
	/* System.out.println("더한값: " + add(aa));
	   System.out.println("뺀값: " + div(aa));
	   System.out.println("더한값: " + mul(aa));
	   System.out.println("더한값: " + avg(aa));  */
		
	}

}
