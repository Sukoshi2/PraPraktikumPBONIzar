package Pertemuan3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();

    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("+++ SIA VERSI LITE +++");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Masukan Pilihan :");
            int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1:
                    createMhs(); 
                    break;
                case 2:
                    readMhs();  
                    break;
                case 3:
                    editMhs();
                    break;
                case 4:
                    hapusmhs();  
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        }
    }

    public static void createMhs() throws IOException{
        System.out.print("Masukan nama :");
        String addnama = br.readLine();
        System.out.print("Masukan nim :");
        int addnim = Integer.parseInt(br.readLine());
        System.out.print("Masukan ipk :");
        double addipk = Double.parseDouble(br.readLine());
        Mahasiswa mhsBaru = new Mahasiswa(addnama, addnim, addipk);

        mahasiswa.add(mhsBaru);
        mhsBaru.registrasi();
    }

    // BISA JADI POIN, 
    // PAKE GETTER UNTUK MENGAMBIL DATA / ENCAPSULATION
    public static void readMhs() throws IOException{
        System.out.println(" DATA Mahasiswa");
        for (int i = 0; i < mahasiswa.size(); i++){
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.println("Nama Mahasiswa : " + mahasiswa.get(i).getNama());
            System.out.println("NIM Mahasiswa : " + mahasiswa.get(i).getNim());
            System.out.println("IPK Mahasiswa : " + mahasiswa.get(i).getIpk());
            System.out.println("\n");
        }
    }
    // 026

    // UNTUK EDIT MAHASISWA MODE ENCAPSULATION JADI POIN LAGI
    // KUNCI JAWABANNYA PAKE SETTER

    public static void editMhs() throws IOException {
        System.out.print("Masukkan indeks mahasiswa: ");
        int idx = Integer.parseInt(br.readLine());

        if(idx <= mahasiswa.size() || idx > 0) {
            System.out.print("Masukan nama :");
            String addnama = br.readLine();
            mahasiswa.get(idx-1).setNama(addnama);
            System.out.print("Masukan nim :");
            int addnim = Integer.parseInt(br.readLine());
            mahasiswa.get(idx-1).setNim(addnim);
            System.out.print("Masukan ipk :");
            double addipk = Double.parseDouble(br.readLine());
            mahasiswa.get(idx-1).setIpk(addipk);
            
            System.out.println("Data berhasil diedit!");
        }else{
            System.out.println("Data Tidak ada");
        }
    }

    // 001
    public static void hapusmhs() throws IOException {
        System.out.print("Masukkan indeks mahasiswa: ");
        int idx = Integer.parseInt(br.readLine());

        if(idx <= mahasiswa.size() || idx > 0) {
            mahasiswa.remove(idx - 1);
            
            System.out.println("Data berhasil dihapus!");
        }else{
            System.out.println("Data Tidak ada");
        }
    }
}
