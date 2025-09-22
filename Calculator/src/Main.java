//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // System.out.printf("Hello and welcome!");
        double arg1 = 7.0; double arg2 = 5.0; double arg3 = 10.0;
        System.out.println("Argument1 ="+arg1+", Argument2 ="+arg2+", Argument3 ="+arg3);
        System.out.println("Summing of Calc = "+Calculator.sum(arg1, arg2));
        System.out.println("Multiplying of Calc = " + Calculator.multiply(arg1, arg2));
        System.out.println("Dividing of Calc = "+ Calculator.divide(arg3, arg2));
        System.out.println("Subtracting of Calc = "+ Calculator.subtraction(arg3, arg1));
    }
}