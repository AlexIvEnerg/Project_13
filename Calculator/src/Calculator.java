public class Calculator {

    public static <T extends Number,V extends Number> double sum(T m, V n) {
        double obj1 ; double obj2;
        obj1 = m.doubleValue();
        obj2 = n.doubleValue();
        return obj1 + obj2;
    }

    public static <T extends Number,V extends Number> double multiply(T m, V n) {
        double obj1; double obj2;
        obj1 = m.doubleValue();
        obj2 = n.doubleValue();
        return obj1 * obj2;
    }

    public static <T extends Number,V extends Number> double divide(T m, V n) {
        double obj1; double obj2;
        obj1 = m.doubleValue();
        obj2 = n.doubleValue();
        return obj1 / obj2;
    }

    public static <T extends Number,V extends Number> double subtraction(T m, V n) {
        double obj1; double obj2;
        obj1 = m.doubleValue();
        obj2 = n.doubleValue();
        return obj1 - obj2;
    }
}
