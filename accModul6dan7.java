
public class accModul6dan7 {

    static double luasLingkaran(double phi, int r) {
        return (phi * (r * r));
    }

    public static void main(String[] args) {
        double phi = 3.14;
        int r = 19;
        System.out.println("=====================================");
        System.out.println("hasil dari perhitungan luas lingkaran");
        System.out.println("=====================================");
        System.out.println("phi = " + phi);
        System.out.println("r = " + r);
        System.out.println("=====================================");
        System.out.println("hasil = " + luasLingkaran(phi, r));
        System.out.println("=====================================");

    }

}
