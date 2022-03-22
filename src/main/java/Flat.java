public class Flat {
    String street;
    int house;
    int flat;


    public Flat(String street, int house, int flat) {
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "street='" + street + '\'' +
                ", house=" + house +
                ", flat=" + flat +
                '}';
    }
}
