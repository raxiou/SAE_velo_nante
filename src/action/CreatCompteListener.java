package action;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import vue.CreatCompte;
import vue.PageAccueil;

public class CreatCompteListener implements ActionListener {
    private CreatCompte frame;

    public CreatCompteListener(CreatCompte frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent paramActionEvent) {
        // recupere le nom du bouton
        String nomBouton = paramActionEvent.getActionCommand();
        // récupérer l'identifiant et le mot de passe saisis
        String username = frame.getNom();
        String password = frame.getMDP();

        boolean isUsernameAvailable = frame.checkUsernameAvailability(username);

        // si le bouton est "Confirmer" et si les identifiants sont disponibles
        if ((nomBouton.equals("Confirmer")) && (isUsernameAvailable)) {
            // on sauvegarde les identifiants dans un fichier texte
            frame.saveCredentials(username, password);
            JOptionPane.showMessageDialog(this.frame, "Compte créé avec succès !");
            // on affiche la page d'Acueil
            PageAccueil laFrame  = new PageAccueil(frame.getData());
            laFrame.pack();
            laFrame.setSize(new Dimension(1920, 1080));
            laFrame.setVisible(true);
            this.frame.setVisible(false);
            
        }
        if(!isUsernameAvailable){
            JOptionPane.showMessageDialog(this.frame, "Le nom d'utilisateur est déjà utilisé !");
        }
    }
    
}
