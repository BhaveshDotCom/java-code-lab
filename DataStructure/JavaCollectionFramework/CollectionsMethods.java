package DataStructure.JavaCollectionFramework;
import java.util.*;

public class CollectionsMethods {
    public static void main(String[] args) {
        Collection<Integer> col = new ArrayList<>();
        col.add(1);
        System.out.println(col.isEmpty());

        ArrayList<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5));

        Iterator<Integer> it = arr.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        IO.println(Math.max(11, 10));

        
        
    }

}