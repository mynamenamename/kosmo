package Chapter10.EX09;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleratio;
	
	VIPCustomer() {
		customergrade = "VIP";
		bonusratio = 0.05;
		bonuspoint = 10;
		
	}
	VIPCustomer(int customerID, String customername, int agentID) {
		super(customerID, customername);
		customergrade = "VIP";
		bonusratio = 0.05;
		bonuspoint = 10;
		
	}

}
