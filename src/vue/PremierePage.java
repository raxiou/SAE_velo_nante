package vue;

import javax.swing.*;

import action.PremierePageListener;
import modele.DataListe;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PremierePage extends JFrame{
    private DataListe data;

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

    private PremierePageListener listener;

    public PremierePage(DataListe data) {
        this.data = data;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initComponents();
    }

    private void initComponents() {
        this.listener = new PremierePageListener(this);
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
        this.champNom.setPreferredSize(new Dimension(400, 50));
        JPanel cN = new JPanel();
        cN.setLayout(new FlowLayout());
        cN.add(this.champNom);

        this.champMDP = new JTextField("Mot de passe");
        this.champMDP.setPreferredSize(new Dimension(400, 50));
        JPanel cM = new JPanel();
        cM.setLayout(new FlowLayout());
        cM.add(this.champMDP);

        this.creatCompte = new JButton("Créer un compte");
        this.creatCompte.setPreferredSize(new Dimension(400, 50));
        this.creatCompte.addActionListener(this.listener);
        JPanel cC = new JPanel();
        cC.setLayout(new FlowLayout());
        cC.add(this.creatCompte);

        this.coAsInv = new JButton("En tant qu'invité");
        this.coAsInv.setPreferredSize(new Dimension(400, 50));
        this.coAsInv.addActionListener(this.listener);
        JPanel cAI = new JPanel();
        cAI.setLayout(new FlowLayout());
        cAI.add(this.coAsInv);

        

        this.connexion = new JButton("Connexion");
        this.connexion.setPreferredSize(new Dimension(400, 50));
        this.connexion.addActionListener(this.listener);
        JPanel cO = new JPanel();
        cO.setLayout(new FlowLayout());
        cO.add(this.connexion);


        ImageIcon logoE = new ImageIcon("data\\logoEntreprise.png");
        this.logoEntreprise = new JLabel(logoE);

        ImageIcon logoV = new ImageIcon("data\\logoNantes.png");
        Image imageOrigin = logoV.getImage();
        Image imageResize = imageOrigin.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
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
        this.add(cN);
        this.add(cC);
        this.add(new JLabel());
        this.add(cM);
        this.add(cAI);

        this.add(new JLabel());
        this.add(cO);
        this.add(new JLabel());

    }

    public DataListe getData() {
        return data;
    }

    // getters
    public String getNom(){
        return this.champNom.getText();
    }

    public String getMDP(){
        return this.champMDP.getText();
    }

    public boolean checkCredentials(String username, String password) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data\\credentials.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] credentials = line.split(",");
                String existingUsername = credentials[0];
                String existingPassword = credentials[1];
                if (existingUsername.equals(username) && existingPassword.equals(password)) {
                    reader.close();
                    return true; // Les identifiants sont valides
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // Les identifiants sont incorrects
    }


}
