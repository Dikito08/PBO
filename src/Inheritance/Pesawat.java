package Inheritance;

public class Pesawat extends Kendaraan{
    public Pesawat (int roda, int penumpang, String tipe) {
        super(roda, penumpang, tipe);
    }

    public void terbang() {
        System.out.println("Pesawat Terbang");
    }
}
