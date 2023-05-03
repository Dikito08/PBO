package Abstract;

public class Kopi extends Minuman{
    int harga;

    public Kopi(String warna, int harga) {
        super(warna);
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "ini adalah kopi berwarna " + super.getWarna() + " dan harganya adalah " + harga;
    }
}
