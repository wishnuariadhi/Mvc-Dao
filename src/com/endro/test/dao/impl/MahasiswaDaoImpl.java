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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author klewoood
 */
public class MahasiswaDaoImpl implements MahasiswaDao {

    private Connection koneksi;

    public MahasiswaDaoImpl(Connection koneksi) {
        this.koneksi = koneksi;
    }

    private final String insert = "insert into mahasiswa (nim, nama, alamat) values (?,?,?)";
    private final String update = "update mahasiswa set nama=?, alamat=? where nim=?";
    private final String delete = "delete from mahasiswa where nim=?";
    private final String getAll = "select * from mahasiswa";
    private final String getNim = "select * from mahasiswa where nim=?";

    @Override
    public void insertClien(Mahasiswa mahasiswa) throws TestException {
        PreparedStatement statement = null;

        try {
            statement = koneksi.prepareStatement(insert);

            statement.setString(1, mahasiswa.getNim());
            statement.setString(2, mahasiswa.getNama());
            statement.setString(3, mahasiswa.getAlamat());
            statement.executeUpdate();

        } catch (SQLException ex) {
            throw new TestException(ex.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {

                }
            }
        }
    }

    @Override
    public void updateClien(Mahasiswa mahasiswa) throws TestException {
        PreparedStatement statement = null;

        try {
            statement = koneksi.prepareStatement(update);

            statement.setString(3, mahasiswa.getNim());
            statement.setString(1, mahasiswa.getNama());
            statement.setString(2, mahasiswa.getAlamat());
            statement.executeUpdate();

        } catch (SQLException ex) {
            throw new TestException(ex.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {

                }
            }
        }
    }

    @Override
    public void deleteClien(String nim) throws TestException {
        PreparedStatement statement = null;

        try {
            statement = koneksi.prepareStatement(delete);

            statement.setString(1, nim);

            statement.executeUpdate();

        } catch (SQLException ex) {
            throw new TestException(ex.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {

                }
            }
        }
    }

    @Override
    public Mahasiswa getByNim(String nim) throws TestException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            statement = koneksi.prepareStatement(getNim);

            statement.setString(1, nim);
            result = statement.executeQuery();
            Mahasiswa mahasiswa = null;

            if (result.next()) {
                mahasiswa = new Mahasiswa();
                mahasiswa.setNama(result.getString("nama"));
                mahasiswa.setAlamat(result.getString("alamat"));
                mahasiswa.setNim(result.getString("nim"));

            } else {
                new TestException("Mahasiswa dengan id " + nim + " tidak pernah ditemukan");
            }
            return mahasiswa;
        } catch (SQLException ex) {
            throw new TestException(ex.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {

                }
            }
            if (result != null) {
                try {
                    result.close();
                } catch (SQLException ex) {

                }
            }
        }
    }

    @Override
    public List<Mahasiswa> getAll() throws TestException {
        Statement statement = null;
        ResultSet result = null;
        List<Mahasiswa> list = new ArrayList<>();

        try {
            statement = koneksi.createStatement();

            result = statement.executeQuery(getAll);

            while (result.next()) {
                Mahasiswa mahasiswa = new Mahasiswa();
                mahasiswa.setNama(result.getString("nama"));
                mahasiswa.setAlamat(result.getString("alamat"));
                mahasiswa.setNim(result.getString("nim"));

                list.add(mahasiswa);
            }
            return list;
        } catch (SQLException ex) {
            throw new TestException(ex.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {

                }
            }
            if (result != null) {
                try {
                    result.close();
                } catch (SQLException ex) {

                }
            }
        }
    }

}
