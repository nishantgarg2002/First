import java.util.function.Predicate;
import java.util.*;
 
class GFG {
    public static <T> List<T>
    removeNullUsingIterator(List<T> l, Predicate<T> p)
    {
        Iterator<T> itr = l.iterator();
        while (itr.hasNext()) {
            T t = itr.next();
            if (!p.test(t)) {
                itr.remove();
            }
        }
        return l;
    }
 
    public static void main(String[] args)
    {
 
        List<String> l = new ArrayList<>(
               Arrays.asList("Geeks",
                             null,
                             "forGeeks",
                             null,
                             "A computer portal"));
        System.out.println("List with null values: " + l);
        Predicate<String> isNull = item -> Objects.nonNull(item);
 
       
        l = removeNullUsingIterator(l, isNull);
        System.out.println("List with null values removed: " + l);
    }
}
