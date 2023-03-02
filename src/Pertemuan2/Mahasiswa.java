/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author nizar
 */

 /// PERTAMA BUAT CLASS DULU
 /// BARU ARRAY LIST
 /// BARU SISTEM CRUDNYA
 
 /// BUAT PERULANGAN LALU MENU
 /// CREATE
 /// READ
 /// UPDATE
 /// DELETE

// class
public class Mahasiswa {
    // property
    String nama;
    int nim;
    double IPK;
    
    // constructor || ini juga digunakan untuk bisa menghubungan objek dan arraylist biar enak dipanggil
    public Mahasiswa(String nama, int nim, double IPK){
        this.nama = nama;
        this.nim = nim;
        this.IPK = IPK;
    }

    // method
    public void registrasi(){
        System.out.println("Akun Kamu, " + this.nama);
        System.out.println("Dengan NIM " + this.nim);
        System.out.println("Telah terdaftar di SIA Versi Lite");
    }
    
    public void terupdate(){
        System.out.println("Akun Kamu, " + this.nama);
        System.out.println("Dengan NIM " + this.nim);
        System.out.println("IPK Kamu " + this.IPK);
        System.out.println("Telah terupdate di SIA Versi Lite");
    }
}
