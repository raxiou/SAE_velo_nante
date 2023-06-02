import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class TailleMod extends ComponentAdapter {
    @Override
    public void componentResized(ComponentEvent e) {
        // Code à exécuter lorsque la taille de la JFrame est modifiée
        System.out.println("La taille de la JFrame a été modifiée !");
    }
}
