package util;
import userdefineexception.*;
public class AllotAdmitCard {
	private int number;
	protected double balance ;
	public void setbalance(double amount){
		this.balance=amount;
		
	}
	public AllotAdmitCard(double balance)throws FeesPending{
		if(balance<1000){
			System.out.println("balance is less than 1000,admit card is alloted");
		}
		else{
			double need = balance;
			System.out.println("1");
			throw new FeesPending(need);
		}
	}
	
}
