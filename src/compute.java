/**
 * Created by kuyum on 10-Feb-16.
 */
public class compute {
    public static void  main (String args[]){

        //
        double consumption1, consumption2;
        double diesel = 0.969;
        double benzin = 1.219;

        //Create a new vehicle
        vehicle bmwOne = new vehicle();
        vehicle toyotaPrius = new vehicle();


        //give values per car
        bmwOne.fuelConsuptionPerHunderdKilometers = 5.6;
        toyotaPrius.fuelConsuptionPerHunderdKilometers = 3.8;


        // monthly giving kilometers convert to how much fuel gone
        consumption1 = bmwOne.fuelConsumptionPerMonth(1220);
        consumption2 = toyotaPrius.fuelConsumptionPerMonth(1220);

        //
        System.out.println(consumption1);
        System.out.println(consumption2);

        //
        System.out.println("BMW One = " + consumption1 * diesel + " euro per month");
        System.out.println("Toyota Prius = " + consumption2 * benzin + " euro per month");
    }
}
