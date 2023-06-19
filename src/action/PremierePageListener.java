package action;

import javax.swing.JFrame;

import vue.PageAccueil;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PremierePageListener implements ActionListener {
    JFrame frame;

    public PremierePageListener(JFrame frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent paramActionEvent) {
        // recupere le nom du bouton
        String nomBouton = paramActionEvent.getActionCommand();

        // si le bouton est "Connexion"
        if (nomBouton.equals("Connexion")) {
            // on affiche la page de connexion
            this.frame.setVisible(false);
            PageAccueil laFrame  = new PageAccueil();
            laFrame.pack();
            laFrame.setSize(new Dimension(1920, 1080));
            laFrame.setVisible(true);
            
        }
    }
    
}
