package personnages;

public class Chef {
	private String nom;
	private int force;
	private int effetPotion=1;
	private Village Village;
	public Chef() {
		
	}
	public Chef(String nom, int force, Village village) {

		this.nom = nom;
		this.force = force;
		this.effetPotion = effetPotion;
		this.Village = village;
	}

}
