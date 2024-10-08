public class Bicycle extends Light{
    boolean salsela;

    @Override
    public String toString() {
        return "Bicycle{" +
                "salsela=" + salsela +
                '}';
    }

    public boolean isSalsela() {
        return salsela;
    }

    public void setSalsela(boolean salsela) {
        this.salsela = salsela;
    }
}
