package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement = new Equipement[2];
	private int nbEquipement=0;

	private String texte;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;

		assert force > 0 : "FORCE EST TOUJOURS POSITIVE";
	}


	private void sEquiper(Equipement equi) {
		//TODO CORRIGER
		switch(nbEquipement) {
		case 2:
			System.out.println("Le soldat "+ this.nom+" est déjà bien protégé !");
			break;
		case 1:
			System.out.println("two");
			if(equipement[0]==equi) {
				System.out.println("Le soldat "+ this.nom+" possède déjà un "+ equipement[0]+" !");
			}
			break;
		default:
			System.out.println("one");
			equipement[nbEquipement]=equi;
			nbEquipement++;
			System.out.println("Le soldat " +this.nom+" s’équipe avec un " + equi+".");
			break;
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

	//public void recevoirCoup(int forceCoup) {
	//	assert force > 0 : "FORCE D'UN ROMAIN EST TOUJOURS POSITIVE";
	//	force-=forceCoup;
	//	if (force>0) {
	//		parler("Aïe");
	//	} else {
	//		parler("J'abondonne...");
	//	}
	//	assert force > 0 : "FORCE D'UN ROMAIN EST TOUJOURS POSITIVE";
	//}

	private int calculResistanceEquipement(int forceCoup) {
		texte = "Ma force est  de " + this.force + ", et la force ducoup est de " + forceCoup;
		int resistanceEquipement = 0;
		if ((nbEquipement != 0)) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement;i++) {
				if ((equipement[i] != null && equipement[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}

			}
			texte +=resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement]; 
		System.out.println("L'équipement de " + nom.toString() + "s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {

			if (equipement[i] != null) {	
				equipementEjecte[nbEquipementEjecte] =equipement[i];
				nbEquipementEjecte++;
				equipement[i] = null;
			}
		}
		return equipementEjecte;
	}


//	public Equipement[] recevoirCoup(int forceCoup) {
//		Equipement[] equipementEjecte = null;
//		// précondition
//		assert force > 0;
//		int oldForce = force;
//		forceCoup = calculResistanceEquipement(forceCoup);
//		force -= forceCoup;
//		if (force > 0) {
//			parler("Aïe");
//		}else {
//			equipementEjecte = ejecterEquipement();
//			parler("J'abandonne...");
//		}
//		if(force==0) {
//
//			parler("Aïe");
//
//		}
//		else {
//			equipementEjecte = ejecterEquipement();
//			parler("J'abandonne...");
//
//		}
//
//		// post condition la force a diminuée
//		assert force < oldForce;
//		return equipementEjecte;
//
//	}
	
	 public Equipement[] recevoirCoup(int forceCoup) {
         Equipement[] equipementEjecte = null;
         // précondition
         assert force > 0;
         int oldForce = force;
         forceCoup = calculResistanceEquipement(forceCoup);
         force -= forceCoup;
         //if (force > 0) {
         //parler("Aïe");
         
	 //}else {
		// equipementEjecte = ejecterEquipement();
        // parler("J'abandonne...");
	// }
	  if(force==0) {

          parler("Aïe");
	  }
          else {
         equipementEjecte = ejecterEquipement();
         parler("J'abandonne...");
          }
    
    // post condition la force a diminuée
    assert force < oldForce;
    return equipementEjecte;
}
	public static void main(String[] args) {
		Romain Minus= new Romain("Minus",6);
		//	Minus.prendreParole();
		//	Minus.parler("Hello this is me");
		//	Minus.recevoirCoup(2);
		//


		Minus.sEquiper(Equipement.CASQUE);
		//System.out.println("nombre equi "+Minus.nbEquipement);
		Minus.sEquiper(Equipement.CASQUE);
		Minus.sEquiper(Equipement.BOUCLIER);
		Minus.sEquiper(Equipement.CASQUE);





	}

}
