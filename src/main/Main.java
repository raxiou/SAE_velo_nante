package main;
import java.sql.*;

import javax.swing.SwingUtilities;

import modele.DataListe;
import modele.objectBdd.Compteur;
import modele.objectBdd.DataCompteurJour;
import modele.objectBdd.Jour;
import modele.objectBdd.Quartier;
import modele.objectBddListe.ListeCompteur;
import modele.objectBddListe.ListeDataCompteurJour;
import modele.objectBddListe.ListeJour;
import modele.objectBddListe.ListeQuartier;
import vue.PremierePage;


public class Main {

    public static void main(String[] args) {
        ListeJour listeJour = new ListeJour();
        ListeQuartier ListeQuartier = new ListeQuartier();
        ListeCompteur ListeCompteur = new ListeCompteur();
        ListeDataCompteurJour ListeDataCompteurJour = new ListeDataCompteurJour();
        String url = "jdbc:mysql://localhost:3306/bd_velo_nantes";
        String username = "root";
        String password = "Esteban3007";

        try {
            // Charger le pilote JDBC MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Établir la connexion à la base de données
            Connection conn = DriverManager.getConnection(url, username, password);
            
            // Créer l'objet Statement
            Statement stmt = conn.createStatement();


            // table jour
            // Créer la requête SQL
            String query = "SELECT * FROM jour";

            // Exécuter la requête SQL
            ResultSet rs = stmt.executeQuery(query);

            // Parcourir les résultats
            while (rs.next()) {
                // Récupérer les valeurs des colonnes
                String jour = rs.getString("jour");
                double temp = rs.getDouble("temperature");
                int numJour = rs.getInt("numero_du_jour");
                String vacances = rs.getString("vacances");


                // Faire quelque chose avec les données récupérées
                Jour j = new Jour(jour, numJour, temp, vacances);
                listeJour.ajouterJour(j);
            }

            // Fermer la requete
            rs.close();



            //table quartier
            // Créer la requête SQL
            query = "SELECT * FROM quartier";

            //Exécuter la requête SQL
            rs = stmt.executeQuery(query);

            // Parcourir les résultats
            while (rs.next()) {
                // Récupérer les valeurs des colonnes
                int id_quartier = rs.getInt("id_quartier");
                String nom_quartier = rs.getString("nom_quartier");
                int longueur_piste = rs.getInt("longueur_piste");



                // Faire quelque chose avec les données récupérées
                Quartier q = new Quartier(id_quartier, nom_quartier, longueur_piste);
                ListeQuartier.ajouterQuartier(q);
                

            }

            // Fermer la requete
            rs.close();



            //table compteur
            // Créer la requête SQL
            query = "SELECT * FROM compteur";

            //Exécuter la requête SQL
            rs = stmt.executeQuery(query);

            // Parcourir les résultats
            while (rs.next()) {
                // Récupérer les valeurs des colonnes
                int id_compteur = rs.getInt("boucle_num");
                String libelle = rs.getString("libelle");
                int id_quartier = rs.getInt("le_quartier");
                double latitude = rs.getDouble("latitude");
                double longitude = rs.getDouble("longitude");
                String observation = rs.getString("observation");

                // Faire quelque chose avec les données récupérées
                Quartier q = null;
                if(id_quartier != 0){
                    q = ListeQuartier.chercheQuartier(id_quartier);
                }
                String observation2 = null;
                if(observation.equals("null")){
                    observation2 = null;
                } else {
                    observation2 = observation;
                }
                Compteur c = new Compteur(id_compteur, libelle, q, latitude, longitude, observation2);
                ListeCompteur.ajouterCompteur(c);
            }

            // Fermer la requete
            rs.close();

            

            //table data_compteur_jour
            // Créer la requête SQL
            query = "SELECT * FROM donneecyclable";

            //Exécuter la requête SQL
            rs = stmt.executeQuery(query);

            // Parcourir les résultats
            while (rs.next()) {
                // Récupérer les valeurs des colonnes
                int id_compteur = rs.getInt("un_compteur");
                String jour = rs.getString("un_jour");
                String anomalie = rs.getString("anomalie");
                short nbVeloH00 = rs.getShort("heure0");
                short nbVeloH01 = rs.getShort("heure1");
                short nbVeloH02 = rs.getShort("heure2");
                short nbVeloH03 = rs.getShort("heure3");
                short nbVeloH04 = rs.getShort("heure4");
                short nbVeloH05 = rs.getShort("heure5");
                short nbVeloH06 = rs.getShort("heure6");
                short nbVeloH07 = rs.getShort("heure7");
                short nbVeloH08 = rs.getShort("heure8");
                short nbVeloH09 = rs.getShort("heure9");
                short nbVeloH10 = rs.getShort("heure10");
                short nbVeloH11 = rs.getShort("heure11");
                short nbVeloH12 = rs.getShort("heure12");
                short nbVeloH13 = rs.getShort("heure13");
                short nbVeloH14 = rs.getShort("heure14");
                short nbVeloH15 = rs.getShort("heure15");
                short nbVeloH16 = rs.getShort("heure16");
                short nbVeloH17 = rs.getShort("heure17");
                short nbVeloH18 = rs.getShort("heure18");
                short nbVeloH19 = rs.getShort("heure19");
                short nbVeloH20 = rs.getShort("heure20");
                short nbVeloH21 = rs.getShort("heure21");
                short nbVeloH22 = rs.getShort("heure22");
                short nbVeloH23 = rs.getShort("heure23");

                // Faire quelque chose avec les données récupérées
                Jour j = listeJour.chercheJour(jour);
                Compteur c = ListeCompteur.chercheCompteur(id_compteur);

                DataCompteurJour dc = new DataCompteurJour(c, j);
                dc.setpresenceAnomalie(anomalie);
                dc.setNbVeloH00(nbVeloH00);
                dc.setNbVeloH01(nbVeloH01);
                dc.setNbVeloH02(nbVeloH02);
                dc.setNbVeloH03(nbVeloH03);
                dc.setNbVeloH04(nbVeloH04);
                dc.setNbVeloH05(nbVeloH05);
                dc.setNbVeloH06(nbVeloH06);
                dc.setNbVeloH07(nbVeloH07);
                dc.setNbVeloH08(nbVeloH08);
                dc.setNbVeloH09(nbVeloH09);
                dc.setNbVeloH10(nbVeloH10);
                dc.setNbVeloH11(nbVeloH11);
                dc.setNbVeloH12(nbVeloH12);
                dc.setNbVeloH13(nbVeloH13);
                dc.setNbVeloH14(nbVeloH14);
                dc.setNbVeloH15(nbVeloH15);
                dc.setNbVeloH16(nbVeloH16);
                dc.setNbVeloH17(nbVeloH17);
                dc.setNbVeloH18(nbVeloH18);
                dc.setNbVeloH19(nbVeloH19);
                dc.setNbVeloH20(nbVeloH20);
                dc.setNbVeloH21(nbVeloH21);
                dc.setNbVeloH22(nbVeloH22);
                dc.setNbVeloH23(nbVeloH23);

                ListeDataCompteurJour.ajouterDataCompteurJour(dc);
            }

            // Fermer la requete
            rs.close();

            // Fermer la connexion
            stmt.close();
            conn.close();




        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("nombre de jour dans la liste : " + listeJour.getListeJour().size());

        System.out.println("nombre de quartier dans la liste : " + ListeQuartier.getListeQuartier().size());

        System.out.println("nombre de compteur dans la liste : " + ListeCompteur.getListeCompteur().size());
        
        System.out.println("nombre de dataCompteurJour dans la liste : " + ListeDataCompteurJour.getListeDataCompteurJour().size());
        
        DataListe data = new DataListe(ListeCompteur, ListeDataCompteurJour, listeJour, ListeQuartier);

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                PremierePage laFrame  = new PremierePage(data);
                laFrame.pack();
                laFrame.setSize(1920, 1080);
                laFrame.setVisible(true);
            }
        });

    }
}
