public class Main {
    public static void main(String[] args)
    {
        Vehicle vehicle = new Vehicle("Cambodian","BMW",2023,60000);
        Car car = new Car("Cambodian","BMW",2023,60000,6);
        // Output
        System.out.println(vehicle.toString());
        System.out.println(car.toString());
    }
}
