public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 mtk = new Matematika2();

        int a = 10;
        int b = 5;

        System.out.println("Penjumlahan: " + mtk.tambah(a, b));
        System.out.println("Pengurangan: " + mtk.kurang(a, b));
        System.out.println("Perkalian: " + mtk.kali(a, b));
        System.out.println("Pembagian: " + mtk.bagi(a, b));
        System.out.println("Modulus: " + mtk.modulus(a, b));
    }
}