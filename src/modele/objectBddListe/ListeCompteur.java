package modele.objectBddListe;

import java.util.ArrayList;

import modele.objectBdd.Compteur;

public class ListeCompteur {
    ArrayList<Compteur> listeCompteur;
    
    public ListeCompteur(){
        this.listeCompteur = new ArrayList<Compteur>();
    }

    public void ajouterCompteur(Compteur compteur){
        this.listeCompteur.add(compteur);
    }

    public ArrayList<Compteur> getListeCompteur(){
        return this.listeCompteur;
    }

    public Compteur chercheCompteur(int id){
        Compteur ret = null;
        for (Compteur compteur : this.listeCompteur) {
            if (compteur.getIdCompteur() == id) {
                ret = compteur;
                break;
            }
        }
        if(ret == null){
            throw new IllegalArgumentException("Le compteur n'existe pas");
        }
        return ret;
    }
}
