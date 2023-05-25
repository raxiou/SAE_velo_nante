/**
 * Compteur
 */
public class Compteur {
    private int idCompteur;
    private String libelle;
    private String sens;
    private int leQuartier;
    private double latitude;
    private double longitude;
    private String observation;

    /**
     * the constructor of Compteur, check the validity of the parameters
     * @param idCompteur a positive integer
     * @param libelleComplet a non-null string representing the name and direction of the compteur
     * @param leQuartier a non-null string representing the name of the quartier
     * @param latitude a double between -90 and 90 representing the latitude of the compteur
     * @param longitude a double between -180 and 180 representing the longitude of the compteur
     * @param observation a string representing the observation of the compteur
     */
    public Compteur(int idCompteur, String libelleComplet, int quartier, double latitude, double longitude, String observation) {
        if (idCompteur < 0) {
            throw new IllegalArgumentException("idCompteur must be positive");
        }
        if (libelleComplet == null) {
            throw new IllegalArgumentException("libelle must not be null");
        }
        if (latitude < -90 || latitude > 90) {
            throw new IllegalArgumentException("latitude must be between -90 and 90");
        }
        if (longitude < -180 || longitude > 180) {
            throw new IllegalArgumentException("longitude must be between -180 and 180");
        }
        if (observation == null) {
            throw new IllegalArgumentException("observation must not be null");
        }
        if (quartier < 0) {
            throw new IllegalArgumentException("quartier must be positive");
        }
        separate(libelleComplet);
        this.idCompteur = idCompteur;
        this.leQuartier = quartier;
        this.latitude = latitude;
        this.longitude = longitude;
        this.observation = observation;
    }

    /**
     * the getter of idCompteur
     * @return a int idCompteur
     */
    public int getIdCompteur() {
        return idCompteur;
    }

    /**
     * the getter of libelle
     * @return a String libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * the getter of sens
     * @return a String sens
     */
    public String getSens() {
        return sens;
    }

    /**
     * the getter of latitude
     * @return a double latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * the getter of longitude
     * @return a double longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * the getter of observation
     * @return a String observation
     */
    public String getObservation() {
        return observation;
    }

    /**
     * the setter of idCompteur
     * @param idCompteur a positive integer
     */
    public void setIdCompteur(int idCompteur) {
        if (idCompteur < 0) {
            throw new IllegalArgumentException("idCompteur must be positive");
        }
        this.idCompteur = idCompteur;
    }

    /**
     * the setter of libelle
     * @param libelle a non-null string representing the name of the compteur
     */
    public void setLibelle(String libelle) {
        if (libelle == null) {
            throw new IllegalArgumentException("libelle must not be null");
        }
        this.libelle = libelle;
    }

    /**
     * the setter of sens
     * @param sens a non-null string representing the direction of the compteur
     */
    public void setSens(String sens) {
        if (sens == null) {
            throw new IllegalArgumentException("sens must not be null");
        }
        this.sens = sens;
    }

    /**
     * the setter of latitude
     * @param latitude a double between -90 and 90 representing the latitude of the compteur
     */
    public void setLatitude(double latitude) {
        if (latitude < -90 || latitude > 90) {
            throw new IllegalArgumentException("latitude must be between -90 and 90");
        }
        this.latitude = latitude;
    }

    /**
     * the setter of longitude
     * @param longitude a double between -180 and 180 representing the longitude of the compteur
     */
    public void setLongitude(double longitude) {
        if (longitude < -180 || longitude > 180) {
            throw new IllegalArgumentException("longitude must be between -180 and 180");
        }
        this.longitude = longitude;
    }

    /**
     * the setter of observation
     * @param observation a non-null string representing the observation of the compteur
     */
    public void setObservation(String observation) {
        if (observation == null) {
            throw new IllegalArgumentException("observation must not be null");
        }
        this.observation = observation;
    }
    /**
     * the toString method of Compteur
     * @return a String representing the Compteur
     */
    @Override
    public String toString() {
        return "Compteur{" +
                "idCompteur=" + idCompteur +
                ", libelle='" + libelle + '\'' +
                ", sens='" + sens + '\'' +
                ", leQuartier=" + leQuartier +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }

    /**
     * the equals method of Compteur
     * @param o an object
     * @return a boolean representing if the object is equal to the Compteur
     */
    @Override
    public boolean equals(Object o) {
        boolean ret = true;
        if (this == o) {
            ret = true;
        } else if (!(o instanceof Compteur)) {
            ret = false;
        } else {
            Compteur compteur = (Compteur) o;
    
            if (this.idCompteur != compteur.idCompteur ||
                    Double.compare(compteur.latitude, this.latitude) != 0 ||
                    Double.compare(compteur.longitude, this.longitude) != 0 ||
                    !this.libelle.equals(compteur.libelle) ||
                    !this.sens.equals(compteur.sens) ||
                    this.leQuartier != compteur.leQuartier) {
                ret = false;
            }
        }
        return ret;
    }

    private void separate (String libelleComplet){
        String[] parts = libelleComplet.split(" vers ");
        if (parts.length == 2) {
            String part1 = parts[0].trim();
            String part2 = parts[1].trim();
            this.libelle = part1;
            this.sens = part2;
        } else {
            System.out.println("La chaîne n'est pas au bon format.");
        }

    }
    
    
}