/**
 * Created by eraykuyumcu on 11/02/16.
 */
public class DemoPwr {
    public static void main (String args[]){
        Pwr x = new Pwr(4.0, 3);
        Pwr y = new Pwr(2.5, 2);
        Pwr z = new Pwr(5.7, 1);

        System.out.println(x.b + " raised to the " + x.e + " power is " + x.get_pwr());
        System.out.println(y.b + " raised to the " + y.e + " power is " + y.get_pwr());
        System.out.println(z.b + " raised to the " + z.e + " power is " + z.get_pwr());
    }
}
