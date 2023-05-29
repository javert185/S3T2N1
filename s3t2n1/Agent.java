package s3t2n1;
import java.util.ArrayList;
import java.util.List;

public class Agent {
	
	//Creem una llista on aniran les agencies notificades
	private List<Agencies> agencies = new ArrayList<Agencies>();
	private String estat;
	
	//Cada cop que es canvia l'estat s'avisen a les agències
	public void setEstat(String estat) {
		this.estat = estat;
		notificarAgencies();
	}
	
	//Afegim les agències per avisar-les
	public void attach(Agencies agencia) {
		agencies.add(agencia);
	}
	
	//Recorrem tota la llista on estan ficades les agencies
	public void notificarAgencies() {
		for (Agencies agencia: agencies) {
			agencia.update();
		}
	}
}
