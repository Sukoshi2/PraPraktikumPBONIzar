/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author nizar
 */
public class Pertemuan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
        // membuat buffered reader dan input steam reader untuk membaca apa yang kita input
        InputStreamReader input2 = new InputStreamReader(System.in);
        BufferedReader input3 = new BufferedReader(input2);
        
        // membuat buffered reader menjadi lebih simpel
         BufferedReader input4 = new BufferedReader(new InputStreamReader(System.in));
        
        // membuat inputan menggunakan scanner
        Scanner input = new Scanner(System.in);
        
        // //membuat arraylist untuk menyimpan data
        // ArrayList<String> list1 = new ArrayList<>();
//        
//        //print ln(line) atau print biasa berbeda kalo line inputannya auto dibawah(mengikuti code)
//        //print biasa inputan akan sejajar dengan output
//        System.out.print("Masukan Jumlah data : ");
//        int jumlah = Integer.parseInt(input3.readLine());
//        
//        //input sesuai dengan range jumlah data
//        for (int i = 0; i < jumlah; i++) {
//            System.out.println("Masukan data ke - " + (i+1)+ " : ");
//            list1.add(input3.readLine());
//        }
//        //output sesuai dengan range jumlah data
//        // i + 1 untuk menunjukan udah index ke berapa
//        for (int i = 0; i < list1.size(); i++){
//            System.out.println("Data ke-" + (i+1) + " : " + list1.get(i));
//        }

//        System.out.println("INPUT MENGGUNAKAN Buffered");
//        System.out.print("Masukan Nama : ");
//        String nama = input4.readLine();
//        System.out.print("Masukan NIM : ");
//        int nim = Integer.parseInt(input4.readLine());
//        System.out.print("Masukan IPK :");
//        float ipk = Float.parseFloat(input4.readLine());
//        
//        System.out.println("Output : ");
//        System.out.println("Nama Mhs : " + nama);
//        System.out.println("NIM : " + nim);
//        System.out.println("IPK : " + ipk);
//        
//        
//        System.out.println("INPUT MENGGUNAKAN Scanner");
//        System.out.print("Masukan Nama Barang : ");
//        String namaBarang = input.nextLine();
//        System.out.print("Masukan Harga Barang : ");
//        int hargaBarang = input.nextInt();
//        System.out.print("Masukan Rate Barang : ");
//        float rateBarang = input.nextFloat();
//        
//        System.out.println("Output : ");
//        System.out.println("Nama Barang : " + namaBarang);
//        System.out.println("Harga Barang : " + hargaBarang);
//        System.out.println("Rate Barang : " + rateBarang); 
        
        // INI DARI REFERENSI BANG LADEN
        // KALO MISALNYA LANGSUNG CRUD NTAR BUAT SENDIRI
        // TANYAKAN KE GIAL DLU
        
        // ntar buat program CRUD tentang penjumlahan IPK SIA untuk mahasiswa akhir
        ArrayList<Float> IPK = new ArrayList<>();
        System.out.println("SIA VERSI LITE");
        System.out.print("Masukan Nama Mahasiswa : ");
        String namaMahasiswa = input.nextLine();
        System.out.print("Masukan NIM Mahasiswa : ");
        int nimMahasiswa = input.nextInt();
        System.out.print("Masukan Jumlah Semester : ");
        int jumlah = Integer.parseInt(input3.readLine());
        
        //input sesuai dengan range jumlah data
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Data IP Semester ke -" + (i+1)+ " : ");
            IPK.add(Float.parseFloat(input4.readLine()));
        }
        //output sesuai dengan range jumlah data
        // i + 1 untuk menunjukan udah index ke berapa
        
        float semua = 0;
        for (int i = 0; i < IPK.size(); i++){
            semua += IPK.get(i);
        }
        float totalIPK = semua/jumlah;
        System.out.println("Nama Mahasiswa : " + namaMahasiswa);
        System.out.println("NIM Mahasiswa : " + nimMahasiswa);
        System.out.println("IPK Anda : "+ totalIPK);

    }
}
