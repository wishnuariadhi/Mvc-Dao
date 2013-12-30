/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.endro.test.model.event;

import com.endro.test.entitiy.Mahasiswa;
import com.endro.test.model.MahasiswaModel;

/**
 *
 * @author bumijonet
 */
public interface MahasiswaListener {

    public void onChange(MahasiswaModel model);

    public void onInsert(Mahasiswa mahasiswa);

    public void onUpdate(Mahasiswa mahasiswa);

    public void onDelete();
}
