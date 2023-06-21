package vue;

import javax.swing.*;

import action.MouseListenerCliquePG;
import action.PageGraphicListener;
import modele.DataListe;
import modele.objectBdd.DataCompteurJour;
import modele.objectBddListe.ListeDataCompteurJour;
import vue.enumeration.*;

import java.awt.*;
import java.util.ArrayList;

public class PageGraphic extends JFrame{
    private DataListe data;

    private JLabel logoEntreprise;
    private JLabel flecheRetour;
    private BarChartPanel graph;

    private JTextField champPiste;
    private JComboBox<Annee> annee;
    private JComboBox<Tempo> tempo;

    private JButton deconnexion;
    private JButton reload;

    private PageGraphicListener listener;
    private MouseListenerCliquePG listenerClique;

    private JPanel haut;
    private JPanel gauche;

    public PageGraphic(DataListe data) {
        this.data = data;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.initComponents();
    }

    public PageGraphic(DataListe data, BarChartPanel graph) {
        this.data = data;
        this.graph = graph;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initComponents();
    }

    public void setGraph(BarChartPanel graph) {
        this.graph = graph;
    }

    public DataListe getData() {
        System.out.println(this.data.getListeDataCompteurJour().getListeDataCompteurJour().size());
        return this.data;
    }

    private void initComponents() {

        this.listener = new PageGraphicListener(this);
        this.listenerClique = new MouseListenerCliquePG(this);
        this.annee = new JComboBox<Annee>(Annee.values());
        this.annee.setPreferredSize(new Dimension(200, 50));
        JPanel bA = new JPanel(new FlowLayout());
        bA.add(this.annee);

        this.tempo = new JComboBox<Tempo>(Tempo.values());
        this.tempo.setPreferredSize(new Dimension(200, 50));
        JPanel bT = new JPanel(new FlowLayout());
        bT.add(this.tempo);

        this.champPiste = new JTextField("Centre Ville");
        this.champPiste.setPreferredSize(new Dimension(200, 50));
        JPanel cP = new JPanel(new FlowLayout());
        cP.add(this.champPiste);


        JPanel gauche = new JPanel(new GridLayout(5,1));
        gauche.add(new JPanel());
        gauche.add(cP);
        gauche.add(bA);
        gauche.add(bT);

        this.deconnexion = new JButton("Se deconnecter");
        this.deconnexion.setPreferredSize(new Dimension(200, 50));
        this.deconnexion.addActionListener(this.listener);
        JPanel hautDroit = new JPanel();
        hautDroit.setLayout(new FlowLayout(FlowLayout.RIGHT));
        hautDroit.add(this.deconnexion);

        this.reload = new JButton("Actualiser");
        this.reload.setPreferredSize(new Dimension(200, 50));
        this.reload.addActionListener(this.listener);
        JPanel act = new JPanel();
        act.setLayout(new FlowLayout());
        act.add(this.reload);
        gauche.add(act);

        ImageIcon logoE = new ImageIcon("data\\logoEntreprise.png");
        Image imageOrigin = logoE.getImage();
        Image imageResize = imageOrigin.getScaledInstance(300, 100, java.awt.Image.SCALE_SMOOTH);
        ImageIcon logoResize = new ImageIcon(imageResize);
        this.logoEntreprise = new JLabel(logoResize);
        this.logoEntreprise.setHorizontalAlignment(JLabel.LEFT);

        ImageIcon imageFlecheRetour = new ImageIcon("data\\flecheRetour.png");
        imageOrigin = imageFlecheRetour.getImage();
        imageResize = imageOrigin.getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH);
        ImageIcon flecheResize = new ImageIcon(imageResize);
        this.flecheRetour = new JLabel(flecheResize);
        this.flecheRetour.setHorizontalAlignment(JLabel.LEFT);
        this.flecheRetour.addMouseListener(this.listenerClique);

        JPanel hautGauche = new JPanel(new GridLayout(2, 0));
        hautGauche.add(this.flecheRetour);
        hautGauche.add(this.logoEntreprise);

        JPanel haut = new JPanel(new GridLayout(1, 2));
        haut.add(hautGauche);
        haut.add(hautDroit);

        this.haut = haut;
        this.gauche = gauche;

        // Mise en place d'un layout de type GridLayout
        this.setLayout(new BorderLayout());

        this.add(haut, BorderLayout.NORTH);
        this.add(gauche, BorderLayout.CENTER);


    }

    public String getChampPiste() {
        return this.champPiste.getText();
    }

    public String getAnnee() {
        return this.annee.getSelectedItem().toString();
    }

    public String getTempo() {
        return this.tempo.getSelectedItem().toString();
    }

    public void creerGraphiqueJour(){
        ListeDataCompteurJour listeDataCompteurJour = this.getData().getListeDataCompteurJour();
        ArrayList<DataCompteurJour> listeDateCompteur = new ArrayList<DataCompteurJour>();
        ArrayList<DataCompteurJour> listeDateCompteur2 = new ArrayList<DataCompteurJour>();

        for(int i = 0; i < listeDataCompteurJour.getListeDataCompteurJour().size(); i++) {
            if(listeDataCompteurJour.getListeDataCompteurJour().get(i).getCompteur().getLeQuartier().getNomQuartier().equals(this.getChampPiste())){
                listeDateCompteur.add(listeDataCompteurJour.getListeDataCompteurJour().get(i));
            }
        }

        String annee = this.getAnnee();
        String[] parts = annee.split("_");
        annee = parts[1];
        for(DataCompteurJour data : listeDateCompteur) {
            String[] parts2 = data.getJour().getDate().split("-");
            String annee2 = parts2[0];
            if(annee2.equals(annee)) {
                listeDateCompteur2.add(data);
            }
        }

       
        String[] listeJour = new String[listeDateCompteur2.size()];
        int[] listeValeur = new int[listeDateCompteur2.size()];

        for(int i = 0; i < listeDateCompteur2.size(); i++) {
            listeJour[i] = listeDateCompteur2.get(i).getJour().getDate();
            listeValeur[i] = listeDateCompteur2.get(i).totalPassage();
        }

        BarChartPanel chartPanel = new BarChartPanel(listeJour, listeValeur);

        this.graph = chartPanel;

        //change la taille du graphique
        this.graph.setPreferredSize(new Dimension(1000, 500));

        actualiserPage();

        
    }

    public void creerGraphiqueMois(){
        ListeDataCompteurJour listeDataCompteurJour = this.getData().getListeDataCompteurJour();
        ArrayList<DataCompteurJour> listeDateCompteur = new ArrayList<DataCompteurJour>();
        ArrayList<DataCompteurJour> listeDateCompteur2 = new ArrayList<DataCompteurJour>();

        for(int i = 0; i < listeDataCompteurJour.getListeDataCompteurJour().size(); i++) {
            if(listeDataCompteurJour.getListeDataCompteurJour().get(i).getCompteur().getLeQuartier().getNomQuartier().equals(this.getChampPiste())){
                listeDateCompteur.add(listeDataCompteurJour.getListeDataCompteurJour().get(i));
            }
        }

        String annee = this.getAnnee();
        String[] parts = annee.split("_");
        annee = parts[1];
        for(DataCompteurJour data : listeDateCompteur) {
            String[] parts2 = data.getJour().getDate().split("-");
            String annee2 = parts2[0];
            if(annee2.equals(annee)) {
                listeDateCompteur2.add(data);
            }
        }

        ListeDataCompteurJour listeDataCompteurJour2 = new ListeDataCompteurJour(listeDateCompteur2);

        int mois1 = listeDataCompteurJour2.totalMois(1);
        int mois2 = listeDataCompteurJour2.totalMois(2);
        int mois3 = listeDataCompteurJour2.totalMois(3);
        int mois4 = listeDataCompteurJour2.totalMois(4);
        int mois5 = listeDataCompteurJour2.totalMois(5);
        int mois6 = listeDataCompteurJour2.totalMois(6);
        int mois7 = listeDataCompteurJour2.totalMois(7);
        int mois8 = listeDataCompteurJour2.totalMois(8);
        int mois9 = listeDataCompteurJour2.totalMois(9);
        int mois10 = listeDataCompteurJour2.totalMois(10);
        int mois11 = listeDataCompteurJour2.totalMois(11);
        int mois12 = listeDataCompteurJour2.totalMois(12);


        String[] listeJour = {"Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre"};
        int[] listeValeur = {mois1, mois2, mois3, mois4, mois5, mois6, mois7, mois8, mois9, mois10, mois11, mois12};
        BarChartPanel chartPanel = new BarChartPanel(listeJour, listeValeur);

        this.graph = chartPanel;

        //change la taille du graphique
        this.graph.setPreferredSize(new Dimension(1000, 500));

        actualiserPage();

        
    }


    private void actualiserPage() {
    getContentPane().removeAll(); // Supprime tous les composants du conteneur principal

    // Ajoutez ici les composants nécessaires pour afficher le graphique
    this.add(haut, BorderLayout.NORTH);
    this.add(graph, BorderLayout.EAST);
    this.add(gauche, BorderLayout.CENTER);

    revalidate(); // Actualise la mise en page
    repaint(); // Redessine la page
}

}


