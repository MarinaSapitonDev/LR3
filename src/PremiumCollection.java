public class PremiumCollection extends Collection<Premium> {

    private  Premium[] a;

    public PremiumCollection(Premium[] array) {
        super(array);
    }



    public Premium get(int index) {
        return a[index];
    }

    public Premium set(int index, Premium element) {
        Premium oldValue = a[index];
        a[index] = element;
        return oldValue;
    }

    public void saveCollectionToFile(PremiumCollection collection){
        //implement!!!!!!!!!!!
    }

    public PremiumCollection loadCollectionFromFile(){
        PremiumCollection collection=null;
        return collection;       //implement!!!!!!!!!!!
    }
}
