/*
 *
 *              ARYAN J. PATIL
 *              BT18CSE096
 *
 *	this file has class Barcode which is used by the truck (axel count)
 *
 */

import java.io.*;

public interface Truck {

    // Getters
    public Barcode getBarcode(); //provide barcode to booth for scanning
    int getWeight();
    int getAxles();
    public void showDetails();  // Show details of the truck
}
