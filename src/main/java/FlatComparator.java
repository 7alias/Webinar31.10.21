import java.util.Comparator;

public class FlatComparator implements Comparator<Flat> {

    @Override
    public int compare(Flat o1, Flat o2) {
        int streetComparation = o1.street.compareTo(o2.street);
        if (streetComparation != 0) {
            return streetComparation;
        }
        int houseComparation = o1.house - o2.house;
        if (houseComparation != 0) {
            return houseComparation;
        }
        return o1.flat - o2.flat;
    }
}
