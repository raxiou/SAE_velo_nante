package action;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import vue.PremierePage;

public class TailleMod extends ComponentAdapter {
    PremierePage premierePage;
    private boolean userResized = true; // Indicateur de redimensionnement par l'utilisateur

    public TailleMod(PremierePage page) {
        super();
        premierePage = page;
    }

    @Override
    public void componentResized(ComponentEvent e) {
        if (userResized) {
            // Code à exécuter lorsque la taille de la JFrame est modifiée par l'utilisateur
            System.out.println(userResized);
            System.out.println(premierePage.getWidth() + " " + premierePage.getHeight());

            if (premierePage.getWidth() < 300) {
                premierePage.setWidthText(16);
            } else if (premierePage.getWidth() < 600) {
                premierePage.setWidthText(24);
            } else if (premierePage.getWidth() < 900) {
                premierePage.setWidthText(32);
            } else if (premierePage.getWidth() < 1200) {
                premierePage.setWidthText(40);
            } else {
                premierePage.setWidthText(48);
            }

            premierePage.maj();
        }
    }

    public void setUserResized(boolean resized) {
        userResized = resized;
    }
}
