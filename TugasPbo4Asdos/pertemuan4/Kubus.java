
class Kubus implements Shape3D {

    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double volume() {
        return Math.pow(sisi, 3);
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(sisi, 2);
    }
}
