/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.endro.test.databases;

import com.endro.test.dao.MahasiswaDao;
import com.endro.test.dao.impl.MahasiswaDaoImpl;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author klewoood
 */
public class Databases {

    private static Connection koneksi;
    private static MahasiswaDao mahasiswaDao;

    public static Connection getKoneksi() throws SQLException {
        if (koneksi == null) {
            MysqlDataSource dataSource = new MysqlDataSource();

            dataSource.setUrl("jdbc:mysql://localhost:3306/mytest");
            dataSource.setUser("root");
            dataSource.setPassword("G3LaCKVz");

            koneksi = dataSource.getConnection();
        }
        
        return koneksi;
    }

    public static MahasiswaDao getMahasiswaDao() throws SQLException {
        if(mahasiswaDao == null){
            mahasiswaDao = new MahasiswaDaoImpl(getKoneksi());
        }
        return mahasiswaDao;
    }
    
    

}
