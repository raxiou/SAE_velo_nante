package action;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import vue.PremierePage;

public class PageGraphicListener implements ActionListener {
    private JFrame frame;

    public PageGraphicListener(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent paramActionEvent) {
        // recupere le nom du bouton
        String nomBouton = paramActionEvent.getActionCommand();

        // si le bouton est "Confirmer"
        if (nomBouton.equals("Se deconnecter")) {
            // on affiche la page d'Acueil
            
            PremierePage laFrame  = new PremierePage();
            laFrame.pack();
            laFrame.setSize(new Dimension(1920, 1080));
            laFrame.setVisible(true);
            this.frame.setVisible(false);
                        
        }
    }
    
}
