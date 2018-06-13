package userdefineexception;

public class FeesPending extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double amount;
	public FeesPending(double amount){
		this.amount= amount;
		
	}
	public double getamount(){
		return(amount);
		
	}
}
