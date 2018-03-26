package exceptions;

public interface Account {
	public default String getID() {
		return "0000";
	}
	
}
interface PremiumAccount extends Account{
	 default String getName() ;
}
