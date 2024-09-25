
public class Person {

	private String lastName;
	private String firstName;
	private int age;
	private String address;
	private City homeCity;
	private City birthCity;

	private static final String UNKNOWN_LASTNAME = "<unknown last name>";
	private static final String UNKNOWN_FIRSTNAME = "<unknown first name>";
	private static final int MINIMUM_AGE = 0;
	private static final String UNKNOWN_ADDRESS = "<unknown address>";

	public Person() {
		this(UNKNOWN_LASTNAME);
	}

	public Person(String nom) {
		this(nom, UNKNOWN_FIRSTNAME);
	}

	public Person(String nom, String prenom) {
		this(nom, prenom, MINIMUM_AGE);
	}

	public Person(String nom, String prenom, int age) {
		this(nom, prenom, age, UNKNOWN_ADDRESS);
	}

	public Person(String nom, String prenom, String adresse) {
		this(nom, prenom, MINIMUM_AGE, adresse);
	}

	public Person(String nom, String prenom, int age, String adresse) {
		this(nom, prenom, age, adresse, new City(), new City());
	}

	public Person(String nom, String prenom, int age, String adresse, City homeCity) {
		this(nom, prenom, age, adresse, homeCity, new City());
	}

	public Person(String nom, String prenom, int age, String adresse, City homeCity, City birthCity) {
		this.setLastName(nom);
		this.setFirstName(prenom);
		this.setAge(age);
		this.setAddress(adresse);
		this.setHomeCity(homeCity);
		this.setBirthCity(birthCity);
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String nom) {
		this.lastName = nom;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String prenom) {
		this.firstName = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0)
			throw new RuntimeException("L'âge ne doit pas être négatif...");
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String adresse) {
		this.address = adresse;
	}

	public City getHomeCity() {
		return homeCity;
	}

	public void setHomeCity(City homeCity) {
		this.homeCity = homeCity;
	}

	public City getBirthCity() {
		return birthCity;
	}

	public void setBirthCity(City birthCity) {
		this.birthCity = birthCity;
	}

	public String toString() {
		return this.getLastName() + ", " + this.getFirstName() + ", " + this.getAge() + " ans, habitant "
				+ (this.getAddress() != "" ? this.getAddress() + " à " : "") + this.getHomeCity().getName()
				+ ", Ville de naissance : " + this.getBirthCity().getName() + ", " + this.getBirthCity().getCountry() + (this.getBirthCity().getPopulationSize() > 0 ? ", population " + this.getBirthCity().getName() + " " + this.getBirthCity().getPopulationSize() + " habitants" : "");
	}
}
