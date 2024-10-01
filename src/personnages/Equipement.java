package personnages;

public enum Equipement {
    CASQUE("Casque de guerre"),
    BOUCLIER("Bouclier en bois");

    private String nom;

    // Constructeur
    Equipement(String nom) {
        this.nom = nom;
    }

    // M�thode pour obtenir le nom
    public String getNom() {
        return nom;
    }
}
