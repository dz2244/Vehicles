public class Tractor extends Heavy{
    String type;

    @Override
    public String toString() {
        return "Tractor{" +
                "type='" + type + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
