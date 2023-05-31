package modele;
public class Quartier {

  private int id;
  private String nom;
  private double lgPiste;

  public Quartier(int id, String nom, double lgPiste) {
    if (id <= 0) {
      throw new IllegalArgumentException("L'ID du quartier doit être strictement positif");
    }
    if((nom == null) || (nom.equals(""))) {
      throw new IllegalArgumentException("Le nom du quartier ne peut pas être null ou vide");
    }
    if(lgPiste <= 0) {
      throw new IllegalArgumentException("La longueur de la piste cyclable ne peut pas être null ou négative");
    }
    this.id = id;
    this.nom = nom;
    this.lgPiste = lgPiste;
  }

  public int getIdQuartier() {
    return this.id;
  }

  public String getNomQuartier() {
    return this.nom;
  }

  public double getLgPisteCyclable() {
    return this.lgPiste;
  }

  public void setIdQuartier(int id) {
    this.id = id;
  }

  public void setNomQuartier(String nom) {
    this.nom = nom;
  }

  public void setLgPisteCyclable(double lgPiste) {
    this.lgPiste = lgPiste;
  }

  public String toString() {
    String ret = "Quartier n°" + this.id + " [ " + this.nom + " ] : la piste cyclable mesure " + this.lgPiste + " mètres.";
    return ret;
  }

  public boolean equal(Quartier q) {
    if(this == q) return true;
    else return false;
  }
}
