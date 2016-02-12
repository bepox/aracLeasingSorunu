/**
 * Created by eraykuyumcu on 11/02/16.
 */
public class Pwr {
    double b;
    int e;
    double val;
    // can be a good idea to use temp inside function
    Pwr(double tempb, int tempe){
        this.b = tempb;
        this.e = tempe;

        val = 1;
        if (e==0) return;
        for ( ; e>0; e--) val = val * b;
    }
    double get_pwr(){
        return val;
    }
}
