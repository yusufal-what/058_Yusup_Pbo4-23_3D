
class Balok implements Shape3D {

    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public double surfaceArea() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}
