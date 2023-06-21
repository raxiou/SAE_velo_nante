package action;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vue.PageCarte;
import vue.PremierePage;

public class PageCarteListener implements ActionListener {

    PageCarte frame;

    public PageCarteListener(PageCarte frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent paramActionEvent) {
        // recupere le nom du bouton
        String nomBouton = paramActionEvent.getActionCommand();
        System.out.println(nomBouton);
        // si le bouton est "Connexion"
        if (nomBouton.equals("Se deconnecter")) {
            // on affiche la page de graphique
            
            PremierePage laFrame  = new PremierePage(frame.getData());
            laFrame.pack();
            laFrame.setSize(new Dimension(1920, 1080));
            laFrame.setVisible(true);
            this.frame.setVisible(false);
            
        }
    }
    
}
