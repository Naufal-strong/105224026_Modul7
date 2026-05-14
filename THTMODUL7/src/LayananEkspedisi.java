public class LayananEkspedisi {
    // Pada 1 kita di suuruh Menggunakan access modifier 'protected' agar atribut 
    // nomorResi, berat, dan dimensi dapat diwariskan dan diakses langsung oleh subclass (Reguler/Express/INT).
    // Penggunaan tipe data 'double' dipilih karena berat dan dimensi seringkali memiliki nilai desimal.
    protected String nomorResi;
    protected double beratAktualKg;
    protected double panjang, lebar, tinggi;

    // pada Soal No 1: Membuat konstruktor untuk menginisialisasi semua atribut di atas.
    // Kata kunci 'this' digunakan untuk merujuk pada atribut kelas guna menghindari shadowing dengan parameter.
    public LayananEkspedisi(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) {
        this.nomorResi = nomorResi;
        this.beratAktualKg = beratAktualKg;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Sesuai Soal No 1 : Membuat metode hitungBeratEfektif() untuk mengembalikan nilai tertinggi 
    // antara berat aktual dan berat volumetrik. Hal ini penting untuk akurasi biaya logistik.
    // Rumus volumetrik yang digunakan sesuai instruksi adalah (P x L x T) / 6000.
    public double hitungBeratEfektif() {
        double beratVolumetrik = (panjang * lebar * tinggi) / 6000.0;
        // Math.max digunakan untuk membandingkan dan mengambil nilai terbesar secara efisien.
        return Math.max(beratAktualKg, beratVolumetrik);
    }

    // Sesuai Soal No 1: Membuat metode void cetakResi() untuk menampilkan nomor resi 
    // dan Berat Efektif ke konsol. Menggunakan format printf agar tampilan desimal lebih rapi.
    public void cetakResi() {
        System.out.println("============");
        System.out.println("Nomor Resi     : " + nomorResi);
        System.out.printf ("Berat Efektif  : %.2f Kg%n", hitungBeratEfektif());// menggunakan  %.2f Kg%n untuk menampilkan berat efektif dengan 2 angka desimal diikuti dengan satuan Kg dan pindah baris.  
        System.out.println("============");
    }

    // Sesuai Soal No  1: Membuat metode polymorphic hitungOngkir() yang mengembalikan 0.0.
    // Metode ini dipersiapkan sebagai kontrak yang akan di-override secara spesifik oleh kelas turunan.
    public double hitungOngkir() {
        return 0.0;
    }
}