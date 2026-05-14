// Sesuai Soal No. 4: Membuat Subclass LayananInternasional yang mewarisi LayananEkspedisi.
public class LayananInternasional extends LayananEkspedisi {
    // Sesuai Soal No. 4 : Menambahkan atribut tambahan negaraTujuan dan nilaiBarangUSD.
    private String negaraTujuan;
    private double nilaiBarangUSD;

    public LayananInternasional(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi, String negaraTujuan, double nilaiBarangUSD) {
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
        this.negaraTujuan = negaraTujuan;
        this.nilaiBarangUSD = nilaiBarangUSD;
    }

    // Sesuai Soal No. 4: Overriding hitungOngkir() dengan aturan tarif dasar Rp 200.000/kg.
    @Override
    public double hitungOngkir() {
        double ongkirDasar = hitungBeratEfektif() * 200_000.0;
        
        // Aturan Pajak Bea Cukai: Jika nilai Barang USD lebih dari 50 USD, 
        // dikenakan pajak sebesar 20% dari nilai ongkir dasar.
        if (nilaiBarangUSD > 50.0) {
            // Mengembalikan total dari ongkir dasar ditambah perhitungan pajak.
            return ongkirDasar + (ongkirDasar * 0.20);
        }
        return ongkirDasar;
    }

    // Sesuai Soal No. 4: Metode spesifik cetakManifest() untuk menampilkan 
    // deklarasi nilai barang ke negara tujuan.
    public void cetakManifest() {
        System.out.printf("Manifest Internasional ke %s - Deklarasi Nilai: $%.2f%n", negaraTujuan, nilaiBarangUSD);
    }
}