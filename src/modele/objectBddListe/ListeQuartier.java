package modele.objectBddListe;

import java.util.ArrayList;

import modele.objectBdd.Quartier;

public class ListeQuartier {
    private ArrayList<Quartier> ListeQuartier;

    public ListeQuartier() {
        this.ListeQuartier = new ArrayList<Quartier>();
    }

    public void ajouterQuartier(Quartier quartier) {
        this.ListeQuartier.add(quartier);
    }

    public ArrayList<Quartier> getListeQuartier() {
        return this.ListeQuartier;
    }

    public Quartier chercheQuartier(int id) {
        Quartier ret = null;
        for (Quartier quartier : this.ListeQuartier) {
            if (quartier.getIdQuartier() == id) {
                ret = quartier;
                break;
            }
        }
        if(ret == null){
            throw new IllegalArgumentException("Le quartier n'existe pas");
        }
        return ret;
    }

}
