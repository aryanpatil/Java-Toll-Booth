/*
 *
 *              ARYAN J. PATIL
 *              BT18CSE096
 *
 *	this file has class Barcode which is used by the truck (axel count)
 *
 */

import java.io.*;
import java.util.ArrayList;

public interface Tollbooth {

    public Receipt generateReceipt(Truck truck);			//calculate toll and make receipt
    public void collectReceipts();							//collet receipt
    public void resetBooth();								//reset booth
    public void updateBoothStats(int amount);				//update booth
    public void showBoothStats();							//show booth values
    public ArrayList<Receipt> showBoothEntries(String d1, String d2);	//query booth file on date ranges
    public void writeBufferEntries();                       //makes entries to file ater 10 mins elapsed

}
