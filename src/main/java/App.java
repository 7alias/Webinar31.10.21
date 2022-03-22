import java.util.Comparator;
import java.util.TreeSet;

public class App {


    public static void main(String[] args) {

        //StringComparator stringComparator = new StringComparator();



        Comparator<String> anonStringComparator = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };


        Comparator<String> lStringComp = (String o1, String o2) -> o1.length() - o2.length();
        Comparator<String> mrStringCompSmall = Comparator.comparingInt((o)->o.length());
        Comparator<String> mrStringCompSmaller = Comparator.comparingInt(String::length);



        //TreeSet<String> strings = new TreeSet<>(anonStringComparator);

        TreeSet<Flat> flats  = new TreeSet<>(new FlatComparator());
        flats.add(new Flat("Sever", 1 , 1));
        flats.add(new Flat("Sever", 1 , 1));
        flats.add(new Flat("North", 2 , 2));
flats.forEach(System.out::println);

    }
}
