package superkeyword;

public class Table {
	
	public String brandName;
	
	public Table() {}
	
	public Table(String brandName) {
		this.brandName = brandName;
		System.out.println(brandName);
	}
	
	public void fourLegs() {
		System.out.println("This piece of furniture has 4 legs");
	}

}
