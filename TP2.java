public class TP2 {

    // Java Modifiers
    private final String productName;
    private final double price;
    private int stock;
    public static final String STORE_NAME = "Gadget Store";

    // Constructor
    public TP2(String productName, double price, int stock) {
        this.productName = productName; // penggunaan this
        this.price = price;
        this.stock = stock;
    }

    // Method untuk menampilkan informasi produk
    public void displayProduct() {
        System.out.println("Store: " + STORE_NAME);
        System.out.println("Product Name: " + this.productName);
        System.out.println("Price: $" + this.price);
        System.out.println("Stock: " + this.stock);
    }

    // Method untuk membeli produk
    public void buyProduct(int quantity) {
        if (quantity <= stock) {
            this.stock -= quantity;
            System.out.println("Purchase successful! Remaining stock: " + this.stock);
        } else {
            System.out.println("Stock not enough!");
        }
    }

    // Main method
    public static void main(String[] args) {

        // Membuat objek menggunakan constructor
        TP2 p1 = new TP2("Laptop", 800.0, 10);

        // Menampilkan informasi produk
        p1.displayProduct();

        System.out.println("-------------------");

        // Simulasi membeli produk
        p1.buyProduct(3);

        System.out.println("-------------------");

        // Menampilkan data setelah pembelian
        p1.displayProduct();
    }
}