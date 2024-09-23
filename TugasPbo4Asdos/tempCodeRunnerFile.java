public class Main {

    public static void main(String[] args) {
        Shape3D kubus = new Kubus(3);
        Shape3D balok = new Balok(4, 5, 6);

        System.out.println("Kubus:");
        System.out.println("Volume: " + kubus.volume());
        System.out.println("Luas Permukaan: " + kubus.surfaceArea());

        System.out.println("\nBalok:");
        System.out.println("Volume: " + balok.volume());
        System.out.println("Luas Permukaan: " + balok.surfaceArea());
    }
}