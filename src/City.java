// Represents a city whereever in the world.
public class City {
	private String name;
	private String country;
	private int populationSize;
	
	private static int instancesCount = 0;
	
	private static final String UNKNOWN_DEFAULT_NAME = "<unknown>";
	private static final String UNKNOWN_DEFAULT_COUNTRY_NAME = "<unknownCountry>";
	private static final int UNKNOWN_DEFAULT_POPULATION_SIZE = 0;
	
	public City() {
		this(UNKNOWN_DEFAULT_NAME, UNKNOWN_DEFAULT_COUNTRY_NAME, UNKNOWN_DEFAULT_POPULATION_SIZE);
	}
	
	public City(String name, String country) {
		this(name, country, UNKNOWN_DEFAULT_POPULATION_SIZE);
	}
	
	public City(String name, int populationSize) {
		this(name, UNKNOWN_DEFAULT_COUNTRY_NAME, populationSize);
	}
	
	public City(String name, String country, int populationSize) {
		this.setName(name);
		this.setCountry(country);
		this.setPopulationSize(populationSize);
		instancesCount++;
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
	
	public String toString() {
		return this != null ? "City [name = " + this.getName() + "][country = " + this.getCountry() + "][populationSize = " + this.getPopulationSize() + "]" : "null";
	}
	
	// Displays info about a specific city.
	public void display() {
		System.out.println(this);
	}
	
	public static int count() {
		return getInstancesCount();
	}

	public static int getInstancesCount() {
		return instancesCount;
	}

	public void setInstancesCount(int instancesCount) {
		this.instancesCount = instancesCount;
	}
}
