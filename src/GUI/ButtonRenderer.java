
package GUI;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.accessibility.AccessibleContext;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;
import javax.swing.table.*;
 

public class ButtonRenderer extends JButton implements TableCellRenderer {
    
    private String title;
    
     public ButtonRenderer() {
        setOpaque(true);
    }
    public ButtonRenderer(String t) {
        setOpaque(true);
        setText(t);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
  
    public Component getTableCellRendererComponent(JTable table, Object value,
                     boolean isSelected, boolean hasFocus, int row, int column) {
        if (isSelected) {
            setForeground(table.getSelectionForeground());
            setBackground(table.getSelectionBackground());
        } else{
            setForeground(table.getForeground());
            setBackground(UIManager.getColor("Button.background"));
        }
        
        setText( (value ==null) ? "" : value.toString() );
        return this;
    }
}
