/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.endro.test.model.table;

import com.endro.test.entitiy.Mahasiswa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author bumijonet
 */
public class TableMahasiswaModel extends AbstractTableModel {

    List<Mahasiswa> list = new ArrayList<>();

    public void setList(List<Mahasiswa> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getNim();
            case 1:
                return list.get(rowIndex).getNama();
            case 2:
                return list.get(rowIndex).getAlamat();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nim";
            case 1:
                return "Nama";
            case 2:
                return "Alamat";
            default:
                return null;
        }
    }

    public boolean add(Mahasiswa e) {
        try {
            return list.add(e);
        } finally {
            fireTableRowsDeleted(getRowCount() - 1, getRowCount());
        }
    }

    public Mahasiswa get(int index) {
        return list.get(index);
    }

    public Mahasiswa set(int index, Mahasiswa element) {
        try {
            return list.set(index, element);
        } finally {
            fireTableRowsUpdated(index, index);
        }
    }

    public Mahasiswa remove(int index) {
        try {
            return list.remove(index);

        } finally {
            fireTableRowsDeleted(index, index);
        }
    }

}
