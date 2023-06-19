import javax.swing.*;

import enumeration.*;

import java.awt.*;

public class PageGraphic extends JFrame{
    private JLabel logoEntreprise;
    private JLabel flecheRetour;
    private JLabel carte;

    private JTextField champPiste;
    private JComboBox<Annee> annee;
    private JComboBox<Tempo> tempo;

    private JButton deconnexion;
    private JButton reload;

    //private PremierePageListener listener;

    public PageGraphic() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initComponents();
    }

    private void initComponents() {
        this.annee = new JComboBox<Annee>(Annee.values());
        this.annee.setPreferredSize(new Dimension(200, 50));
        JPanel bA = new JPanel(new FlowLayout());
        bA.add(this.annee);

        this.tempo = new JComboBox<Tempo>(Tempo.values());
        this.tempo.setPreferredSize(new Dimension(200, 50));
        JPanel bT = new JPanel(new FlowLayout());
        bT.add(this.tempo);

        this.champPiste = new JTextField("Piste");
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
        JPanel hautDroit = new JPanel();
        hautDroit.setLayout(new FlowLayout(FlowLayout.RIGHT));
        hautDroit.add(this.deconnexion);

        this.reload = new JButton("Actualiser");
        this.reload.setPreferredSize(new Dimension(200, 50));
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
        this.add(this.carte, BorderLayout.EAST);
        this.add(gauche, BorderLayout.CENTER);


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                PageGraphic laFrame  = new PageGraphic();
                laFrame.pack();
                laFrame.setSize(1920, 1080);
                laFrame.setVisible(true);
            }
        });

    }


}

