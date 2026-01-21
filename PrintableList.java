package lab.generics;

import java.util.Arrays;
import java.util.List;

public class PrintableList<T> {

    private List<T> list;

    // Constructor
    public PrintableList(T[] items) {
        this.list = Arrays.asList(items);
    }

    public List<T> getList() {
        return list;
    }

    public void printList() {
        for (T item : list) {
            System.out.println(item);
        }
    }
}
