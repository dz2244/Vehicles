public class Light extends Vehicles{
    boolean engine;

    @Override
    public String toString() {
        return "Light{" +
                "engine=" + engine +
                '}';
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }
}
