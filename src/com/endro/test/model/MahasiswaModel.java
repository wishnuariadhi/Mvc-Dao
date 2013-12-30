/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.endro.test.model;

import com.endro.test.dao.MahasiswaDao;
import com.endro.test.databases.Databases;
import com.endro.test.entitiy.Mahasiswa;
import com.endro.test.error.TestException;
import com.endro.test.model.event.MahasiswaListener;
import java.sql.SQLException;

/**
 *
 * @author bumijonet
 */
public class MahasiswaModel {

    private String nim;
    private String nama;
    private String alamat;
    private MahasiswaListener listener;

    public MahasiswaListener getListener() {
        return listener;
    }

    public void setListener(MahasiswaListener listener) {
        this.listener = listener;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    protected void fireOnChage() {
        if (listener != null) {
            listener.onChange(this);
        }
    }

    protected void fireOnChange() {
        if (listener != null) {
            listener.onChange(this);
        }
    }

    protected void fireOnInsert(Mahasiswa mahasiswa) {
        if (listener != null) {
            listener.onInsert(mahasiswa);
        }
    }

    protected void fireOnUpdate(Mahasiswa mahasiswa) {
        if (listener != null) {
            listener.onUpdate(mahasiswa);
        }
    }

    protected void fireOnDelete() {
        if (listener != null) {
            listener.onDelete();
        }
    }

    public void insertMahasiswa() throws SQLException, TestException {
        MahasiswaDao dao = Databases.getMahasiswaDao();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setAlamat(alamat);
        mahasiswa.setNama(nama);
        mahasiswa.setNim(nim);

        dao.insertClien(mahasiswa);

        fireOnInsert(mahasiswa);
    }

    public void updateMahasiswa() throws SQLException, TestException {
        MahasiswaDao dao = Databases.getMahasiswaDao();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setAlamat(alamat);
        mahasiswa.setNama(nama);
        mahasiswa.setNim(nim);

        dao.updateClien(mahasiswa);

        fireOnUpdate(mahasiswa);
    }

    public void deleteMahasiswa() throws SQLException, TestException {
        MahasiswaDao dao = Databases.getMahasiswaDao();

        dao.deleteClien(nim);
        fireOnDelete();
    }
    
    public void resetMahasiswa(){
        setAlamat("");
        setNama("");
        setNim("");
    }

}
