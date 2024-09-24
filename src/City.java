
public class City {
	public String name;
	public String country;
	public int populationSize;
	
	private final int unknownPopulationDefaultSize = 0;
	
	public City() {
		this.name = "Saint-Anonyme-sur-Masque";
		this.country = "NordVPN";
		this.populationSize = unknownPopulationDefaultSize;
	}
	
	public City(String name, String country) {
		this.name = name;
		this.country = country;
		this.populationSize = unknownPopulationDefaultSize;
	}
	
	public City(String name, String country, int populationSize) {
		this.name = name;
		this.country = country;
		this.populationSize = populationSize;
	}
	
	public void Display() {
		System.out.println(this.name + ", " + this.country + " — " + this.populationSize + " habitants");
	}
}
