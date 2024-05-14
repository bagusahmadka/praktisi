/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODUL2;

/**
 *
 * @author Lenovo
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class KoneksiDB {
    private static Connection koneksi;
    
    public static Connection getKoneksi(){
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); 
            String url="jdbc:mysql://localhost:3306/praktisi"; //url database
            String user="root"; //user database
            String pass=""; //password database
            koneksi=DriverManager.getConnection(url, user, pass); 
        } catch (SQLException e) {
            System.err.println("koneksi gagal "+ e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return koneksi;
    } 
 
    public static void main(String[] args) {
        //private Connection koneksi2;
        koneksi = getKoneksi();
    }
}

