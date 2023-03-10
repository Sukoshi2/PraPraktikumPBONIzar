package Pertemuan3;

public class Mahasiswa {
    // property
    private String nama;
    private int nim;
    private double ipk;
    
    // constructor || ini juga digunakan untuk bisa menghubungan objek dan arraylist biar enak dipanggil
    public Mahasiswa(String nama, int nim, double ipk){
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    // setter & getter
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
    public int getNim() {
        return nim;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    public double getIpk() {
        return ipk;
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
        System.out.println("IPK Kamu " + this.ipk);
        System.out.println("Telah terupdate di SIA Versi Lite");
    }
}
