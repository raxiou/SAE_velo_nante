import javax.swing.*;
import java.awt.*;

public class CreatCompte extends JFrame{
    private JLabel cPresentation;
    private JLabel lPresentation;
    private JLabel logoEntreprise;
    private JLabel flecheRetour;

    private JTextField champNom;
    private JTextField champMDP;
    private JTextField cChampMDP;
    private JTextField mail;
    private JTextField cMail;

    private JCheckBox conditionUtilisation;
    private JCheckBox newLetters;

    private JButton confirmation;

    


    //private PremierePageListener listener;

    public CreatCompte() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initComponents();
    }

    private void initComponents() {
        this.cPresentation = new JLabel("<html>Bonjour et bienvenue</html>");
        this.lPresentation = new JLabel("<html>Pour créer un compte, vous devez remplir les champs suivants.<br>"
        + "Les champs indiqués avec une * sont obligatoires.</html>");

        Font titre = new Font("Arial",Font.BOLD,52);
        Font texte = new Font("Arial",Font.BOLD,24);

        this.cPresentation.setFont(titre);
        this.cPresentation.setHorizontalAlignment(JLabel.CENTER);

        this.lPresentation.setFont(texte);
        this.lPresentation.setHorizontalAlignment(JLabel.CENTER);

        this.champNom = new JTextField("Identifiant *");
        this.champNom.setPreferredSize(new Dimension(400, 50));
        JPanel cN = new JPanel();
        cN.setLayout(new FlowLayout(FlowLayout.LEFT));
        cN.add(this.champNom);

        this.champMDP = new JTextField("Mot de passe *");
        this.champMDP.setPreferredSize(new Dimension(400, 50));
        JPanel cMDP = new JPanel();
        cMDP.setLayout(new FlowLayout());
        cMDP.add(this.champMDP);

        this.cChampMDP = new JTextField("Confirmer le mot de passe *");
        this.cChampMDP.setPreferredSize(new Dimension(400, 50));
        JPanel cCM = new JPanel();
        cCM.setLayout(new FlowLayout());
        cCM.add(this.cChampMDP);

        this.mail = new JTextField("Adresse mail *");
        this.mail.setPreferredSize(new Dimension(400, 50));
        JPanel m = new JPanel();
        m.setLayout(new FlowLayout());
        m.add(this.mail);

        this.cMail = new JTextField("Confirmer l'adresse mail *");
        this.cMail.setPreferredSize(new Dimension(400, 50));
        JPanel cM = new JPanel();
        cM.setLayout(new FlowLayout());
        cM.add(this.cMail);


        this.newLetters = new JCheckBox("Je souhaite recevoir la newsletter de BIKE");
        this.conditionUtilisation = new JCheckBox("<html>J'ai lu et j'accepte les conditions légales d'utilisation de BIKE</html>");

        JPanel coche = new JPanel(new FlowLayout(FlowLayout.LEFT));
        coche.add(this.newLetters);
        coche.add(this.conditionUtilisation);

        /*JPanel textePanel = new JPanel(new FlowLayout());
        textePanel.add(this.lPresentation);*/

        this.confirmation = new JButton("Confirmer");
        this.confirmation.setPreferredSize(new Dimension(400, 100));
        JPanel conf = new JPanel();
        conf.setLayout(new FlowLayout());
        conf.add(this.confirmation);

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

        JPanel hautGauche = new JPanel(new GridLayout(2, 0));
        hautGauche.add(this.flecheRetour);
        hautGauche.add(this.logoEntreprise);
        // Mise en place d'un layout de type GridLayout
        this.setLayout(new GridLayout(6, 3));

        this.add(hautGauche);
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(this.cPresentation);
        this.add(new JLabel());


        this.add(new JLabel());
        this.add(this.lPresentation);
        this.add(new JLabel());
        this.add(m);
        this.add(cMDP);
        this.add(cN);


        this.add(cM);
        this.add(cCM);
        this.add(coche);
        this.add(new JLabel());
        this.add(conf);
        this.add(new JLabel());

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                CreatCompte laFrame  = new CreatCompte();
                laFrame.pack();
                laFrame.setSize(1920, 1080);
                laFrame.setVisible(true);
            }
        });

    }


}

