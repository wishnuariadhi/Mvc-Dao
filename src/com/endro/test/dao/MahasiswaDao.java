/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.endro.test.dao;

import com.endro.test.entitiy.Mahasiswa;
import com.endro.test.error.TestException;
import java.util.List;

/**
 *
 * @author klewoood
 */
public interface MahasiswaDao {
    
    public void insertClien(Mahasiswa mahasiswa) throws TestException;

    public void updateClien(Mahasiswa mahasiswa) throws TestException;

    public void deleteClien(String nim) throws TestException;

    public Mahasiswa getByNim(String nim) throws TestException;

    public List<Mahasiswa> getAll() throws TestException;
}
