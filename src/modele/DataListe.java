package modele;

import modele.objectBddListe.*;

public class DataListe {
    ListeCompteur listeCompteur;
    ListeDataCompteurJour listeDataCompteurJour;
    ListeJour listeJour;
    ListeQuartier listeQuartier;

    public DataListe(ListeCompteur listeCompteur, ListeDataCompteurJour listeDataCompteurJour, ListeJour listeJour, ListeQuartier listeQuartier) {
        this.listeCompteur = listeCompteur;
        this.listeDataCompteurJour = listeDataCompteurJour;
        this.listeJour = listeJour;
        this.listeQuartier = listeQuartier;
    }

    public ListeCompteur getListeCompteur() {
        return listeCompteur;
    }

    public void setListeCompteur(ListeCompteur listeCompteur) {
        this.listeCompteur = listeCompteur;
    }

    public ListeDataCompteurJour getListeDataCompteurJour() {
        return listeDataCompteurJour;
    }

    public void setListeDataCompteurJour(ListeDataCompteurJour listeDataCompteurJour) {
        this.listeDataCompteurJour = listeDataCompteurJour;
    }

    public ListeJour getListeJour() {
        return listeJour;
    }

    public void setListeJour(ListeJour listeJour) {
        this.listeJour = listeJour;
    }

    public ListeQuartier getListeQuartier() {
        return listeQuartier;
    }

    public void setListeQuartier(ListeQuartier listeQuartier) {
        this.listeQuartier = listeQuartier;
    }

    

    
}
