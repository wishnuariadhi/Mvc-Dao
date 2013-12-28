/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.endro.test.main;

import com.endro.test.databases.Databases;
import java.sql.SQLException;

/**
 *
 * @author klewoood
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Databases.getKoneksi();
        
    }
    
}
