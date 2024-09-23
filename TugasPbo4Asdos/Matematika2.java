class Matematika2 extends Matematika {
    public int modulus(int a, int b) {
        if (b != 0) {
            return a % b;
        } else {
            System.out.println("Error: Pembagi tidak boleh nol.");
            return 0;
        }
    }
}