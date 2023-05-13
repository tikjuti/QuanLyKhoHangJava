package GUI.AccountFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class AccountPanelAddBackground extends javax.swing.JPanel {

    public AccountPanelAddBackground() {
        initComponents();
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        Color xanh = Color.decode("#1CB5E0");
        g2d.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(getBackground());
        g2d.fillRoundRect(0, 0, getWidth(), getHeight() / 4, 0, 0);
        g2d.setColor(Color.WHITE);
        g2d.fillRoundRect(0, getHeight() / 4, getWidth(), getHeight() - getHeight() / 4, 0, 0);

        g2d.dispose();
        super.paintComponent(g);

        setOpaque(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
