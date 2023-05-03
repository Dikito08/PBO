package Inheritance;

public class Kapal extends Kendaraan{
    public Kapal(int roda, int penumpang, String tipe) {
        super(roda, penumpang, tipe);
    }

    public void berlayar() {
        System.out.println("kapal berlayar");
    }
}
