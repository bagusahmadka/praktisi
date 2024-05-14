/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODUL2;

/**
 *
 * @author ritsuka
 */
public class Data {
    private final int id;
    private final double password;
    private final String nama;
    private final String alamat;
    private final int telepon;
    private final String email;
    private final String gender;
    
    
    public Data(int id, double password, String nama, String alamat, int telepon, String email, String gender) {
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
    
    
    public void setId (int id) {
        this.id = id;
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
    }
    
    
    
    public void info() {
    System.out.println("Id " + id);
    System.out.println("Password " + password);
    System.out.println("Nama " + nama);
    System.out.println("Alamat " + alamat);
    System.out.println("Telepon " + telepon);
    System.out.println("Email " + email);
    System.out.println("Gender " + gender);
    }
 
}
