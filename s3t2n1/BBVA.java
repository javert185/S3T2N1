package s3t2n1;

public class BBVA extends Agencies {
	
	public BBVA(Agent agent) {
		this.agent = agent;
		this.agent.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("BBVA ha estat informat del canvi");
	}
}