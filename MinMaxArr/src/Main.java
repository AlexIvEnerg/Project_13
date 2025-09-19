import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // System.out.printf("Hello and welcome!");
        Double[] arr = new Double[]{1.2,2.4,3.6,4.7,5.8,6.0};
        MinMax<Double> minMax = new MinMax<>(arr);
        System.out.println("Arr = " + Arrays.toString(arr));
        System.out.println('\n');
        Double min = minMax.MinEl(arr);
        Double max = minMax.MaxEl(arr);
        System.out.println("MinElem = "+min + " ,MaxElem = "+max);
        /*for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);*/
        }
    }