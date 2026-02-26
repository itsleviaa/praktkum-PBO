import java.util.Scanner;

public class mahasiswa2 {
    
    // Atribut
    private String nim;
    private String nama;
    private double nilai_afektif;
    private double nilai_tugas;
    private double nilai_uts;
    private double nilai_sikap;
    private double nilai_uas;
    
    // Constructor
    public mahasiswa2(String nim, String nama, double nilai_afektif,
                     double nilai_tugas, double nilai_uts,
                     double nilai_sikap, double nilai_uas) {
        this.nim = nim;
        this.nama = nama;
        this.nilai_afektif = nilai_afektif;
        this.nilai_tugas = nilai_tugas;
        this.nilai_uts = nilai_uts;
        this.nilai_sikap = nilai_sikap;
        this.nilai_uas = nilai_uas;
    }
    
    // Method menghitung nilai akhir
    public double nilai_akhir() {
        return (nilai_afektif * 0.15) +
               (nilai_tugas * 0.25) +
               (nilai_uts * 0.30) +
               (nilai_sikap * 0.10) +
               (nilai_uas * 0.30);
    }
    
    // Method konversi nilai huruf
    public String konv_nilai() {
        double NA = nilai_akhir();
        
        if (NA >= 80) return "A";
        else if (NA >= 75) return "B+";
        else if (NA >= 70) return "B";
        else if (NA >= 65) return "C+";
        else if (NA >= 60) return "C";
        else if (NA >= 55) return "D+";
        else if (NA >= 30) return "D";
        else return "E";
    }
    
    // Method cek kelulusan
    public boolean isLulus() {
        String huruf = konv_nilai();
        return huruf.equals("A") || huruf.equals("B+") || huruf.equals("B")
                || huruf.equals("C+") || huruf.equals("C");
    }
    
    // Method tampil data
    public void tampilData() {
        System.out.println("\n===== HASIL DATA MAHASISWA =====");
        System.out.println("NIM          : " + nim);
        System.out.println("Nama         : " + nama);
        System.out.println("Nilai Akhir  : " + nilai_akhir());
        System.out.println("Nilai Huruf  : " + konv_nilai());
        System.out.println("Keterangan   : " + (isLulus() ? "LULUS" : "TIDAK LULUS"));
    }
    
    // Main method (Input User)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan NIM           : ");
        String nim = input.nextLine();
        
        System.out.print("Masukkan Nama          : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Nilai Afektif : ");
        double afektif = input.nextDouble();
        
        System.out.print("Masukkan Nilai Tugas   : ");
        double tugas = input.nextDouble();
        
        System.out.print("Masukkan Nilai UTS     : ");
        double uts = input.nextDouble();
        
        System.out.print("Masukkan Nilai Sikap   : ");
        double sikap = input.nextDouble();
        
        System.out.print("Masukkan Nilai UAS     : ");
        double uas = input.nextDouble();
        
        // Buat object
        mahasiswa2 mhs = new mahasiswa2(nim, nama, afektif, tugas, uts, sikap, uas);
        
        // Tampilkan hasil
        mhs.tampilData();
        
        input.close();
    }
}