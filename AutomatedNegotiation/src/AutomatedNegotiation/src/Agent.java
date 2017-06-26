/**
 * First attempt at an automated negotiation agent.
 * 
 * @author Kaitlyn Hennessy
 * version 6.23.2017
 */
public class Agent {
	//Variables.  Visibility to be decided.
	double timeAllowed;
	double currentTime;
	
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
				//decide optimal utility to bid
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
		return -1;
	}
	
	/**
	 * Generate an appropriate offer.
	 * 
	 * @return
	 */
	private int generateOffer(){
		//TODO
		
		//keep in mind all other bids
		//reference what is known
		//create offer
		return 0;
	}
}
