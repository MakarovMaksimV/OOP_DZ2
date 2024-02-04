package veterinaryClinic.illness;

public class Illness {
    String ill;

    public Illness(String title) {
        this.ill = title;
    }

    @Override
    public String toString() {
        return ill;
    }
}
