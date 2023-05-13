package GUI.MainFrame;

import javax.swing.JPanel;

public class JpanelLoader {

    public void jPanelLoader(JPanel Main, JPanel setPanel) {
        Main.removeAll();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(Main);
        Main.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(setPanel, javax.swing.GroupLayout.Alignment.CENTER,
                                javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE,
                                Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(setPanel, javax.swing.GroupLayout.Alignment.CENTER,
                                javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE,
                                Short.MAX_VALUE));
        System.gc();

    }
}
