/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomTableCell;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.AbstractCellEditor;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

/**
 *
 * @author ysuta
 */
public class TransaksiTroliCell extends DefaultCellEditor implements TableCellRenderer {

   protected JButton button;
    protected DefaultTableModel produkModel;
    protected DefaultTableModel troliModel;
    protected int row;

    public TransaksiTroliCell(JCheckBox checkBox, DefaultTableModel produk, DefaultTableModel troli) {
        super(checkBox);
        this.produkModel = produk;
        this.troliModel = troli;
        button = new JButton();
        button.setOpaque(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Vector rowData = (Vector) troliModel.getDataVector().elementAt(row);
                rowData.remove(rowData.size()-1);
                
                for (Object object : rowData) {
                    System.out.print(object + " | ");
                }
                System.out.println("");
                produkModel.addRow(rowData); 
                troli.removeRow(row);
            }
        });
        
      
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        this.row = row;
        
        button.setText("-");
        if (isSelected) {
            button.setForeground(table.getSelectionForeground());
            button.setBackground(table.getSelectionBackground());
        } else {
            button.setForeground(table.getForeground());
            button.setBackground(table.getBackground());
        }
        return button;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        this.row = row;
        
        button.setText("-");
        if (isSelected) {
            button.setForeground(table.getSelectionForeground());
            button.setBackground(table.getSelectionBackground());
        } else {
            button.setForeground(table.getForeground());
            button.setBackground(table.getBackground());
        }
        return button;
    }

}
