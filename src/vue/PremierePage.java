package vue;
import javax.swing.*;
import javax.swing.border.Border;

import action.TailleMod;

import java.awt.*;

public class PremierePage extends JFrame {
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

    private int widthText = 100;

    TailleMod resizeListener = new TailleMod(this);

    //private PremierePageListener listener;

    public PremierePage() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initComponents();
    }

    public int getWidthText() {
        return this.widthText;
    }

    public void setWidthText(int widthText) {
        this.widthText = widthText;
    }

    public void maj(){
        resizeListener.setUserResized(false);
        System.out.println("cc");
        System.out.println(this.widthText);
        this.cPresentation.setFont(new Font("Arial", Font.BOLD, widthText));
        this.lPresentation.setFont(new Font("Arial", Font.BOLD, (widthText/3)*2));
        this.petitLabel.setFont(new Font("Arial", Font.BOLD, widthText));
        this.pack();
        resizeListener.setUserResized(true);

    }

    private void initComponents() {
        this.cPresentation = new JLabel("<html>Informations relatives au passage de vélos à Nantes</html>");
        this.lPresentation = new JLabel("<html>BIKE vous permet de consulter de nombreuses données relatives au passage de vélos dans la ville de Nantes, et de visualiser ces données par zone définies.</html>");
        this.petitLabel = new JLabel("Se connecter :");
        Font titre = new Font("Arial", Font.BOLD, 32);
        Font texte = new Font("Arial", Font.BOLD, 24);

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

        String imagePath = "../data/image/logoNantes.png";
        Image imageResize = new ImageIcon(imagePath).getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        this.logoVille = new JLabel(new ImageIcon(imageResize));
        this.logoVille.setHorizontalAlignment(JLabel.LEFT);

        //ajout d'un listener pour la JFrame
        
        this.addComponentListener(resizeListener);

        // Mise en place d'un layout de type GridBagLayout
        GridBagLayout gridBagLayout = new GridBagLayout();
        this.setLayout(gridBagLayout);

        // Création d'une bordure vide avec une couleur de votre choix
        Color gridColor = Color.BLACK;
        int borderWidth = 2;
        Border gridBorder = BorderFactory.createLineBorder(gridColor, borderWidth);

        // Création d'un GridBagConstraints pour les composants
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10); // Espacement entre les composants

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        this.logoVille.setBorder(gridBorder);
        this.add(this.logoVille, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        this.logoEntreprise.setBorder(gridBorder);
        this.add(this.logoEntreprise, gridBagConstraints);

        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        this.cPresentation.setBorder(gridBorder);
        this.add(this.cPresentation, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        this.lPresentation.setBorder(gridBorder);
        this.add(this.lPresentation, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        this.petitLabel.setBorder(gridBorder);
        this.add(this.petitLabel, gridBagConstraints);

        gridBagConstraints.gridy = 3;
        this.champNom.setBorder(gridBorder);
        this.add(this.champNom, gridBagConstraints);

        gridBagConstraints.gridy = 4;
        this.champMDP.setBorder(gridBorder);
        this.add(this.champMDP, gridBagConstraints);

        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 1;
        this.creatCompte.setBorder(gridBorder);
        this.add(this.creatCompte, gridBagConstraints);

        gridBagConstraints.gridx = 2;
        this.coAsInv.setBorder(gridBorder);
        this.add(this.coAsInv, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        this.connexion.setBorder(gridBorder);
        this.add(this.connexion, gridBagConstraints);

        this.pack();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                PremierePage laFrame = new PremierePage();
                laFrame.setVisible(true);
                System.out.println(laFrame.getSize().getWidth());
            }
        });
    }
}
