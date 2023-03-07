package personnages;

public class Romain {
	private String nom;
	private int force;
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
public void parler(String texte) {
	System.out.println(prendreParole()+ "<<" + texte + ">>");

}
private String prendreParole() {
	return "Le romain " + nom + " : ";
	
}

public void recevoirCoup(int forceCoup) {
	force-=forceCoup;
	if (force>0) {
		parler("Aïe");
	} else {
		parler("J'abondonne...");
	}

}
public static void main(String[] args) {
	Romain romi= new Romain("Romi",10);
	romi.prendreParole();
	romi.parler("Hello this is me");
	romi.recevoirCoup(2);

}

}
