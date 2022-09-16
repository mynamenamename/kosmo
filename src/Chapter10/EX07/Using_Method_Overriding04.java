package Chapter10.EX07;


// 15시 50분까지


class Animal {
	//자식 클래스에서 2개의 메소드를 오버 라이딩
	//Animal 타입으로 정의, 배열에 저장 후 오버라이딩 된 메소드 출력 (for, Enhanced for)
	
	
	void run() {
		System.out.println("모든 동물은 달린다.");
	}
	void eat() {
		System.out.println("모든 동물은 먹는다.");
	}
	
	void print () {
		System.out.println();
	}
	
	
}

class Tiger extends Animal {
	int count;              //호랑이 수
	//생성자 : 정수를 인풋받아서 count 필드에 값을 할당
	
    Tiger () {}
	
	Tiger (int count) {
		this.count=count;           //이거 함
	}
	
	
     @Override
    void run() {
    	System.out.println("호랑호랑");
    }
     @Override
    void eat() {
    	 System.out.println("호랑이는 냠냠");
    }
     
     @Override
    void print() {
    	 System.out.println("호랑이 수:" + count);      //<이건 내가 ㅋ
    }
     
}

class Egle extends Animal {
	int count;              //독수리 수
	
	
    Egle () {}
	
	Egle (int count) {
		this.count=count;
	}
	
	
	
	@Override
	void run() {
		System.out.println("이글이글");
	}
	@Override
	void eat() {
		System.out.println("독수리는 냠냠");
	}
	
	@Override
	void print() {
		 System.out.println("독수리 수:" + count);
	}
	
}

class Fish extends Animal {
	int count;              //물고기 수
	
	
    Fish () {}
	
    Fish (int count) {
		this.count=count;
	}
	
	@Override
	void run() {
		System.out.println("물고기물고기");
	}
	@Override
	void eat() {
		System.out.println("물고기는 냠냠");
	}
	
	@Override
	void print() {
		 System.out.println("물고기 수:" + count);
	}
	
}

class Dog extends Animal {
	int count;              //강아지 수
	
    Dog () {}
	
	Dog (int count) {
		this.count=count;
	}
	
	
	@Override
	void run() {
		System.out.println("강쥐강쥐");
	}
	@Override
	void eat() {
		System.out.println("강아지는 냠냠");
	}
	
	
	@Override
	void print() {
		 System.out.println("강아지 수:" + count);
	}
	
}


public class Using_Method_Overriding04 {

	public static void main(String[] args) {
		
	     // 객체 생성 (Animal 타입으로 생성)
		 // 생성자를 통해서 각각의 필드에 값을 할당
	    Animal a = new Animal ();
	    Animal t = new Tiger (10);
	    Animal e = new Egle (5);
	    Animal f = new Fish (50);
	    Animal d = new Dog (70);
	    
	    
	    // 객체를 배열에 저장
	    Animal [] arr2 = new Animal [] {a,t,e,f,d};
	    
	   //for문을 사용해서 출력 : eat(), run(), 동물의 총 마리수
	    
	    
	    //동물의 총 합을 구하는 변수 선언
	    int sum=0;
	    
	    
	    //1. FOR문을 사용해서 객체를 Animal 객체변수에 담는다.
	    for(int i=0; i < arr2.length ; i++) {
	     //배열의 각 방에 저장된 객체를 Animal 객체에 저장
	    	Animal aa1 = arr2[i];
	    	
	    //2. 다운캐스팅해서 자식필드의 count 값을 읽어서 모두 더한 값을 출력한다
		 
		
	    	aa1.run();              //Animal의 eat() 오버라이딩 된 메소드 호출 
	    	aa1.eat();              //Animal의 run() 오버라이딩 된 메소드 호출 
	        aa1.print();
	        //내가한 것
	        
	        if (aa1 instanceof Tiger) {
	        	Tiger t1 = (Tiger) aa1;
	        	sum+=t1.count;           //sum=sum+t1.count
	        }  
	        if (aa1 instanceof Egle) {
	        	Egle t1 = (Egle) aa1;
	        	sum+=t1.count;           //sum=sum+t1.count
	        } 
	        if (aa1 instanceof Fish) {
	        	Fish t1 = (Fish) aa1;
	        	sum+=t1.count;           //sum=sum+t1.count
	        } 
	        if (aa1 instanceof Dog) {
	        	Dog t1 = (Dog) aa1;
	        	sum+=t1.count;           //sum=sum+t1.count
	        } 
	        
	    }
	    System.out.println("총 동물의 수는 :" + sum);
	 
	    
	    
	    
	    
	}

}
