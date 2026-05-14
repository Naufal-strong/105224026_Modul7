// Sesuai Soal No. 2: Membuat Subclass Layanan Reguler yang mewarisi (extends) LayananEkspedisi.
public class LayananReguler extends LayananEkspedisi {
    // Mendefinisikan konstanta tarif agar kode lebih mudah dikelola (maintainable).
    private static final double Tarif_Per_Kg = 15_000.0;

    public LayananReguler(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) {
        // Memanggil konstruktor superclass menggunakan super() untuk efisiensi inisialisasi data.
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }

    // Sesuai Soal No. 2 : Melakukan Overriding pada metode hitungOngkir().
    // Aturan: Tarif dasar adalah Rp 15.000 per Kg dikalikan dengan Berat Efektif.
    @Override
    public double hitungOngkir() {
        return hitungBeratEfektif() * Tarif_Per_Kg;
    }

    // Sesuai Soal No. 2 : Melakukan Overloading dengan membuat metode 
    // double hitungOngkir(boolean isMember, int jarakKm) untuk skenario diskon dan jarak.
    public double hitungOngkir(boolean isMember, int jarakKm) {
        // Memanggil metode hitungOngkir() versi override di atas sebagai basis tarif awal.
        double tarifDasar = hitungOngkir();

        // Aturan: Jika isMember bernilai true, berikan diskon 10% dari tarif dasar.
        if (isMember) {
            tarifDasar -= tarifDasar * 0.10;
        }

        // Aturan: Setelah diskon, tambahkan surcharge jarak jauh sebesar Rp 500 per jarakKm.
        // Hal ini menunjukkan kombinasi antara diskon persentase dan biaya tambahan tetap.
        return tarifDasar + (jarakKm * 500.0);
    }
}