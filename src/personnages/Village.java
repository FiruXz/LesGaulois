package personnages;

public class Village {
    private String nom;
    private Chef chef;
    private Gaulois[] villageois; 
    private int nbVillageoisMaximum;
    private int nbVillageois;      


    public Village(String nom, int nbVillageoisMaximum) {
        this.nom = nom;
        this.villageois = new Gaulois[nbVillageoisMaximum];
        this.nbVillageoisMaximum = nbVillageoisMaximum;
        this.nbVillageois = 0;              
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public String getNom() {
        return nom;
    }
    
    public void ajouterHabitant(Gaulois gaulois) {
        if (nbVillageois < this.nbVillageoisMaximum) {
            this.villageois[nbVillageois] = gaulois;
            nbVillageois++;                         
        } else {
            System.out.println("Nombre d'habitants max atteint au "+getNom());
        }
    }
    
    public Gaulois trouverHabitant(int numeroVillageois) {
    	if (numeroVillageois >= 0 && numeroVillageois < nbVillageois) {
            return villageois[numeroVillageois]; 
        } else {
            System.out.println("Numéro d'habitant invalide.");
            return null; 
        }
    	    	
    }
    
    public int getNbVillageois() {
        return nbVillageois;
    }
    public void afficherVillageois() {
    	if (chef != null) {
    		System.out.println("Chef du village : " + chef.getNom());
        } else {
            System.out.println("Aucun chef défini !");
    	}
    	 System.out.println("Villageois :");
         for (int i = 0; i < nbVillageois; i++) {
             Gaulois villageoisActuel = villageois[i];
             if (villageoisActuel != null) { // Éviter les null
                 System.out.println("- " + villageoisActuel.getNom());
             }
         }
     }
    
    public static void main(String [] args) {
    	Village village = new Village("Village des Irréductibles",30);
    	//Gaulois gaulois = village.trouverHabitant(30); //car il y a bien le nombres d'habitants max
    	Chef abraracourcix = new Chef("Abraracourcix", 6, village);
    	village.setChef(abraracourcix);
    	System.out.println("Le chef du village " + village.getNom() + " est " + abraracourcix.getNom());
    	Gaulois asterix = new Gaulois("Astérix",8);
    	Gaulois obelix = new Gaulois("Obélix",25);
    	village.ajouterHabitant(asterix);
    	village.ajouterHabitant(obelix);
    	//Gaulois gaulois = village.trouverHabitant(1); //Numero d'habitant invalide
    	//System.out.println(gaulois); //null
    	village.afficherVillageois();
    	
    }
}



