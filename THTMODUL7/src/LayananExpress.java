// Sesuai Soal No 3: Membuat Subclass LayananExpress yang mewarisi LayananEkspedisi.
// Penggunaan keyword 'extends' menunjukkan bahwa Express adalah bentuk khusus dari Ekspedisi.
public class LayananExpress extends LayananEkspedisi {
    
    // Mendefinisikan konstanta tarif dan batas VIP agar kode lebih rapi dan mudah diubah.
    private static final double Tarif_Per_Kg    = 30_000.0;
    private static final double Batas_Nilai_VIP = 1_000_000.0;

    public LayananExpress(String nomorResi, double beratAktualKg, 
                          double panjang, double lebar, double tinggi) {
        // Sesuai Soal No. 1: Memanggil konstruktor superclass untuk menginisialisasi atribut dasar.
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }

    // Sesuai Soal No. 3 : Overriding hitungOngkir() dengan aturan tarif Rp 30.000/Kg.
    // Metode ini secara otomatis menggantikan metode hitungOngkir() milik superclass saat dipanggil.
    @Override
    public double hitungOngkir() {
        // Menghitung ongkir berdasarkan Berat Efektif yang sudah ditentukan di superclass.
        return hitungBeratEfektif() * Tarif_Per_Kg;
    }

    // Sesuai Soal No. 3: Membuat metode spesifik klaimAsuransi(double nilaiBarang).
    // Metode ini hanya ada di kelas Express, sehingga memerlukan Downcasting untuk memanggilnya dari Main.
    public void klaimAsuransi(double nilaiBarang) {
        // Aturan Soal: Jika nilaiBarang > 1.000.000, cetak status "VIP".
        if (nilaiBarang > Batas_Nilai_VIP) {
            System.out.printf(
                "Klaim Asuransi VIP Rp%.0f untuk resi %s sedang diproses prioritas.%n",
                nilaiBarang, nomorResi // Mengakses 'nomorResi' milik superclass karena modifier-nya 'protected'.
            );
        } else {
            // Jika nilai di bawah ambang batas, cetak status standar sesuai instruksi.
            System.out.println("Klaim Asuransi Standar diproses dalam 7 hari kerja.");
        }
    }
}