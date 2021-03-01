package superkeyword;

public class Chair extends Table{
	
	public Chair() {}
	
	public void sitDown() {
		super.fourLegs();
	}
	
	public Chair(String brandName) {
		super(brandName);
	}

}
