/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomJTables;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author ysuta
 */
public class BooleanTableCellRenderer extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, "", isSelected, hasFocus, row, column);
        if (row % 2 == 0) {
            boolean newValue = Boolean.valueOf(String.valueOf(value));
            System.out.println("Value = " + newValue);
            setValue(newValue);
            setBackground(new Color(210,130,1));
            setForeground(Color.BLACK);
        }
        else {
            boolean newValue = Boolean.valueOf(String.valueOf(value));
            System.out.println("Value = " + newValue);
            setValue(newValue);
            setBackground(new Color(255,231,192));
            setForeground(Color.BLACK);
        }
        // IF CLICKED   => Bg = Color.Orange
        //              => font = Color.White
        return this;
    }
    
}
