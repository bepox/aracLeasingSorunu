/**
 * Created by eraykuyumcu on 11/02/16.
 */
public class Pwr {
    double b;
    int e;
    double val;

    Pwr(double b, int e){
        this.b = b;
        this.e = e;

        val = 1;
        if (e==0) return;
        for ( ; e>0; e--) val = val * b;
    }
    double get_pwr(){
        return val;
    }
}
