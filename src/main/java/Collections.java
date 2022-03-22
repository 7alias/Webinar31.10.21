import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {
    public static void main(String[] args) {

        List<String> toDoList = new ArrayList<>();
        toDoList.add("Write code");
        toDoList.add("Cook");
        Iterator<String> stringListIterator = toDoList.listIterator();
        while (stringListIterator.hasNext()) {
            System.out.println((stringListIterator.next()));
            stringListIterator.remove();
        }
        for (String listItem : toDoList) {
            toDoList.add("Do smth");
            System.out.println(listItem);
        }

    }
}

