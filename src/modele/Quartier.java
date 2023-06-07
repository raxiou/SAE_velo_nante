package modele;
public class Quartier {
  
  private int id;
  private String nom;
  private double lgPiste;

  /**
   * Constructor of the class Quartier
   * @param id a positive integer representing the id of the district
   * @param nom a string representing the name of the district
   * @param lgPiste a double representing the length of the cycle path
   * @throws IllegalArgumentException if the parameters are not valid
   */
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

  /**
   * return the id of the district
   * @return the id of the district
   */
  public int getIdQuartier() {
    return this.id;
  }

  /**
   * return the name of the district
   * @return the name of the district
   */
  public String getNomQuartier() {
    return this.nom;
  }

  /**
   * return the length of the cycle path
   * @return the length of the cycle path
   */
  public double getLgPisteCyclable() {
    return this.lgPiste;
  }

  /**
   * set the id of the district
   * @param id a positive integer representing the id of the district
   */
  public void setIdQuartier(int id) {
    this.id = id;
  }

  /**
   * set the name of the district
   * @param nom a string representing the name of the district
   */
  public void setNomQuartier(String nom) {
    this.nom = nom;
  }

  /**
   * set the length of the cycle path
   * @param lgPiste a double representing the length of the cycle path
   */
  public void setLgPisteCyclable(double lgPiste) {
    this.lgPiste = lgPiste;
  }

  /**
   * return a string representing the district
   * @return a string representing the district
   */
  public String toString() {
    String ret = "Quartier n°" + this.id + " [ " + this.nom + " ] : la piste cyclable mesure " + this.lgPiste + " mètres.";
    return ret;
  }

  /**
   * return true if the district is equal to the district in parameter
   * @param q a district
   * @return true if the district is equal to the district in parameter
   */
  public boolean equal(Quartier q) {
    if(this == q) return true;
    else return false;
  }
}
