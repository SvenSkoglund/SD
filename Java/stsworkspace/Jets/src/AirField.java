
public class AirField {
	private Jet [] jets = new Jet[5];

	public AirField() {
	}

	public Jet[] getJets() {
		return jets;
	}

	public void setJets(Jet jet , int index) {
		this.jets[index] = jet;
	}
	public void resignJets (Jet [] jets) {
		this.jets = jets;
	}
	

}
