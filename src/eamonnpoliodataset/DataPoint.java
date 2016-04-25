/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eamonnpoliodataset;

import eamonn.s.dataset.DataPointInfo;

/**
 *
 * @author csstudent
 */
public class DataPoint {
    private DataPointInfo dim;
    private String Value;
    public String getValue() {
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
