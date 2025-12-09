package Day04.theory;

public class Toy {
	private String name;
	private String brand;
	private Integer minAge;
	
	public Toy(String name, String brand, Integer minAge) {
		this.name = name;
		this.brand = brand;
		this.minAge = minAge;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public Integer getMinAge() {
		return minAge;
	}
	
	public void setMinAge(Integer minAge) {
		this.minAge = minAge;
	}
}
