package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;
	
	public Gaulois(String nom, int force) {

		
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+"<< " + texte + ">>");

	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";

	}

	public void frapper(Romain romain) {
	System.out.println(nom + "envoie un grand coup dans la mâchoire de  " + romain.getNom());
	romain.recevoirCoup((force/3)*effetPotion);
	}
	
	@Override
	public String toString() {
		
		return "Gauloir [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
		
	}
	
	public void boirePotion(int forcePotion) {//TODO quelle doit être la visibilité de cette fonction
		effetPotion=forcePotion;
		parler("Merci Druide, je sens que ma force est "+forcePotion+ " fois décuplée.");
	}
	
	

	
	public static void main(String[] args) {
		
		Gaulois asterix = new Gaulois("Asterix",8); 
		System.out.println(asterix);
		asterix.prendreParole();
		asterix.parler("hello");
		Romain romain= new Romain("Roro",8);
		asterix.frapper(romain);
		asterix.boirePotion(5);
	}
	
	


	
}
