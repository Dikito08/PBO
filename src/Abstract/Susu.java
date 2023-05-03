package Abstract;


public class Susu extends Minuman{
    String rasa;

    public Susu(String warna, String rasa) {
        super(warna);
        this.rasa = rasa;
    }

    @Override
    public String toString() {
        return "ini adalah Susu berwarna " + super.getWarna() + " dan rasanya " + rasa;
    }
}
