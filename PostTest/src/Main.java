import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<MetodePembayaran> daftarPembayaran = new ArrayList<>();

        daftarPembayaran.add(new EWallet());       // Upcasting
        daftarPembayaran.add(new KartuKredit());   // Upcasting

        System.out.println("Proses Pembayaran via Payment Gateway ");
        for (MetodePembayaran metode : daftarPembayaran) {

            metode.bayar(120000); // Runtime Polymorphism

            if (metode instanceof EWallet) {
                EWallet ew = (EWallet) metode; // Downcasting
                ew.bayar(120000, "08576292389");
            }

            if (metode instanceof KartuKredit) {
                KartuKredit kk = (KartuKredit) metode; // Downcasting
                kk.verifikasiPIN();
            }

        }
    }
}