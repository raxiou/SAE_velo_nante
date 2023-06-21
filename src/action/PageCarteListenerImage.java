package action;
import java.awt.event.*;
import javax.swing.*;

import vue.PageCarte;

import java.awt.*;

public class PageCarteListenerImage implements ActionListener{

    private PageCarte pageCarte;

    public PageCarteListenerImage(PageCarte pageCarte){
        this.pageCarte = pageCarte;
    }

    public void actionPerformed(ActionEvent e) {
        String selectedOption = (String)this.pageCarte.getSGraph().getSelectedItem();
        ImageIcon selectedImage = this.pageCarte.getMap().get(selectedOption);
        Image imageOrigin = selectedImage.getImage();
        Image imageResize = imageOrigin.getScaledInstance(1000, 700, java.awt.Image.SCALE_SMOOTH);
        ImageIcon graphResize = new ImageIcon(imageResize);
        this.pageCarte.getGraphique().setIcon(graphResize);
    }
}





