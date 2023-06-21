package vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class BarChartPanel extends JPanel {
    private String[] names;
    private int[] values;

    public BarChartPanel(String[] names, int[] values) {
        this.names = names;
        this.values = values;
        setPreferredSize(new Dimension(400, 300)); // Définissez la taille préférée du panneau
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int barWidth = (getWidth() - 60) / values.length; // Espace de 60 pixels réservé pour l'échelle et les barres

        int maxValue = getMaxValue();
        int panelHeight = getHeight() - 40; // Espace de 40 pixels réservé pour le texte
        int barHeight;

        // Dessiner l'échelle
        int scaleStep = maxValue / 5; // Pas de l'échelle
        int scaleValue = 0;
        int scaleSpacing = panelHeight / 5;
        g.setColor(Color.BLACK); // Couleur de l'échelle
        g.setFont(new Font("Arial", Font.PLAIN, 10)); // Police de l'échelle
        for (int i = 0; i <= 5; i++) {
            int y = getHeight() - 20 - i * scaleSpacing;
            g.drawString(String.valueOf(scaleValue), 10, y);
            scaleValue += scaleStep;
        }

        for (int i = 0; i < values.length; i++) {
            barHeight = (int) ((double) values[i] / maxValue * panelHeight);
            int x = 50 + i * (barWidth + 10); // Espace de 10 pixels entre les barres
            int y = getHeight() - barHeight - 20; // Espace de 20 pixels réservé en bas
            g.setColor(new Color(135, 206, 250)); // Couleur bleu clair (LightSkyBlue)
            g.fillRect(x, y, barWidth, barHeight);
            g.setColor(Color.BLACK); // Couleur de la bordure
            g.drawRect(x, y, barWidth, barHeight); // Dessine la bordure autour des barres
            g.setColor(Color.BLACK); // Couleur du texte
            g.drawString(names[i], x, getHeight() - 5);
        }
        
        // Dessiner le nom de la variable ("score")
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 12));
        g.drawString("Score", 10, getHeight() - 25);
    }

    private int getMaxValue() {
        int max = Integer.MIN_VALUE;
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
