package action;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        // si le bouton est "Confirmer"
        if (nomBouton.equals("Confirmer")) {
            // on affiche la page d'Acueil
            
            PageAccueil laFrame  = new PageAccueil(frame.getData());
            laFrame.pack();
            laFrame.setSize(new Dimension(1920, 1080));
            laFrame.setVisible(true);
            this.frame.setVisible(false);
            
        }
    }
    
}
