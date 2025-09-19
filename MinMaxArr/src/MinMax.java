import java.util.Comparator;

public class MinMax<T extends Comparable<T>>  {
    private T[] array;
    public  MinMax (T[] arr) {
        this.array = arr;
    }
    public T MinEl(T[] array){
        T a = array[0];
        for (int i=0;i<array.length-1;i++) {
            // a = array[i];
            if (a.compareTo(array[i+1]) > 0) {
                a = array[i+1];  // a > (array[i+1])
            }
        }
        return a;
    }
    public T MaxEl(T[] array){
        T a = null;
        for (int i=0;i<array.length-1;i++) {
            a = array[i];
            if (a.compareTo(array[i+1]) < 0) {
                a = array[i+1];
            }
        }
        return a;
    }
}
