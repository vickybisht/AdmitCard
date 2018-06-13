package driver;

import userdefineexception.FeesPending;
import util.AllotAdmitCard;

public class Exception2 {

	public static void main(String[] args) {
		try{
			System.out.println("student balance is less than 1000");
			
		AllotAdmitCard c = new AllotAdmitCard(101);
		c.setbalance(2000);
		
	System.out.println("enter the student balance greater than 1000");
		c.setbalance(2000);
		AllotAdmitCard b = new AllotAdmitCard(102);
		b.setbalance(2000);
		}catch(FeesPending e){
			System.out.println("admit card is not alloted ,your pending balance is"+e.getamount());
		}
	}

}
