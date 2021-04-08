/*
 *
 *              ARYAN J. PATIL
 *              BT18CSE096
 *
 *	this file has class Barcode which is used by the truck (axel count)
 *
 */

import java.util.*;

public class MercedesBenzTruck implements Truck{

    private int axles;
    private int weight;
    private final Barcode barcode;

    // Constructor
    MercedesBenzTruck(Barcode barcode, int axles, int weight){
        this.barcode = barcode;
        this.axles = axles;
        this.weight = weight;
    }

    // Getters
    public int getWeight(){
        return this.weight;
    }

    public int getAxles(){
        return this.axles;
    }

    public Barcode getBarcode()									//getter setters
    {
        return this.barcode;
    }

    public void showDetails() {
        System.out.println("******Tata Truck Details*******");
        System.out.println("Weight: "+ this.getWeight());
        System.out.println("Axels: " + this.barcode.getNumAxel());

    }
}
