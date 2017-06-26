/**
 * Characteristics of a bid compiled into a class.
 * 
 * @author Kaitlyn
 * version 6.26.2017
 */
public class Bid {
	double latestUtilOffer;
	double utilityCounterOffer;
	
	/**
	 * Constructor.
	 * Takes in the latest offer made.
	 * 
	 * @param latestUtilOffer
	 * 	 */
	public Bid(double latestUtilOffer){
		this.latestUtilOffer = latestUtilOffer;
	}
	
	/**
	 * Getter for the latestUtilOffer.
	 * 
	 * @return
	 */
	public double getLatestUtilOffer(){
		//TODO
		return latestUtilOffer;
		
	}
	
	/**
	 * Getter for the utilityCounterOffer.
	 * 
	 * @return
	 */
	public double getUtilityCounterOffer(){
		//TODO
		return utilityCounterOffer;
	}
}
