/**
 * First attempt at an automated negotiation agent.
 * 
 * @author Kaitlyn
 * version 6.26.2017
 */
public class Agent {
	//Variables.  Visibility to be decided.
	public static final int ACCEPTED = 1;
	public static final int DENIED = 0;
	public static final int END_NEGOTIATIONS = -1;
	double timeAllowed;
	double currentTime;
	OpponentModel opponent = new OpponentModel();
	
	/**
	 * Concession method to determine what action to take regarding an offer made.
	 * Return 1 for accept, 0 for reject, and -1 for close negotiations.
	 * 
	 * @return
	 */
	protected int concessionStrategy(){
		
		while (currentTime < timeAllowed){
			//TODO
			
			//if new phase
				//update understanding of opponent
				//predict their offer
				opponent.predictedOffer();
				//decide optimal utility to bid
				generateOffer();
				//offer
					//if accepted
						//end negotiations
					//else
						//allow counter
						//process counter
							//if optimal, accept (return 1)
							//if not, deny (return 0)
			//update current time	
		}
		//no agreement reached (return -1)
		return END_NEGOTIATIONS;
	}
	
	/**
	 * Generate an appropriate offer.
	 * 
	 * @return
	 */
	private double generateOffer(){
		//TODO
		
		//keep in mind all other bids
		//reference what is known
		//create offer
		return 0;
	}
}
