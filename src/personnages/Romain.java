package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement = new Equipement[2];
	private int nbEquipement=0;
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		
		assert force > 0 : "FORCE EST TOUJOURS POSITIVE";
	}
	
	private void sEquiper(Equipement equi) {
		switch(nbEquipement) {
		case 2:
			System.out.println("Le soldat "+ this.nom+" est déjà bien protégé !");
		
		case 1:
			if(equipement[nbEquipement]==equi)
			System.out.println("Le soldat "+ this.nom+" possède déjà un "+ equipement[1]+" !");
		
		default:
		
			equipement[nbEquipement]=equi;
			nbEquipement++;
			System.out.println("Le soldat " +this.nom+" s’équipe avec un " + equi+".");
		}
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
	assert force > 0 : "FORCE D'UN ROMAIN EST TOUJOURS POSITIVE";
	force-=forceCoup;
	if (force>0) {
		parler("Aïe");
	} else {
		parler("J'abondonne...");
	}
	assert force > 0 : "FORCE D'UN ROMAIN EST TOUJOURS POSITIVE";
}


public static void main(String[] args) {
	Romain Minus= new Romain("Minus",6);
//	Minus.prendreParole();
//	Minus.parler("Hello this is me");
//	Minus.recevoirCoup(2);

Minus.sEquiper(Equipement.CASQUE);
Minus.sEquiper(Equipement.CASQUE);
Minus.sEquiper(Equipement.BOUCLIER);
Minus.sEquiper(Equipement.CASQUE);

}

}
