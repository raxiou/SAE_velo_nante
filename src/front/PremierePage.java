package front;
import javax.swing.*;
import java.awt.*;

public class PremierePage extends JFrame{
    private JLabel cPresentation;
    private JLabel lPresentation;
    private JLabel petitLabel;

    private JTextField champNom;
    private JTextField champMDP;

    private JButton creatCompte;
    private JButton coAsInv;
    private JButton connexion;

    private JLabel logoEntreprise;
    private JLabel logoVille;

    //private PremierePageListener listener;

    public PremierePage() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initComponents();
    }

    private void initComponents() {
        this.cPresentation = new JLabel("<html>Informations relatives au passage de vélos à Nantes</html>");
        this.lPresentation = new JLabel("<html>BIKE vous permet de consulter de nombreuses données relatives au passage de vélos dans la ville de Nantes, et de visualiser ces données par zone définies.</html>");
        this.petitLabel = new JLabel("Se connecter :");

        Font titre = new Font("Arial",Font.BOLD,32);
        Font texte = new Font("Arial",Font.BOLD,24);

        this.cPresentation.setFont(titre);
        this.cPresentation.setHorizontalAlignment(JLabel.CENTER);

        this.lPresentation.setFont(texte);
        this.lPresentation.setHorizontalAlignment(JLabel.CENTER);

        this.petitLabel.setFont(titre);
        this.petitLabel.setHorizontalAlignment(JLabel.CENTER);

        this.champNom = new JTextField("Nom du compte");
        this.champMDP = new JTextField("Mot de passe");

        this.creatCompte = new JButton("Créer un compte");
        this.creatCompte.setSize(new Dimension(200, 50));
        this.coAsInv = new JButton("En tant qu'invité");
        this.coAsInv.setSize(new Dimension(200, 50));
        this.connexion = new JButton("Connexion");
        this.connexion.setSize(new Dimension(200, 50));


        ImageIcon logoE = new ImageIcon("../data/image/logoEntreprise.png");
        this.logoEntreprise = new JLabel(logoE);

        ImageIcon logoV = new ImageIcon("../data/image/logoNantes.png");
        Image imageOrigin = logoV.getImage();
        Image imageResize = imageOrigin.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        ImageIcon logoResize = new ImageIcon(imageResize);
        this.logoVille = new JLabel(logoResize);
        this.logoVille.setHorizontalAlignment(JLabel.LEFT);


        // Mise en place d'un layout de type GridLayout
        this.setLayout(new GridLayout(7, 3));

        this.add(this.logoVille);
        this.add(this.logoEntreprise);
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(this.cPresentation);
        this.add(new JLabel());


        this.add(new JLabel());
        this.add(this.lPresentation);
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(this.petitLabel);
        this.add(new JLabel());


        this.add(new JLabel());
        this.add(this.champNom);
        this.add(this.creatCompte);
        this.add(new JLabel());
        this.add(this.champMDP);
        this.add(this.coAsInv);

        this.add(new JLabel());
        this.add(this.connexion);
        this.add(new JLabel());

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                PremierePage laFrame  = new PremierePage();
                laFrame.pack();
                laFrame.setVisible(true);
            }
        });

    }


}
