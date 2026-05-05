public class EWallet extends MetodePembayaran {

    // Method Overriding
    @Override
    public void bayar(double nominal) {
        System.out.println("Memotong saldo E-Wallet sebesar Rp" + nominal + "...");
    }

    // Method Overloading - dengan nomor HP
    public void bayar(double nominal, String nomorHp) {
        System.out.println("Memotong saldo E-Wallet sebesar Rp" + nominal + " dari nomor [" + nomorHp + "].");
    }
}