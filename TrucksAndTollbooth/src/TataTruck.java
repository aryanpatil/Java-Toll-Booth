/*
 *
 *          ARYAN J. PATIL
 *          BT18CSE096
 *
 *	this file has Driver code for demonstration
 *
 */

import java.util.*;

public class TataTruck implements Truck{
    private int axles;
    private int weight;
    private final Barcode barcode;

    // Constructor
    TataTruck(Barcode barcode, int axles, int weight){
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
        System.out.println("Axels: " + this.getAxles());

    }
}
