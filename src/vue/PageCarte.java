package vue;

import javax.swing.*;

import action.PageCarteListenerImage;
import action.PageCarteListener;
import modele.DataListe;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class PageCarte extends JFrame{
    private DataListe data;

    private JLabel logoEntreprise;
    private JLabel flecheRetour;
    private JLabel graphique;
    private JLabel cPresentation;

    private Map<String, ImageIcon> map;

    private JComboBox<String> sGraph;
    private JButton deconnexion;

    private PageCarteListenerImage pageCarteListener;
    private PageCarteListener pageCarteListener2;


    //private PremierePageListener listener;

    public PageCarte(DataListe data) {
        this.data = data;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initComponents();
        this.pageCarteListener = new PageCarteListenerImage(this);
        this.sGraph.addActionListener(this.pageCarteListener);
    }

    private void initComponents() {
        this.cPresentation = new JLabel("Vous pouvez selectionner quelques graphiques exemples");
        Font texte = new Font("Arial",Font.BOLD,24);
        this.cPresentation.setFont(texte);
        JPanel txt = new JPanel();
        txt.setLayout(new FlowLayout(FlowLayout.CENTER));
        txt.add(this.cPresentation);

        pageCarteListener2 = new PageCarteListener(this);
        this.deconnexion = new JButton("Se deconnecter");
        this.deconnexion.setPreferredSize(new Dimension(200, 50));
        this.deconnexion.addActionListener(pageCarteListener2);
        JPanel hautDroit = new JPanel();
        hautDroit.setLayout(new FlowLayout(FlowLayout.RIGHT));
        hautDroit.add(this.deconnexion);

        this.map = new HashMap<String, ImageIcon>();
        this.map.put("Total quotidient de passage des cyclistes", new ImageIcon("data\\imageCarte\\Graph1.png"));
        this.map.put("Nombre de compteurs par quartier", new ImageIcon("data\\imageCarte\\Graph2.png"));
        this.map.put("Top 5 des quarties avec le plus grand nombre de cyclistes", new ImageIcon("data\\imageCarte\\Graph3.png"));
        this.map.put("Longueur des pistes cyclables par quartier", new ImageIcon("data\\imageCarte\\Graph4.png"));
        this.map.put("Répartition des compteurs par anomalie", new ImageIcon("data\\imageCarte\\Graph5.png"));
        this.map.put("Variation de température par jour", new ImageIcon("data\\imageCarte\\Graph6.png"));
        this.map.put("Nombre total de cyclistes par quartier", new ImageIcon("data\\imageCarte\\Graph7.png"));
        this.map.put("Nombre de cyclistes par quartier à une date donnée (heure 8)", new ImageIcon("data\\imageCarte\\Graph8.png"));

        this.sGraph = new JComboBox<String>();
        this.sGraph.addItem("Total quotidient de passage des cyclistes");
        this.sGraph.addItem("Nombre de compteurs par quartier");
        this.sGraph.addItem("Top 5 des quarties avec le plus grand nombre de cyclistes");
        this.sGraph.addItem("Longueur des pistes cyclables par quartier");
        this.sGraph.addItem("Répartition des compteurs par anomalie");
        this.sGraph.addItem("Variation de température par jour");
        this.sGraph.addItem("Nombre total de cyclistes par quartier");
        this.sGraph.addItem("Nombre de cyclistes par quartier à une date donnée (heure 8)");


        JPanel leGraph = new JPanel();
        leGraph.setLayout(new FlowLayout());
        leGraph.add(this.sGraph);
        JPanel gauche1 = new JPanel();
        gauche1.setLayout(new GridLayout(2, 1));
        gauche1.add(txt);
        gauche1.add(leGraph);
        JPanel gauche = new JPanel();
        gauche.setLayout(new GridLayout(3, 1));
        gauche.add(new JLabel());
        gauche.add(gauche1);
        gauche.add(new JLabel());


        ImageIcon logoE = new ImageIcon("../data/image/logoEntreprise.png");
        Image imageOrigin = logoE.getImage();
        Image imageResize = imageOrigin.getScaledInstance(300, 100, java.awt.Image.SCALE_SMOOTH);
        ImageIcon logoResize = new ImageIcon(imageResize);
        this.logoEntreprise = new JLabel(logoResize);
        this.logoEntreprise.setHorizontalAlignment(JLabel.LEFT);

        ImageIcon imageFlecheRetour = new ImageIcon("../data/image/flecheRetour.png");
        imageOrigin = imageFlecheRetour.getImage();
        imageResize = imageOrigin.getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH);
        ImageIcon flecheResize = new ImageIcon(imageResize);
        this.flecheRetour = new JLabel(flecheResize);
        this.flecheRetour.setHorizontalAlignment(JLabel.LEFT);

        ImageIcon graph = new ImageIcon("../data/image/Graph1.png");
        imageOrigin = graph.getImage();
        imageResize = imageOrigin.getScaledInstance(1000, 700, java.awt.Image.SCALE_SMOOTH);
        ImageIcon graphResize = new ImageIcon(imageResize);
        this.graphique = new JLabel(graphResize);

        JPanel hautGauche = new JPanel(new GridLayout(2, 0));
        hautGauche.add(this.flecheRetour);
        hautGauche.add(this.logoEntreprise);

        JPanel haut = new JPanel(new GridLayout(1, 2));
        haut.add(hautGauche);
        haut.add(hautDroit);

        this.setLayout(new BorderLayout());

        this.add(haut, BorderLayout.NORTH);
        this.add(this.graphique, BorderLayout.EAST);
        this.add(gauche, BorderLayout.CENTER);


    }

    public JComboBox<String> getSGraph(){
        return this.sGraph;
    }

    public Map<String, ImageIcon> getMap(){
        return this.map;
    }

    public JLabel getGraphique(){
        return this.graphique;
    }

    public String getLeGraph(){
        return this.sGraph.getSelectedItem().toString();
    }

    public void miseAJour(String chemin){

    }

    public DataListe getData() {
        return data;
    }


}

