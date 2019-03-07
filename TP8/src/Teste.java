
public class Teste {

	public static void main(String[] args) {
		Ville V1 = new Ville("Toulouse","France",899765);
		Ville V2 = new Ville("MAdrid","espagne",655544);
		Ville V3 = new Ville("Londre","Gb",76666);
		V1.display();
		V2.display();
		V3.display();
		
		Personne t1 = new Personne("Jean", "BERNARD",43);
		Personne t2 = new Personne("mickael", "De La Rue",56);
		t1.display();
		t2.display();
		
	}
}
