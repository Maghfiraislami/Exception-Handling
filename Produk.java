// Class Produk untuk mendefinisikan produk dengan kode, nama, dan harga
public class Produk {
    protected String kodeBarang; // Kode barang, bisa diakses oleh subclass
    protected String namaBarang; // Nama barang, bisa diakses oleh subclass
    protected double hargaBarang; // Harga barang, bisa diakses oleh subclass

    // Constructor untuk menginisialisasi data produk
    public Produk(String kodeBarang, String namaBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    // Method untuk menampilkan informasi produk
    public String displayInfo() {
        return "Kode: " + kodeBarang + ", Nama:" + namaBarang + ", Harga:" + hargaBarang;
    }
}
