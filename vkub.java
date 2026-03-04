import java.util.Scanner; // scanner untuk input 

public class vkub { //class
    private final double sisi; //atribut nih //acces modifire privat

    public vkub(double sisi) {
        this.sisi = sisi; 
    }
    public double hitungVolume() { //methode voolume
        return sisi * sisi * sisi;
    }
    public double getSisi() { //methode untuk akses sisi
        return sisi;
    }

    public static void main(String[] args) {
        try (Scanner Input = new Scanner(System.in)) {

            char ulang; 

            do{
            System.out.print("Masukkan panjang sisi kubus: ");
            double sisiInput = Input.nextDouble();
            
            vkub k1 = new vkub(sisiInput); //object 
            
            System.out.println("Volume Kubus adalah: " + k1.hitungVolume());
            System.out.print("Apakah Anda ingin menghitung lagi? (y/n): ");
            ulang = Input.next().charAt(0);
        } while (ulang == 'y' || ulang == 'Y');
    }
}
}
