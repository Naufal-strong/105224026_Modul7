import java.util.ArrayList;
import java.util.List;

// Superclass (tanpa public)
class PerangkatPintar {
    public void aktifkan() {
        System.out.println("Perangkat pintar diaktifkan.");
    }
}

// Subclass 1: LampuPintar (tanpa public)
class LampuPintar extends PerangkatPintar {
    @Override
    public void aktifkan() {
        System.out.println("Lampu menyala dengan tingkat kecerahan standar.");
    }

    public void aturKecerahan(int level) {
        System.out.println("Kecerahan lampu diatur ke level " + level + "%.");
    }

    public void aturKecerahan(int level, String warna) {
        System.out.println("Kecerahan lampu diatur ke level " + level + "% dengan warna cahaya " + warna + ".");
    }
}

// Subclass 2: AcPintar (tanpa public)
class AcPintar extends PerangkatPintar {
    @Override
    public void aktifkan() {
        System.out.println("AC menyala dan mulai mendinginkan ruangan.");
    }

    public void aturSuhu(int suhu) {
        System.out.println("Suhu ruangan diatur menjadi " + suhu + " derajat.");
    }
}