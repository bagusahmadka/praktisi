/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODUL2;

/*import java.sql.Connection;
/*import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;*/
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class Person extends Data {
    
    private final int id;
    private final double password;
    private final String nama;
    private final String alamat;
    private final int telepon;
    private final String email;
    private final String gender;
    
    
    public Person(int id, double password, String nama, String alamat, int telepon, String email, String gender) 
{
        super(id, password, nama, alamat, telepon, email, gender);
        this.id = id;
        this.password = password;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.email = email;
        this.gender = gender;
        
 
 }
   
    public int getId() {
        return id;
    }
    
    public double getPassword() {
        return password;
    }
 
    public String getNama() {
        return nama;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public int getTelepon() {
        return telepon;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getGender() {
        return gender;
    }
    
    
    // Metode mutator (setter) untuk mengubah nilai
    /*public void setId (int id) {
        this.Id = id;
    }
    
    public void setPassword(double password) {
        this.password = password;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public void setTelepon(int telepon) {
        this.telepon = telepon;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }*/

    
    @Override 
    public void info() {
        System.out.println("Id " + getId());
        System.out.println("Password " + getPassword());
        System.out.println("Nama " + getNama());
        System.out.println("Alamat " + getAlamat());
        System.out.println("Telepon " + getTelepon());
        System.out.println("Email " + getEmail());
        System.out.println("Gender " + getGender());
    }
}
    
    public static void view_data(Person person, int id) throws SQLException {
        java.sql.Connection db=(Connection)KoneksiDB.getKoneksi();
        String sql = "SELECT * FROM data_customer Where id = '" + id + "' " ;
        try (PreparedStatement q = db.prepareStatement(sql)) {
            ResultSet rs = q.executeQuery();
            while (rs.next()) {
                person.setId(id);
                person.setNama(rs.getString("nama"));
                person.setAlamat(rs.getString("alamat"));
                person.setKota(rs.getString("kota"));
                person.setTelp(rs.getString("telp"));
            } // end while
        } // end try

    }
 public static void baca_data(DefaultTableModel tb, String sql) throws 
SQLException {
 java.sql.Connection db=(Connection)KoneksiDB.getKoneksi();
 try (PreparedStatement q = db.prepareStatement(sql)) {
 ResultSet rs = q.executeQuery();
 while (rs.next()) {
 tb.addRow(new Object[]{
 rs.getString("id"),
 rs.getString("nama"),
 rs.getString("alamat")
 });
 } // end while
 }// end try 
 }// end baca_data
 
 public static void Add(Orang orang) throws SQLException {
 java.sql.Connection db=(Connection)KoneksiDB.getKoneksi();
 String sql = "INSERT INTO r_orang (id, nama, alamat, kota, telp) VALUES 
(?, ?, ?, ?, ?)";
 try (PreparedStatement q = db.prepareStatement(sql)) {
 q.setString(1, orang.getId());
 q.setString(2, orang.getNama());
 q.setString(3, orang.getAlamat());
 q.setString(4, orang.getKota());
 q.setString(5, orang.getTelp());
 q.executeUpdate();
 }
 } 
 public static void Edit(Orang orang) throws SQLException {
 java.sql.Connection db=(Connection)KoneksiDB.getKoneksi();
 String sqledit = "UPDATE r_orang SET nama = ?, alamat = ?, kota = ?, 
telp=? WHERE id ='" + orang.getId()+"'";
 try (PreparedStatement q = db.prepareStatement(sqledit)) {
q.setString(1, orang.getNama());
 q.setString(2, orang.getAlamat());
 q.setString(3, orang.getKota());
 q.setString(4, orang.getTelp());
 q.executeUpdate();
 }
 } 
 
 public static boolean Del(String id) throws SQLException {
 java.sql.Connection db=(Connection)KoneksiDB.getKoneksi();
 boolean tf;
 String sql = "DELETE FROM r_orang WHERE id = '" + id + "' ";
 try (PreparedStatement q = db.prepareStatement(sql)) {
 int efek = q.executeUpdate();
 if (efek > 0) {
 tf=true;
 } else {
 tf=false;
 }
 }
 return tf;
 }
}