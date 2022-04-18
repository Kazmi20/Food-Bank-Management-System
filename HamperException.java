package edu.ucalgary.ensf409;
/**
 * @author Alex Burn
 * @version 1.0
 */

public class HamperException extends Exception {
    public HamperException(){
        super("Requested hamper cannot be created with the current inventory items.");
    }
}
