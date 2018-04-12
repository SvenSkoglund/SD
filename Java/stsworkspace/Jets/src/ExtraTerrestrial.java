
public class ExtraTerrestrial extends Jet implements CombatReady , CargoCarrier{

	public ExtraTerrestrial(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadCargo() {
		System.out.println(this.getModel() + ": Loading Space Cargo");		
	}

	@Override
	public void fight() {
		System.out.println(this.getModel() + ": --- Lazers armed ----");		
	}

}
