package action;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import vue.PageAccueil;
import vue.PageCarte;
import vue.PageGraphic;
import vue.PremierePage;

public class PageAccueilListeneur implements ActionListener {

    PageAccueil frame;

    public PageAccueilListeneur(PageAccueil frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent paramActionEvent) {
        // recupere le nom du bouton
        String nomBouton = paramActionEvent.getActionCommand();
        System.out.println(nomBouton);
        // si le bouton est "Connexion"
        if (nomBouton.equals("Cliquez l\u00E0")) {
            // on affiche la page de graphique
            
            PageCarte laFrame  = new PageCarte(frame.getData());
            laFrame.pack();
            laFrame.setSize(new Dimension(1920, 1080));
            laFrame.setVisible(true);
            this.frame.setVisible(false);
            
        }

        // si le bouton est "Cliquez ici"
        if (nomBouton.equals("Cliquez ici")) {
            // on affiche la page de carte
            PageGraphic laFrame  = new PageGraphic(frame.getData());
            laFrame.pack();
            laFrame.setSize(new Dimension(1920, 1080));
            laFrame.setVisible(true);
            this.frame.setVisible(false);
        }

        // si le bouton est "Se deconnecter"
        if (nomBouton.equals("Se deconnecter")) {
            // on affiche la page de connexion
            PremierePage laFrame  = new PremierePage(frame.getData());
            laFrame.pack();
            laFrame.setSize(new Dimension(1920, 1080));
            laFrame.setVisible(true);
            this.frame.setVisible(false);
        }
    }
    
}
