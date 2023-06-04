/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Admin
 */
public class TableQLCongNo extends AbstractTableModel implements  Serializable{
    String name[] = {"Ma sinh vien","Ho va ten","Lop"};
    Class classes[] ={String.class,String.class,String.class,Float.class};
    ArrayList<HoSo> dshs = new ArrayList<>();
    
    public TableQLCongNo(ArrayList<HoSo> dshs){
        this.dshs = dshs;
    }
    @Override
    public int getRowCount(){
        return dshs.size();
    }
    @Override
    public int getColumnCount(){
        return name.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dshs.get(rowIndex).getMaSV();
            case 1: return dshs.get(rowIndex).getHoTen();
            case 2: return dshs.get(rowIndex).getLop();
            default: return null;
        }
    }
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return classes[columnIndex]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getColumnName(int column) {
        return name[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
