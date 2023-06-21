package modele.objectBddListe;

import java.util.ArrayList;

import modele.objectBdd.Compteur;
import modele.objectBdd.DataCompteurJour;
import modele.objectBdd.Jour;


public class ListeDataCompteurJour {
    ArrayList<DataCompteurJour> listeDataCompteurJour;

    public ListeDataCompteurJour(){
        this.listeDataCompteurJour = new ArrayList<DataCompteurJour>();
    }

    public ListeDataCompteurJour(ArrayList<DataCompteurJour> listeDataCompteurJour){
        this.listeDataCompteurJour = listeDataCompteurJour;
    }

    public void ajouterDataCompteurJour(DataCompteurJour dataCompteurJour){
        this.listeDataCompteurJour.add(dataCompteurJour);
    }

    public ArrayList<DataCompteurJour> getListeDataCompteurJour(){
        return this.listeDataCompteurJour;
    }

    public DataCompteurJour chercheDataCompteurJour(Compteur c, Jour j){
        DataCompteurJour ret = null;
        for (DataCompteurJour dataCompteurJour : this.listeDataCompteurJour) {
            if (dataCompteurJour.getCompteur().equals(c) && dataCompteurJour.getJour().equals(j)) {
                ret = dataCompteurJour;
                break;
            }
        }
        if(ret == null){
            throw new IllegalArgumentException("Le dataCompteurJour n'existe pas");
        }
        return ret;
    }

    public int totalMois(int numMois){
        int total = 0;
        for (DataCompteurJour dataCompteurJour : this.listeDataCompteurJour) {
            String[] parts = dataCompteurJour.getJour().getDate().split("-");
            int numMois2 = Integer.parseInt(parts[1]);
            if (numMois2 == numMois) {
                total += dataCompteurJour.totalPassage();
            }
        }
        return total;
    }
}
