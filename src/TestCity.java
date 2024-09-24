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

		toulouse.Display();
		bayonne.Display();
		biarritz.Display();
		dax.Display();
		tarbes.Display();
		xxx.Display();
		cupertino.Display();
		ls.Display();
		
		toulouse.populationSize += 20000;
		toulouse.Display();
	}
}
