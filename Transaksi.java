// Class Transaksi yang merupakan turunan dari class Produk untuk menangani transaksi pembelian
public class Transaksi extends Produk {
    private String noFaktur; // Nomor faktur untuk transaksi
    private int jumlahBeli; // Jumlah barang yang dibeli
    private double total; // Total harga yang dihitung

    // Constructor untuk inisialisasi transaksi, menerima kode, nama, harga barang, nomor faktur, dan jumlah beli
    public Transaksi (String kodeBarang, String namaBarang, double hargaBarang, String noFaktur, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang); // Menggunakan constructor superclass (Produk) untuk menginisialisasi barang
        this.noFaktur = noFaktur;
        this.jumlahBeli = jumlahBeli;
        this.total = 0; // Inisialisasi total menjadi 0
    }

    // Method untuk menghitung total harga transaksi
    public void hitungTotal() {
        try {
            // Exception handling untuk memeriksa jika harga atau jumlah beli bernilai negatif
            if (jumlahBeli < 0 || hargaBarang < 0){
                throw new IllegalArgumentException("Jumlah beli dan harga barang harus bernilai positif."); // Melempar exception jika kondisi tidak valid
            }
            total = jumlahBeli * hargaBarang; // Menghitung total harga
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()); // Menangani exception dan menampilkan pesan error
            total = 0; // Jika ada error, total diset menjadi 0
        }
    }

    // Method untuk menampilkan faktur pembelian
    public String displayInvoice() {
        return "No Faktur: " + noFaktur + "\n"
                + displayInfo() + "\n" // Memanggil method displayInfo() dari superclass Produk
                + "Jumlah Beli: " + jumlahBeli + "\n"
                + "Total: " + total;
    }
}
