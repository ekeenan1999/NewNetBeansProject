/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eamonnpoliodataset;



/**
 *
 * @author csstudent
 */
public class DataPoint {
    private DataPointInfo dim;
    private int Value;
    public int getValue() {
        return this.Value;
    }
    
    public String country() {
        return dim.getCountry();
    }
   
    @Override
    public String toString() {
        return dim.getCountry() + ": " + this.getValue() + "% immunized";
    }
}
