package s3t2n1;

public class Main {

	public static void main(String[] args) {
		
		//Creem una instancia de l'agent
		Agent agent = new Agent();
		
		//Creem instàncies dels observadors
		new Banc_Sabadell(agent);
		new BBVA(agent);
		
		//Simulem un canvi de borsa		
		System.out.println("Canvi de borsa:");
		agent.setEstat("La borsa ha baixat");
		
		System.out.println("Canvi de borsa:");
		agent.setEstat("La borsa ha pujat");
	}
}