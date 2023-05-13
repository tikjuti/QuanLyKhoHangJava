package GUI.component;


import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;


public class RoundButton extends JButton{

    {
        this.setOpaque(false);
    }
    
    public RoundButton(){
    }
    
    public RoundButton(int radius){
        this.radius = radius;
    }
    
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(getBackground());
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2d.dispose();
        super.paintComponent(g);
    }
    
    private int radius = 30;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
}
