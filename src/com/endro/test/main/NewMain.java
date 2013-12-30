/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.endro.test.main;

import com.endro.test.dao.MahasiswaDao;
import com.endro.test.databases.Databases;
import com.endro.test.entitiy.Mahasiswa;
import com.endro.test.error.TestException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author klewoood
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, TestException {
        // TODO code application logic here
        MahasiswaDao dao = Databases.getMahasiswaDao();
        
        //Mahasiswa mahasiswa = new Mahasiswa();
        
        //mahasiswa.setNim("12090778");
        //mahasiswa.setNama("Mas longor");
        //mahasiswa.setAlamat("Rahasia");
        
        //dao.insertClien(mahasiswa);
        
        
        
        //Mahasiswa mahasiswa = dao.getByNim("12090778");
        //System.out.println(mahasiswa.getAlamat());
        
        //Mahasiswa mahasiswa = dao.getByNim("12090778");
        
         //List<Mahasiswa> list = dao.getAll();
         
         //for(Mahasiswa mahasiswa: list){
         //    System.out.println(mahasiswa.getAlamat());
          //   System.out.println(mahasiswa.getNama());
        // }
        
    }
    
}
