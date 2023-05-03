package Inheritance;

public class Kendaraan {
    private int roda;
    private int penumpang;
    private String tipe;

    public Kendaraan (int roda, int penumpang, String tipe) {
        this.roda = roda;
        this.penumpang = penumpang;
        this.tipe = tipe;
    }

    public int getroda() {
        return roda;
    }

    public int getpenumpang() {
        return penumpang;
    }
    public String gettipe() {
        return tipe;
    }

    public void berangkat() {
        System.out.println("Kendaraan berangkat");
    }
}