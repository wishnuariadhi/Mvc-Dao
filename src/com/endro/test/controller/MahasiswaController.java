/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.endro.test.controller;

import com.endro.test.model.MahasiswaModel;
import com.endro.test.view.FormMahasiswa;
import javax.swing.JOptionPane;

/**
 *
 * @author bumijonet
 */
public class MahasiswaController {

    private MahasiswaModel model;

    public void setModel(MahasiswaModel model) {
        this.model = model;
    }

    public void insert(FormMahasiswa view) {
        String nama = view.getjTextNama().getText();
        String alamat = view.getjTextAlamat().getText();
        String nim = view.getjTextNim().getText();

        if (nama.equals(null)) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong");
        } else if (alamat.equals("")) {
            JOptionPane.showMessageDialog(view, "Alamat tidak boleh kosong");
        } else if (nim.equals("")) {
            JOptionPane.showMessageDialog(view, "Nim harus diisi");
        } else {
            model.setAlamat(alamat);
            model.setNama(nama);
            model.setNim(nim);
            try {
                model.insertMahasiswa();
                JOptionPane.showMessageDialog(view, "Data berhasil dimasukan");
                model.resetMahasiswa();
            } catch (Throwable t) {
                t.printStackTrace();
            }
        }
    }
    
    public void update(FormMahasiswa view) {
        String nama = view.getjTextNama().getText();
        String alamat = view.getjTextAlamat().getText();
        String nim = view.getjTextNim().getText();

        if (nama.equals(null)) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong");
        } else if (alamat.equals("")) {
            JOptionPane.showMessageDialog(view, "Alamat tidak boleh kosong");
        } else if (nim.equals("")) {
            JOptionPane.showMessageDialog(view, "Nim harus diisi");
        } else {
            model.setAlamat(alamat);
            model.setNama(nama);
            model.setNim(nim);
            try {
                model.updateMahasiswa();
                JOptionPane.showMessageDialog(view, "Data berhasil dimasukan");
                model.resetMahasiswa();
            } catch (Throwable t) {
                t.printStackTrace();
            }
        }
    }
    
    public void delete(FormMahasiswa view) {
        
        String nim = view.getjTextNim().getText();

        if (nim.equals("")) {
            JOptionPane.showMessageDialog(view, "Nim harus diisi");
        } else {
            model.setNim(nim);
            try {
                model.deleteMahasiswa();
                JOptionPane.showMessageDialog(view, "Data berhasil dihapus");
                model.resetMahasiswa();
            } catch (Throwable t) {
                t.printStackTrace();
            }
        }
    }
    
    public void reset(FormMahasiswa view){
        model.resetMahasiswa();
    }
}
