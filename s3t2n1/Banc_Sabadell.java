package s3t2n1;

public class Banc_Sabadell extends Agencies {
	
	public Banc_Sabadell(Agent agent) {
		this.agent = agent;
		this.agent.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Banc Sabadell ha estat informat del canvi");
	}
}
