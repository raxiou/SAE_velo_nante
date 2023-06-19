import javax.swing.*;
import java.awt.*;

public class PageAccueil extends JFrame{
    private JLabel cPresentation;
    private JLabel gPresentation;
    private JLabel dPresentation;
    private JLabel logoEntreprise;


    private JButton droite;
    private JButton gauche;
    private JButton deconnexion;




    //private PremierePageListener listener;

    public PageAccueil() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initComponents();
    }

    private void initComponents() {
        this.cPresentation = new JLabel("<html>Bonjour et bienvenue</html>");
        this.gPresentation = new JLabel("<html>Si vous souhaitez accéder aux informations sur les données récoltées par nos capteurs</html>");
        this.dPresentation = new JLabel("<html>Si vous souhaitez accéder au taux de fréquentation des cyclistes</html>");

        Font titre = new Font("Arial",Font.BOLD,52);
        Font texte = new Font("Arial",Font.BOLD,24);

        this.cPresentation.setFont(titre);
        this.cPresentation.setHorizontalAlignment(JLabel.CENTER);

        this.dPresentation.setFont(texte);
        this.dPresentation.setHorizontalAlignment(JLabel.CENTER);
        this.gPresentation.setFont(texte);
        this.gPresentation.setHorizontalAlignment(JLabel.CENTER);

        this.droite = new JButton("Cliquez ici");
        this.droite.setPreferredSize(new Dimension(400, 100));
        JPanel aDroite = new JPanel();
        aDroite.setLayout(new FlowLayout());
        aDroite.add(this.droite);

        this.gauche = new JButton("Cliquez ici");
        this.gauche.setPreferredSize(new Dimension(400, 100));
        JPanel aGauche = new JPanel();
        aGauche.setLayout(new FlowLayout());
        aGauche.add(this.gauche);

        this.deconnexion = new JButton("Se deconnecter");
        this.deconnexion.setPreferredSize(new Dimension(200, 50));
        JPanel hautDroit = new JPanel();
        hautDroit.setLayout(new FlowLayout(FlowLayout.RIGHT));
        hautDroit.add(this.deconnexion);


        ImageIcon logoE = new ImageIcon("data\\logoEntreprise.png");
        Image imageOrigin = logoE.getImage();
        Image imageResize = imageOrigin.getScaledInstance(300, 100, java.awt.Image.SCALE_SMOOTH);
        ImageIcon logoResize = new ImageIcon(imageResize);;

        this.logoEntreprise = new JLabel(logoResize);
        this.logoEntreprise.setHorizontalAlignment(JLabel.LEFT);

        // Mise en place d'un layout de type GridLayout
        this.setLayout(new GridLayout(5, 3));

        this.add(this.logoEntreprise);
        this.add(new JLabel());
        this.add(hautDroit);

        this.add(new JLabel());
        this.add(this.cPresentation);
        this.add(new JLabel());

        this.add(this.gPresentation);
        this.add(new JLabel());
        this.add(this.dPresentation);

        this.add(aGauche);
        this.add(new JLabel());
        this.add(aDroite);


        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                PageAccueil laFrame  = new PageAccueil();
                laFrame.pack();
                laFrame.setSize(new Dimension(1920, 1080));
                laFrame.setVisible(true);
            }
        });

    }


}



