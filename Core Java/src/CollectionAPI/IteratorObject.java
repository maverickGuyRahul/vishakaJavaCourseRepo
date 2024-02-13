package CollectionAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorObject {
    public static void main(String[] args) {
        List<String> library = new ArrayList<>();
        library.add("Book1");
        library.add("Book2");
        library.add("Book3");
        library.add("Book4");
        library.add("Book5");
        library.add("Book6");

        Iterator<String> librarian = library.iterator();

        while (librarian.hasNext()) {
            String book = librarian.next();
            System.out.println(book);
        }
    }

}
