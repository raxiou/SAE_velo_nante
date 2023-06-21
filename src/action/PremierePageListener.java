package action;

import javax.swing.JOptionPane;

import vue.CreatCompte;
import vue.PageAccueil;
import vue.PremierePage;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PremierePageListener implements ActionListener {
    PremierePage frame;

    public PremierePageListener(PremierePage frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent paramActionEvent) {
        // recupere le nom du bouton
        String nomBouton = paramActionEvent.getActionCommand();

        // récupère l'identifiant et le mot de passe saisis
        String username = frame.getNom();
        String password = frame.getMDP();


        boolean isValidCredentials = frame.checkCredentials(username, String.valueOf(password));

        // si le bouton est "Connexion"
        if ((nomBouton.equals("Connexion")) && (isValidCredentials)) {
            // les identifiants sont bien enregistrés
            JOptionPane.showMessageDialog(this.frame, "Connexion réussie !");
            // on affiche la page de connexion
            PageAccueil laFrame  = new PageAccueil(frame.getData());
            laFrame.pack();
            laFrame.setSize(new Dimension(1920, 1080));
            laFrame.setVisible(true);
            this.frame.setVisible(false);
            
        }
        if((nomBouton.equals("Connexion")) && (!isValidCredentials)) {
            JOptionPane.showMessageDialog(this.frame, "Nom d'utilisateur ou mot de passe incorrect !");
        }

        // si le bouton est "Créer un compte"
        if (nomBouton.equals("Créer un compte")) {
            // on affiche la page de création de compte
            CreatCompte laFrame  = new CreatCompte(frame.getData());
            laFrame.pack();
            laFrame.setSize(1920, 1080);
            laFrame.setVisible(true);
            this.frame.setVisible(false);
        }

        // si le bouton est "En tant qu'invité"
        if (nomBouton.equals("En tant qu'invité")) {
            // on affiche la page de création de compte
            PageAccueil laFrame  = new PageAccueil(frame.getData());
            laFrame.pack();
            laFrame.setSize(new Dimension(1920, 1080));
            laFrame.setVisible(true);
            this.frame.setVisible(false);
        }
    }
    
}
