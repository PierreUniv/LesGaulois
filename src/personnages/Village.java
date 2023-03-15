package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois=0;
	private int nbVillageoisMaximum;
	
	private Gaulois[] villageois;
	
	public Village(String nom,int nbVillageoisMaximum) {
		this.nbVillageoisMaximum=nbVillageoisMaximum;
		this.nom = nom;
		this.villageois= new Gaulois[nbVillageoisMaximum];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	

	private Gaulois trouverHabitant(int numVillgeois) {
		return villageois[numVillgeois];
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		if(nbVillageois<nbVillageoisMaximum) {
			villageois[nbVillageois]=gaulois;
			nbVillageois++;
		}
	}
	public void afficherVillageois() {
		System.out.println("Dans village du chef "+ chef.getNom() + " vivent les légendaires gaulois");
		for(int i=0; i<nbVillageois;i++) {
			Gaulois gaulois=villageois[i];
			System.out.println("-"+gaulois.getNom());
		}
	}
	public static void main(String[] args) {
		Village village= new Village("Village des Irréductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);		
		/*Exception in thread "main" java.lang.NullPointerException: Cannot load from object array because "this.villageois" is null
			at LesGaulois/personnages.Village.trouverHabitant(Village.java:27)
			at LesGaulois/personnages.Village.main(Village.java:33)
			
			on obtient cette exception car il y a aucun habitant eet l'habitant 30 n'existe pas*/
		
		Chef chef= new Chef("Abraracourcix",6,village);
		Gaulois Asterix= new Gaulois("Asterix",8);
		village.setChef(chef);
		village.ajouterHabitant(Asterix);
		Gaulois Obelix= new Gaulois("Obélix",6);
		village.ajouterHabitant(Obelix);

//		Gaulois gaulois = village.trouverHabitant(0);
//		System.out.println(gaulois);
		
		village.afficherVillageois();
		
	}
	
}
