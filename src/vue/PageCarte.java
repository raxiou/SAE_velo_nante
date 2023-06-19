import javax.swing.*;
import java.awt.*;

public class PageCarte extends JFrame{
    private JLabel logoEntreprise;
    private JLabel flecheRetour;
    private JLabel carte;

    private JButton telecharger;
    private JButton deconnexion;




    //private PremierePageListener listener;

    public PageCarte() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initComponents();
    }

    private void initComponents() {
        this.telecharger = new JButton("Télécharger");
        this.telecharger.setPreferredSize(new Dimension(400, 100));
        JPanel tel = new JPanel();
        tel.setLayout(new FlowLayout());
        tel.add(this.telecharger);

        this.deconnexion = new JButton("Se deconnecter");
        this.deconnexion.setPreferredSize(new Dimension(200, 50));
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                PageCarte laFrame  = new PageCarte();
                laFrame.pack();
                laFrame.setSize(1920, 1080);
                laFrame.setVisible(true);
            }
        });

    }


}

