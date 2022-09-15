package Chapter10.EX01;

//12시 20분까지

class Fruit {        //과일 < 부모 클래스 >
	String name;     //과일 이름
	String color;    //과일 색깔
	int large;       //과일 크기

    void eat () {
    	System.out.println("모든 과일은 맛이 있다.");
    }
    
    void print () {
    	System.out.println(name + "," + color + "," + large);
    }
    
}

class Apple extends Fruit{        //사과 < 자식 클래스 >
	//자식 클래스만 가지는 필드1, 메소드1
	//쌤은 int applecount;
    int like;
    //쌤은 void show 
    void one () {
    	//쌤은 ("사과 갯수:" + applecount)
    	System.out.println(like + "만큼 사과는 맛있습니다.");
    }
}

class Orange extends Fruit {       //오렌지 < 자식 클래스 >
	//자식 클래스만 가지는 필드1, 메소드1
	int like2;
	void two () {
		System.out.println(like2 + "만큼 오렌지는 맛있습니다.");

	}
}

class Banana extends Fruit {       //바나나 < 자식 클래스 >
	//자식 클래스만 가지는 필드1, 메소드1
	int like3;
	void three() {
		System.out.println(like3 + "만큼 바나나는 맛있습니다.");
	}
}



public class Using_Inheritance02 {

	public static void main(String[] args) {
		System.out.println("==Fruit==");
		Fruit f = new Fruit ();
		f.name= "용과";
		f.color="분홍색";
		f.large= 3;
		f.print();
		f.eat();
   
       System.out.println("==Apple==");
       Apple a = new Apple ();
       a.name ="사과";
       a.color="빨간색";
       a.large=7;
       a.like=100;
       
       a.print();
       a.eat();
       a.one();
		
       System.out.println("==Orange==");
       Orange o = new Orange ();
       o.name ="오렌지";
       o.color="주황색";
       o.large=12;
       o.like2=50;
       
       o.print();
       o.eat();
       o.two();
       
       System.out.println("==Banana==");
       Banana b = new Banana ();
       b.name= "바나나";
       b.color ="노란색";
       b.large = 8;
       b.like3 = 10;
       
       b.print();
       b.eat();
       b.three();
       
       System.out.println("============");
       
       
       
	}

}
