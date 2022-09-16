package Chapter10.EX06;

class Animal {
	//자식 클래스에서 2개의 메소드를 오버 라이딩
	//Animal 타입으로 정의, 배열에 저장 후 오버라이딩 된 메소드 출력 (for, Enhanced for)
	void run() {
		System.out.println("모든 동물은 달린다.");
	}
	void eat() {
		System.out.println("모든 동물은 먹는다.");
	}
}

class Tiger extends Animal {
     @Override
    void run() {
    	System.out.println("호랑호랑");
    }
     @Override
    void eat() {
    	 System.out.println("호랑이는 냠냠");
    }
}

class Egle extends Animal {
	@Override
	void run() {
		System.out.println("이글이글");
	}
	@Override
	void eat() {
		System.out.println("독수리는 냠냠");
	}
}

class Fish extends Animal {
	@Override
	void run() {
		System.out.println("물고기물고기");
	}
	@Override
	void eat() {
		System.out.println("물고기는 냠냠");
	}
}

class Dog extends Animal {
	@Override
	void run() {
		System.out.println("강쥐강쥐");
	}
	@Override
	void eat() {
		System.out.println("강아지는 냠냠");
	}
}




public class Using_Method_Overriding03 {
	public static void main(String[] args) {
		
	     // 객체 생성 (Animal 타입으로 생성)
	    Animal a = new Animal ();
	    Animal t = new Tiger ();
	    Animal e = new Egle ();
	    Animal f = new Fish ();
	    Animal d = new Dog ();
	    
	    // 직접 출력 - Animal의 메소드 호출
	    System.out.println("=== 직접출력 ===");
	    a.run();
	    a.eat();
	    t.run();
	    t.eat();
	    e.run();
	    e.eat();
	    f.run();
	    f.eat();
	    d.run();
	    d.eat();
	    
        // 배열에 객체를 저장: Animal 객체를 배열에 저장
		Animal [] arr = new Animal [] {a,t,e,f,d};
		
	    // for문 출력
		System.out.println("=== for문 ===");
		for (int i=0; i < arr.length ; i++) {
	//      선생님		
	//		Animal aa1 = arr[i];
	//      aa1.run();
	//      aa1.eat();		
			arr[i].run();      // Animal의 메소드 호출
			arr[i].eat();      // Animal의 메소드 호출
		}
		
		// Enhanced for문 출력
		System.out.println("=== Enhanced for문 ===");
		for (Animal k : arr) {
			k.run();           // Animal의 메소드 호출 : 오버라이딩 된 메소드 출력
			k.eat();           // Animal의 메소드 호출 : 오버라이딩 된 메소드 출력
		}
	}
}
