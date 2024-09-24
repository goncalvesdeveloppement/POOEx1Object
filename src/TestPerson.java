
public class TestPerson {
	
	public static void main(String[] args) {
		Person toto = new Person("Gonçalves", "Anthony", 25, "1612 rue Rouge 40100 DAX");
		Person johnny = new Person("Hallyday", "Johnny", 99, "1970 allée Lefeu 65000 TARBES");
		Person tom = new Person("Cruise", "Tom", 65, "2 avenue de l'Impossible 31000 TOULOUSE");
		Person chuck = new Person("Norris", "Chuck", 25, "40100 DAX");
		Person santa = new Person("Claus", "Santa", 2024, "Pôle nord");
		Person steve = new Person("Jobs", "Steve", 80, "0941 Siri Avenue 66600 Cupertino, CA");
		Person bill = new Person("Gates", "Bill", 85, "9598 Window Street, 12321 Washington DC");
		Person elon = new Person("Musk", "Elon", 150, "9999 Neuralink Street, Everywhere");
		Person jean = new Person("Bonserrano", "Jean");
		Person paul = new Person("Emploi", "Paul");
		Person marie = new Person("Bambelle", "Marie", 28);
		Person gertrude = new Person("Bonpain", "Gertrude", "1960 rue Grognon, 75001 PARIS");
		Person inconnu = new Person();

		System.out.println(toto);
		System.out.println(johnny);
		System.out.println(chuck);
		System.out.println(jean);
		System.out.println(paul);
		System.out.println(marie);
		System.out.println(gertrude);
		System.out.println(inconnu);
		
		City biarritz = new City("Biarritz", "France", 18500);
		toto.setBirthCity(biarritz);
		
		System.out.println(toto);
	}
}
