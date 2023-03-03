/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan2;
import java.util.*; 
import java.io.*;
/**
 *
 * @author nizar
 */
public class Main {

    /// STATIC Digunakan Untuk memanggil sebuah kode yang bisa
    /// masuk ke function yang dalam
    /// A.K.A Variabel Global :v

    /// ARRAY LIST MAHASISWA, MENAMPUNG SEMUA ISINYA
    static ArrayList<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();
    /// BUFFERED READER (INPUT)
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        
        while (true) {
            System.out.println(" +++ SIA VERSI LITE +++");
            System.out.println("1. Create Data Mahasiswa");
            System.out.println("2. Read Data Mahasiswa");
            System.out.println("3. Update Data Mahasiswa");
            System.out.println("4. Delete Data Mahasiswa");
            System.out.println("5. Exit");
            System.out.print("Masukan Pilihan Anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            if (pilihan == 1) {
                createMhs();
            } else if (pilihan == 2){
                readMhs();
            } else if (pilihan == 3){
                updateMhs();
            } else if (pilihan == 4){
                deleteMhs();
            } else if (pilihan == 5){
                System.exit(0);
            } else {
                System.out.println("Pilihan Tidak Tersedia");
            }
        }

    }
        
    public static void createMhs() throws IOException{
        System.out.print("Masukan Nama Mahasiswa: ");
        String addnama = br.readLine();
        System.out.print("Masukan NIM Mahasiswa: ");
        int addnim = Integer.parseInt(br.readLine());
        System.out.print("Masukan IPK Mahasiswa: ");
        double addIPK = Double.parseDouble(br.readLine());
        Mahasiswa mhsBaru = new Mahasiswa(addnama, addnim, addIPK); 
        // add == menambahkan data ke array list
        mahasiswa.add(mhsBaru);
        //pemanggilan method registrasi
        mhsBaru.registrasi();
    }

    public static void readMhs() throws IOException{
        System.out.println(" +++ DATA MAHASISWA +++");
        /// I itu permisalan untuk index karena array list = array :v
        /// size == ukuran / panjang array list
        for (int i = 0; i < mahasiswa.size(); i++) {
            System.out.println("Mahasiswa ke-" + (i+1));
            //karena index itu 0 maka ditambah 1
            // get == mengambil data dari array list
            System.out.println("Nama Mahasiswa: " + mahasiswa.get(i).nama);
            System.out.println("NIM Mahasiswa: " + mahasiswa.get(i).nim);
            System.out.println("IPK Mahasiswa: " + mahasiswa.get(i).IPK);
            System.out.print("\n");
        }
    }
    
    public static void updateMhs() throws IOException{

        readMhs();

        System.out.println(" +++ UPDATE DATA MAHASISWA +++");
        System.out.print("Masukan Data Mahasiswa ke-");
        int index = Integer.parseInt(br.readLine());
        System.out.print("Masukan Nama Mahasiswa: ");
        String setNAMA = br.readLine();
        System.out.print("Masukan NIM Mahasiswa: ");
        int setNIM = Integer.parseInt(br.readLine());
        System.out.print("Masukan IPK Mahasiswa: ");
        double setIPK = Double.parseDouble(br.readLine());

        // memasukan data yang baru ke array list (menggantikannya)
        mahasiswa.get(index-1).nama = setNAMA;
        mahasiswa.get(index-1).nim = setNIM;
        mahasiswa.get(index-1).IPK = setIPK;

        ///pemanggilan method terupdate
        mahasiswa.get(index-1).terupdate();
    }

    public static void deleteMhs() throws IOException{
        readMhs();
        System.out.println(" +++ DELETE DATA MAHASISWA +++");
        System.out.print("Masukan Data Mahasiswa ke-");
        int index = Integer.parseInt(br.readLine());
        // remove == menghapus data dari array list
        mahasiswa.remove(index-1);
    }
}

// CODE PAS PRAKTIKUM

// package praktikumpboa1.pertemuan2;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.*;

// public class Main {

//     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     static ArrayList<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();

//     public static void main(String[] args) throws IOException {
//         while (true) {
//             System.out.println("+++ SIA VERSI LITE +++");
//             System.out.println("1. Create");
//             System.out.println("2. Read");
//             System.out.println("3. Update");
//             System.out.println("4. Delete");
//             System.out.println("5. Exit");
//             System.out.print("Masukan Pilihan :");
//             int pilihan = Integer.parseInt(br.readLine());
//             switch (pilihan) {
//                 case 1:
//                     createMhs(); 
//                     break;
//                 case 2:
//                     readMhs();  
//                     break;
//                 case 3:
//                     editMhs();
//                     break;
//                 case 4:
//                     hapusmhs();  
//                     break;
//                 case 5:
//                     System.exit(0);
//                     break;
//                 default:
//                     System.out.println("Pilihan tidak ada");
//                     break;
//             }
//         }
//     }

//     public static void createMhs() throws IOException{
//         System.out.print("Masukan nama :");
//         String addnama = br.readLine();
//         System.out.print("Masukan nim :");
//         int addnim = Integer.parseInt(br.readLine());
//         System.out.print("Masukan ipk :");
//         double addipk = Double.parseDouble(br.readLine());
//         Mahasiswa mhsBaru = new Mahasiswa(addnama, addnim, addipk);

//         mahasiswa.add(mhsBaru);
//         mhsBaru.registrasi();
//     }
//     public static void readMhs() throws IOException{
//         System.out.println(" DATA Mahasiswa");
//         for (int i = 0; i < mahasiswa.size(); i++){
//             System.out.println("Mahasiswa ke-" + (i+1));
//             System.out.println("Nama Mahasiswa : " + mahasiswa.get(i).nama);
//             System.out.println("NIM Mahasiswa : " + mahasiswa.get(i).nim);
//             System.out.println("IPK Mahasiswa : " + mahasiswa.get(i).ipk);
//             System.out.println("\n");
//         }
//     }
//     // 026
//     public static void editMhs() throws IOException {
//         System.out.print("Masukkan indeks mahasiswa: ");
//         int idx = Integer.parseInt(br.readLine());

//         if(idx <= mahasiswa.size() || idx > 0) {
//             System.out.print("Masukan nama :");
//             String addnama = br.readLine();
//             System.out.print("Masukan nim :");
//             int addnim = Integer.parseInt(br.readLine());
//             System.out.print("Masukan ipk :");
//             double addipk = Double.parseDouble(br.readLine());
//             Mahasiswa mhsBaru = new Mahasiswa(addnama, addnim, addipk);
//             mahasiswa.set(idx - 1, mhsBaru);
            
//             System.out.println("Data berhasil diedit!");
//         }else{
//             System.out.println("Data Tidak ada");
//         }
//     }

//     // 001
//     public static void hapusmhs() throws IOException {
//         System.out.print("Masukkan indeks mahasiswa: ");
//         int idx = Integer.parseInt(br.readLine());

//         if(idx <= mahasiswa.size() || idx > 0) {
//             mahasiswa.remove(idx - 1);
            
//             System.out.println("Data berhasil dihapus!");
//         }else{
//             System.out.println("Data Tidak ada");
//         }
//     }
// }
