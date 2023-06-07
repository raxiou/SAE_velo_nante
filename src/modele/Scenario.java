package modele;

public class Scenario {
    /**
     * fait un scenario des class Compteur Jour Quartier DataCompteurJour
     * et de leur interaction
     */
    public static void main(String[] args) {
        //creation des Jour
        Jour j1 = new Jour("2019-01-01", 2, 5.0, "non");
        Jour j2 = new Jour("2019-01-02", 3, 6.0, "non");

        //creation des Quartier
        Quartier q1 = new Quartier(1, "quartier1", 1.0);

        //creation des Compteur
        Compteur c1 = new Compteur(1, "libelle1 vers sens1", q1, 1.0, 1.0, "manuelle");

        //creation des DataCompteur
        DataCompteurJour dc1 = new DataCompteurJour(c1, j1);
        DataCompteurJour dc2 = new DataCompteurJour(c1, j2);  
        
        //affichage des DataCompteur
        System.out.println(dc1.toString());
        System.out.println(dc2.toString());

        //passage total le jour1 du compteur1
        System.out.println(dc1.totalPassage());
        //passage total le jour2 du compteur1
        System.out.println(dc2.totalPassage());

        //passage à 15h le jour1 du compteur1
        System.out.println(dc1.getNbVeloH15());

        //le nombre de passage a augmenter entre jour 1 et jour 2
        if(dc1.totalPassage() < dc2.totalPassage()){
            System.out.println("le nombre de passage a augmenter entre jour 1 et jour 2");
        } else if(dc1.totalPassage() > dc2.totalPassage()){
            System.out.println("le nombre de passage a diminuer entre jour 1 et jour 2");
        } else {
            System.out.println("le nombre de passage est rester le même entre jour 1 et jour 2");
        }

        //quelle est le quartier du compteur1
        System.out.println(c1.getLeQuartier().getNomQuartier());


    }
}
