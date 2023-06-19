package modele.objectBddListe;

import java.util.ArrayList;

import modele.objectBdd.Jour;


public class ListeJour {
    private ArrayList<Jour> listeJour;

    public ListeJour() {
        this.listeJour = new ArrayList<Jour>();
    }

    public void ajouterJour(Jour jour) {
        this.listeJour.add(jour);
    }

    public ArrayList<Jour> getListeJour() {
        return this.listeJour;
    }

    public Jour chercheJour(String date) {
        Jour ret = null;
        for (Jour jour : this.listeJour) {
            if (jour.getDate().equals(date)) {
                ret = jour;
                break;
            }
        }
        if(ret == null){
            throw new IllegalArgumentException("La date n'existe pas");
        }
        return ret;
    }

}
