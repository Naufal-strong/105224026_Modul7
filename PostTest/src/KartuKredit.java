public class KartuKredit extends MetodePembayaran {

    // Method Overriding
    @Override
    public void bayar(double nominal) {
        System.out.println("Mencetak tagihan Kartu Kredit sebesar Rp" + nominal + "..");
    }

    // Metode spesifik (bukan bawaan induk)
    public void verifikasiPIN() {
        System.out.println("Memverifikasi PIN Kartu Kredit. BERHASIL!");
    }
}