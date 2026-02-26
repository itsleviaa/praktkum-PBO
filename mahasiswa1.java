public class mahasiswa1 {
    
    // Atribut
    private String nim;
    private String nama;
    private double nilai_afektif;
    private double nilai_tugas;
    private double nilai_uts;
    private double nilai_sikap;
    private double nilai_uas;
    
    // Constructor
    public mahasiswa1(String nim, String nama, double nilai_afektif,
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
        double NA = (nilai_afektif * 0.15) +
                    (nilai_tugas * 0.25) +
                    (nilai_uts * 0.30) +
                    (nilai_sikap * 0.10) +
                    (nilai_uas * 0.30);
        return NA;
    }
    
    // Method konversi nilai angka ke huruf
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
    
    // Method menentukan kelulusan
    public boolean isLulus() {
        String huruf = konv_nilai();
        return huruf.equals("A") || huruf.equals("B+") || huruf.equals("B")
                || huruf.equals("C+") || huruf.equals("C");
    }
    
    // Method menampilkan data
    public void tampilData() {
        System.out.println("NIM          : " + nim);
        System.out.println("Nama         : " + nama);
        System.out.println("Nilai Akhir  : " + nilai_akhir());
        System.out.println("Nilai Huruf  : " + konv_nilai());
        System.out.println("Keterangan   : " + (isLulus() ? "LULUS" : "TIDAK LULUS"));
    }
    
    // Main method (Setting Manual Sesuai Soal)
    public static void main(String[] args) {
        
        mahasiswa1 mhs = new mahasiswa1(
            "210631100080",     // GANTI dengan NIM kamu
            "Levi Putra",       // GANTI dengan nama kamu
            80,                 // nilai afektif
            95,                 // nilai tugas
            80,                 // nilai uts
            90,                 // nilai sikap
            95                  // nilai uas
        );
        
        mhs.tampilData();
    }
}