package Abstract;


public abstract class Minuman{
    String warna;

    public abstract String toString();

    public Minuman(String warna) {
        this.warna = warna;
    }
     public String getWarna() {
        return warna;
     }
}