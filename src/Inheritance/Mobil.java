package Inheritance;

public class Mobil extends Kendaraan {
    public Mobil (int roda, int penumpang, String tipe) {
        super(roda, penumpang, tipe);
    }

    public void berangkat() {
        System.out.println("Mobil Berangkat");
    }
}
