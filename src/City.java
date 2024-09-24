// Represents a city whereever in the world.
public class City {
	private String name;
	private String country;
	private int populationSize;
	
	private final String unknownDefaultName = "Saint-Anonyme-sur-Masque";
	private final String unknownDefaultCountryName = "NordVPN";
	private final int unknownPopulationDefaultSize = 0;
	
	public City() {
		this.setName(unknownDefaultName);
		this.setCountry(unknownDefaultCountryName);
		this.setPopulationSize(unknownPopulationDefaultSize);
	}
	
	public City(String name, String country) {
		this.setName(name);
		this.setCountry(country);
		this.setPopulationSize(unknownPopulationDefaultSize);
	}
	
	public City(String name, String country, int populationSize) {
		this.setName(name);
		this.setCountry(country);
		this.setPopulationSize(populationSize);
	}
	
	// Displays info about a specific city.
	public void display() {
		System.out.println(this.getName() + ", " + this.getCountry() + " — " + this.getPopulationSize() + " habitants");
	}

	// Accessors
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPopulationSize() {
		return populationSize;
	}

	public void setPopulationSize(int populationSize) {
		if (populationSize < 0)
			throw new RuntimeException("La population en nombre d'habitants ne peut pas être négative...");
		this.populationSize = populationSize;
	}

	public void addToPopulationSize(int populationIncrement) {
		this.setPopulationSize(this.getPopulationSize() + populationIncrement);
	}
}
