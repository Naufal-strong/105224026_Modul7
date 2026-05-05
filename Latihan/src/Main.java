import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Soal 3: Koleksi menggunakan ArrayList
        ArrayList<PerangkatPintar> daftarPerangkat = new ArrayList<>();

        // Memasukkan objek ke dalam koleksi menggunakan Upcasting
        daftarPerangkat.add(new LampuPintar());
        daftarPerangkat.add(new AcPintar());

        // Perulangan untuk menelusuri koleksi (Soal 3 & 4)
        for (PerangkatPintar perangkat : daftarPerangkat) {
            perangkat.aktifkan();

            // Pengecekan tipe dan downcasting untuk LampuPintar
            if (perangkat instanceof LampuPintar) {
                LampuPintar lampu = (LampuPintar) perangkat;
                lampu.aturKecerahan(75);
                lampu.aturKecerahan(80, "Putih Hangat");
            }

            // Pengecekan tipe dan downcasting untuk AcPintar
            if (perangkat instanceof AcPintar) {
                AcPintar ac = (AcPintar) perangkat;
                ac.aturSuhu(20);
            }

            System.out.println("----------------------------------------");
        }

        // Soal 5: Perbaikan baris kode
        System.out.println("--- Perbaikan Soal 5 ---");
        PerangkatPintar alat1 = new LampuPintar();
        
        if (alat1 instanceof LampuPintar) {
            LampuPintar lampuAlat1 = (LampuPintar) alat1;
            lampuAlat1.aturKecerahan(75, "Putih");
        }
    }
}