/**
 * Created by kuyum on 10-Feb-16.
 */
public class vehicle {
    double fuelConsuptionPerHunderdKilometers;

    /*
        Parameterized Constructor.
        Now when we create a new vehicle we can determined it direcly inside the object.

        Ex: vehicle bmwOne = new vehicle(5.6);
        vehicle toyotaPrius = new vehicle(3.8);
    */
    vehicle (double i) {
        fuelConsuptionPerHunderdKilometers = i;
    }

    //convert the value of X Lt/100km to X Lt/1km
    double fuelConsuptionPerOneKilometers() {
        return (fuelConsuptionPerHunderdKilometers / 100);
    }

    //Compute how much fuel consuption at giving month kilometer
    // Verilen aylik km cinsinden kullanimin arac icin kac litre benzine esit

    double fuelConsumptionPerMonth (int kilometers) {
        return (double) kilometers * fuelConsuptionPerOneKilometers();
    }

}
