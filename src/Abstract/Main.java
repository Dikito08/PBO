package Abstract;


public class Main {
    public static void main(String[] args) {
        Minuman kopi = new Kopi("Hitam", 3000);
        kopi.toString();
        Minuman susu = new Susu("Putih", "Manis");
        susu.toString();
    }
}
