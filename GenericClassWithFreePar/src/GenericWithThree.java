import java.io.Serializable;

//  extends Animal & Serializable

public class GenericWithThree<T extends Comparable<T>, V extends Animal & Serializable, K extends Number> {
    private T escT;
    private V escV;
    private K escK;

    public GenericWithThree (T escT, V escV, K escK) {
        this.escT = escT;
        this.escV = escV;
        this.escK = escK;
    }


    public T getEscT() {
        return escT;
    }
    public V getEscV() {
        return escV;
    }
    public K getEscK() {
        return escK;
    }

}


