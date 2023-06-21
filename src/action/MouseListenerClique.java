package action;

import java.awt.Dimension;
import java.awt.event.MouseListener;

import vue.PageAccueil;
import vue.PageCarte;

public class MouseListenerClique implements MouseListener {
    private PageCarte frame;

    public MouseListenerClique(PageCarte frame) {
        this.frame = frame;
    }
    
    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {


        PageAccueil laFrame  = new PageAccueil(frame.getData());
        laFrame.pack();
        laFrame.setSize(new Dimension(1920, 1080));
        laFrame.setVisible(true);
        this.frame.setVisible(false);
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {

    }
}
