package vue;

import javax.swing.*;

import action.MouseListenerCliquePC;
import action.PageCarteListener;
import modele.DataListe;

import java.awt.*;

public class PageCarte extends JFrame{
    private DataListe data;

    private JLabel logoEntreprise;
    private JLabel flecheRetour;
    private JLabel carte;

    private JButton telecharger;
    private JButton deconnexion;




    private PageCarteListener listener;
    private MouseListenerCliquePC listenerClique;

    public PageCarte(DataListe data) {
        this.data = data;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initComponents();
    }

    public DataListe getData() {
        return this.data;
    }

    private void initComponents() {
        this.listener = new PageCarteListener(this);
        this.listenerClique = new MouseListenerCliquePC(this);

        this.telecharger = new JButton("Télécharger");
        this.telecharger.setPreferredSize(new Dimension(400, 100));
        JPanel tel = new JPanel();
        tel.setLayout(new FlowLayout());
        tel.add(this.telecharger);

        this.deconnexion = new JButton("Se deconnecter");
        this.deconnexion.setPreferredSize(new Dimension(200, 50));
        this.deconnexion.addActionListener(this.listener);
        JPanel hautDroit = new JPanel();
        hautDroit.setLayout(new FlowLayout(FlowLayout.RIGHT));
        hautDroit.add(this.deconnexion);

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

        ImageIcon carte = new ImageIcon("data\\carte.png");
        imageOrigin = carte.getImage();
        imageResize = imageOrigin.getScaledInstance(950, 700, java.awt.Image.SCALE_SMOOTH);
        ImageIcon carteResize = new ImageIcon(imageResize);
        this.carte = new JLabel(carteResize);

        JPanel hautGauche = new JPanel(new GridLayout(2, 0));
        hautGauche.add(this.flecheRetour);
        hautGauche.add(this.logoEntreprise);

        JPanel haut = new JPanel(new GridLayout(1, 2));
        haut.add(hautGauche);
        haut.add(hautDroit);

        // Mise en place d'un layout de type GridLayout
        this.setLayout(new BorderLayout());

        this.add(haut, BorderLayout.NORTH);
        this.add(this.carte, BorderLayout.CENTER);
        this.add(tel, BorderLayout.SOUTH);


    }


}

