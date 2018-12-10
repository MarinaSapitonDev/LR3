import java.util.AbstractList;


public class Collection<T> extends AbstractList<T> {
    private final T[] a;

    Collection(T[] array) {
        a = array;
    }

    public T get(int index) {
        return a[index];
    }

    public T set(int index, T element) {
        T oldValue = a[index];
        a[index] = element;
        return oldValue;
    }

    public int size() {
        return a.length;
    }

   public int sortPrice(){
       int maxPrice=0; //implement!!!!!!!!!!!
        return maxPrice;
    }

   public  int sortAge(){
       int maxAge=0; //implement!!!!!!!!!!!
       return maxAge;
   }



}
