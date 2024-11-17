import java.util.Scanner;

// Main class untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner untuk membaca input dari pengguna

        try {
            // Input data transaksi dari pengguna
            System.out.println("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine();

            System.out.println("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            System.out.println("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.println("Masukkan Harga Barang: ");
            double hargaBarang = Double.parseDouble(scanner.nextLine()); // Parsing harga barang menjadi double

            System.out.println("Masukkan Jumlah Beli: ");
            int jumlahBeli = Integer.parseInt(scanner.nextLine()); // Parsing jumlah beli menjadi integer

            // Membuat objek transaksi berdasarkan input pengguna
            Transaksi transaksi = new Transaksi(kodeBarang, namaBarang, hargaBarang, noFaktur, jumlahBeli);
            transaksi.hitungTotal(); // Menghitung total harga

            // Menampilkan faktur
            System.out.println("\n--- Faktur Pembelian ---");
            System.out.println(transaksi.displayInvoice());

        } catch (NumberFormatException e) {
            // Exception handling untuk input yang salah (misalnya bukan angka untuk harga atau jumlah beli)
            System.out.println("Input salah! Pastikan harga barang adalah angka dan jumlah beli adalah bilangan bulat");
        } finally {
            scanner.close(); // Menutup scanner setelah program selesai
        }
    }
}
