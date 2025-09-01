public class GenericClass<T,V> {
    private T[] obT;
    private V[] obV;

    public GenericClass (T[] obT, V[] obV) {
        this.obT = obT;
        this.obV = obV;
    }

    public T[] getObT() {
        return obT;
    }
    public V[] getObV() {
        return obV;
    }
}
