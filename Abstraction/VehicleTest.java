public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.startEngine();
        v1.stopEngine();

        v2.startEngine();
        v2.stopEngine();
    }
}
