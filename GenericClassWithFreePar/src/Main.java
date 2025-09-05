
// import java.io.Serializable;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Integer numb = 100;
        // Realiser real = new Realiser(animal);
        GenericWithThree<Integer, ?, Double> esc = new GenericWithThree<>(numb,animal,10.00);
        GenericWithThree<Integer, ?, Float> esc2 = new GenericWithThree<>(10, animal, 50F);
        //System.out.println(esc.real);
        System.out.println("In class T esc is "+esc.getEscT()+" ,in V esc is "+esc.getEscV()+" ,in K esc is "+esc.getEscK());
        System.out.println("In class T esc2 is "+esc2.getEscT()+" ,in V esc2 is "+esc2.getEscV()+" ,in K esc2 is "+esc2.getEscK());
       /* for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i); */
        }
    }
