import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<PerangkatPintar> daftarPerangkat = new ArrayList<>();
        daftarPerangkat.add(new LampuPintar());
        daftarPerangkat.add(new AcPintar());

        for (PerangkatPintar perangkat : daftarPerangkat) {
            perangkat.aktifkan();

            if (perangkat instanceof LampuPintar) {
                LampuPintar lampu = (LampuPintar) perangkat;
                lampu.aturKecerahan(75);
                lampu.aturKecerahan(80, "Putih Hangat");
            }

            if (perangkat instanceof AcPintar) {
                AcPintar ac = (AcPintar) perangkat;
                ac.aturSuhu(20);
            }
        }
        System.out.println(" Perbaikan Soal 5 ");
        PerangkatPintar alat1 = new LampuPintar();
        
        if (alat1 instanceof LampuPintar) {
            LampuPintar lampuAlat1 = (LampuPintar) alat1;
            lampuAlat1.aturKecerahan(75, "Putih");
        }
    }
}

// Tugas Analisi 

// Nomer 3 
// Kaeba konsep dari palomorfismes dan dynamic method dispatch, saat compile ajva emang melihat referensi ( perangkat pintar ) tapi saat runtime dia akan melihat objek yang sebenarnya ( lampu pintar ) jadi method yang di override di lampu pintar lah yang akan dijalankan


// Nomer 5 
// Penyebab dari eror itu adalah karena java hanya melihat tipe referensi variable ( PerangkatPintar) di dalame class PerangkatPintar
// tidak ada method bernama aturkecearahan. java  tidak penduli bahwa objel sebenearnya adalah lampupintar. makannya kompitaor menolak kode nya 
//untuk kita perbaiki kita harus melakukan downcasting dengan mengubah tipde referensi menjadi lampupintar agar java bisa melihat method atur kecerahan yang ada di lampupintar. dengan melakukan downcasting kita bisa mengakses method yang spesifik untuk lampupintar meskipun referensi awalnya adalah perangkat pintar.
// dan bisa mengugnakan operator instanceof untuk memastikan bahwa objek tersebut benar-benar merupakan instance dari lampupintar sebelum melakukan downcasting untuk menghindari potensi eror pada runtime. 