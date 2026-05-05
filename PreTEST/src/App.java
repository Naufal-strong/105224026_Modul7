public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Car(); // Upcasting
        
        myVehicle.speedUp();
        
        if (myVehicle instanceof Car) {
            Car myCar = (Car) myVehicle; // Downcasting
            myCar.drift(); // Sekarang drift() bisa dipanggil
        }
    }
}