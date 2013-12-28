/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.endro.test.dao.impl;

import com.endro.test.dao.MahasiswaDao;
import com.endro.test.entitiy.Mahasiswa;
import com.endro.test.error.TestException;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author klewoood
 */
public class MahasiswaDaoImpl implements MahasiswaDao {

    private Connection koneksi;

    public MahasiswaDaoImpl(Connection koneksi) {
        this.koneksi = koneksi;
    }

    @Override
    public void insertClien(Mahasiswa mahasiswa) throws TestException {

    }

    @Override
    public void updateClien(Mahasiswa mahasiswa) throws TestException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteClien(Integer nim) throws TestException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mahasiswa getByIdRegistrasi(Integer nim) throws TestException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Mahasiswa> getAll() throws TestException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
