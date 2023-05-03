package Inheritance;

public class Main {
    public static void main(String[] args) {
        Mobil m1 = new Mobil(2, 5, "Darat");
        System.out.println("Mobil mempunyai" + m1.getroda() + " roda");
        System.out.println("Bisa menanmpung " + m1.getpenumpang() + " penumpang");
        System.out.println("Merupakan kendaraan yang beroperasi di" + m1.gettipe());
        m1.berangkat();
        System.out.println();

        Kapal k1 = new Kapal(0, 5, "laut");
        System.out.println("Kapal mempunyai" + k1.getroda() + "roda");
        System.out.println("Bisa menanmpung " + k1.getpenumpang() + " penumpang");
        System.out.println("Merupakan kendaraan yang beroperasi di" + k1.gettipe());
        k1.berangkat();
        k1.berlayar();
        System.out.println();

        Pesawat p1 = new Pesawat(2, 50, "udara");
        System.out.println("Kapal mempunyai" + p1.getroda() + "roda");
        System.out.println("Bisa menanmpung " + p1.getpenumpang() + " penumpang");
        System.out.println("Merupakan kendaraan yang beroperasi di" + p1.gettipe());
        k1.berangkat();
        k1.berlayar();
    }
}
