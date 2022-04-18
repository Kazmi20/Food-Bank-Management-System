package edu.ucalgary.ensf409;
/**
 * @author Alex Burn
 * @version 1.0
 */

public class InvalidInventoryException extends Exception {
    public InvalidInventoryException(){
        super("The inventory is currently empty.");
    }
}
