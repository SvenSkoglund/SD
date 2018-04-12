
public abstract class Jet {

	private String model;
	private double speed;
	private int range;
	private long price;
	private String Description;
	
	
	public Jet(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
	public void fly() {
		System.out.println(model +": Ready for takeoff. Will take " + (range/speed) + " hours to reach max range");
	}
	public double getSpeedInMach() {
		double mach = speed * .0013;
		return mach;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	@Override
	public String toString() {
		return "Model: " + model + ", Speed: " + speed + ", Range: " + range + ", Price: " + price ;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	
}
