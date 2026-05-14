import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Sesuai Soal No. 5: Membuat ArrayList bertipe LayananEkspedisi.
        // Ini adalah implementasi Upcasting, di mana objek subclass disimpan dalam referensi superclass.
        ArrayList<LayananEkspedisi> daftarLayanan = new ArrayList<>();

        // Sesuai Soal No. 5: Menambahkan data simulasi sesuai instruksi soal.
        // Reguler: Resi "REG-11", dimensi besar akan memicu perhitungan volumetrik (20.83 kg).
        daftarLayanan.add(new LayananReguler("REG-11", 2, 50, 50, 50)); 
        daftarLayanan.add(new LayananExpress("EXP-22", 5, 10, 10, 10)); 
        daftarLayanan.add(new LayananInternasional("INT-33", 3, 20, 20, 20, "Korea", 100)); 

        // Sesuai Soal No. 5: Membuat variabel totalPendapatan Perusahaan untuk akumulasi biaya.
        double totalPendapatanPerusahaan = 0.0;

        // Sesuai Soal No. 5: Menggunakan perulangan (for-each) untuk menelusuri isi koleksi.
        for (LayananEkspedisi layanan : daftarLayanan) {
            // Panggil cetakResi() untuk setiap objek dalam list.
            layanan.cetakResi();

            // Menjumlahkan hasil hitungOngkir() tanpa parameter ke variabel total pendapatan.
            // Di sini terjadi polimorfisme, di mana metode yang dipanggil sesuai dengan instans aslinya.
            totalPendapatanPerusahaan += layanan.hitungOngkir();

            // Sesuai Soal No. 5: Menggunakan instanceof dan Downcasting untuk menjalankan metode spesifik.
            if (layanan instanceof LayananReguler reguler) {
                // Jika objek adalah Reguler: panggil metode overload hitungOngkir(true, 25) dan tampilkan harganya.
                System.out.printf("[Reguler] Ongkir Member: Rp%.2f%n", reguler.hitungOngkir(true, 25));

            } else if (layanan instanceof LayananExpress express) {
                // Jika objek adalah Express: panggil metode spesifik klaimAsuransi(1500000).
                express.klaimAsuransi(1_500_000);

            } else if (layanan instanceof LayananInternasional internasional) {
                // Jika objek adalah Internasional: panggil metode spesifik cetakManifest().
                internasional.cetakManifest();
            }
            System.out.println();
        }
        
        // Sesuai Soal No. 5: Di akhir program, mencetak total pendapatan keseluruhan perusahaan.
        System.out.printf("TOTAL PENDAPATAN PERUSAHAAN : Rp%.2f%n", totalPendapatanPerusahaan);
    }
}