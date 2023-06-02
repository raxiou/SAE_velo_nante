package action;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import vue.PremierePage;

public class TailleMod extends ComponentAdapter {
    PremierePage premierePage;
    public TailleMod(PremierePage page) {
        super();
        premierePage = page;
        
    }
    @Override
    public void componentResized(ComponentEvent e) {
        // Code à exécuter lorsque la taille de la JFrame est modifiée
        System.out.println(premierePage.getWidth() + " " + premierePage.getHeight());
        premierePage.setWidthText((short) (premierePage.getWidth() * premierePage.getHeight()));
    }
}
