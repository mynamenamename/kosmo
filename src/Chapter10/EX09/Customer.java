package Chapter10.EX09;

public class Customer {
	
	
	  int customerID;               //고객 ID
      String customername;          //고객 이름
      String customergrade;         //고객 등급(VIP,gold,silver)
      int bonuspoint;               //고객의 등급에 따라서 포인트 적립
      double bonusratio;            //물품 구매시 할인율
      
      Customer(){
    	  //필드의 기본값 할당을 메소드 호출로 적용
    	  initCustomer();           //this.initCustomer(), 자신객체의 메소드 호출
      }
	
      Customer(int customerID, String customername) {
    	  this.customerID=customerID;
    	  this.customername=customername;
      }
      
      
      
	  void initCustomer() {
		  this.customergrade = "silver";
		  this.bonusratio = 0.01;
	  }
	
	


}
