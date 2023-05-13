package GUI.AccountFrame;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

public class Table extends JTable {

    public Table() {
        setShowHorizontalLines(true);
//        setGridColor(new Color(230,230,230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value + "");
                header.setHorizontalAlignment((int) JTable.CENTER_ALIGNMENT);

                return header;
            }

        });

        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

                Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                com.setBackground(Color.WHITE);
                setBorder(noFocusBorder);

                if (isSelected) {
                    com.setForeground(new Color(13, 133, 182));
                } else {
                    com.setForeground(new Color(102, 102, 102));

                }

                return com;

            }

        });
    }

}
