import java.util.Scanner;

public class tp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.println("\nKALKULATOR");

            System.out.print("Masukkan angka pertama: ");
            double a = input.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double b = input.nextDouble();

            System.out.println("\nPilih operasi:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.print("Pilihan Anda: ");
            int pilihan = input.nextInt();

            double hasil;

            switch (pilihan) {
                case 1:
                    hasil = a + b;
                    System.out.println("Hasil: " + hasil);
                    break;
                case 2:
                    hasil = a - b;
                    System.out.println("Hasil: " + hasil);
                    break;
                case 3:
                    hasil = a * b;
                    System.out.println("Hasil: " + hasil);
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Error: Tidak bisa membagi dengan nol!");
                    } else {
                        hasil = a / b; 
                        System.out.println("Hasil: " + hasil);
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

            System.out.print("\nIngin menghitung lagi? (y/n): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Terima kasih telah menggunakan kalkulator.");
        input.close();
    }
}