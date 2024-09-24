import java.util.Iterator;

public class TestCity {

	public static void main(String[] args) {
		City toulouse = new City("Toulouse", "France");
		City bayonne = new City("Bayonne", "France", 25000);
		City biarritz = new City("Biarritz", "France", 18500);
		City dax = new City("Dax", "France", 9999);
		City tarbes = new City("Tarbes", "France", 1);
		City cupertino = new City("Cupertino", "USA");
		City ls = new City("Los Santos", "USA", 2147483647);
		City xxx = new City();

		toulouse.display();
		bayonne.display();
		biarritz.display();
		dax.display();
		tarbes.display();
		xxx.display();
		cupertino.display();
		ls.display();

		// toulouse.setPopulationSize(-20000); // erreur
		dax.setPopulationSize(40100);
		dax.display();
		
		// tarbes.addToPopulationSize(-2); // erreur
		tarbes.addToPopulationSize(-1);
		tarbes.display();
		
		biarritz.addToPopulationSize(10000);
		biarritz.display();
		
		biarritz.setPopulationSize(biarritz.getPopulationSize() - 10000);
		biarritz.display();
		
		toulouse.addToPopulationSize(10000);
		toulouse.display();
	}
}
