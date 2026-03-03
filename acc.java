import java.util.Scanner;

public class acc {
    private final double sisi;

    public acc(double sisi) {
        this.sisi = sisi;
    }
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }
    public double getSisi() {
        return sisi;
    }

    public static void main(String[] args) {
        try (Scanner Input = new Scanner(System.in)) {
            System.out.print("Masukkan panjang sisi kubus: ");
            double sisiInput = Input.nextDouble();
            
            acc k1 = new acc(sisiInput);
            
            System.out.println("Volume Kubus adalah: " + k1.hitungVolume());
        }
    }
}