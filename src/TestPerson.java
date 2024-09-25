import java.util.ArrayList;
import java.util.stream.Collectors;

public class TestPerson {
	
	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<Person>();
		City paris = new City("Paris", "France");
		City amiens = new City("Amiens", "France");
		City london = new City("London", "England");
		City nyc = new City("New York", "USA");
		City moscou = new City("Moscou", "Russia");
		City chateauroux = new City("Châteauroux", "France");
		City louisville = new City("Louisville", "USA");
		City ih = new City("Indian Hills", "USA");

		paris.setPopulationSize(2000000);

		people.add(new Person("Macron", "Emmanuel", 43, "L'Élysée", paris, amiens));
		people.add(new Person("Sarkozy", "Nicolas", 66, "", paris, paris));
		people.add(new Person("Johnson", "Boris", 56, "Downing Street", london, nyc));
		people.add(new Person("Depardieu", "Gérard", 72, "", moscou, chateauroux));
		people.add(new Person("Kravitz", "Lenny", 56, "Hôtel particulier", paris, nyc));
		people.add(new Person("Lawrence", "Jennifer", 30, "", louisville, ih));

		people.forEach(person -> System.out.println(person));
		System.out.println("----------\nListe après notre filtre :");
		people = (ArrayList<Person>) (people.stream().filter(person -> (person.getBirthCity().getCountry().equals("France") || person.getHomeCity() == paris))).collect(Collectors.toList());
		people.forEach(person -> System.out.println(person));
	}
}
