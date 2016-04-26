/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eamonnpoliodataset;

import eamonnpoliodataset.Legend;
import eamonnpoliodataset.DataPoint;

/**
 *
 * @author csstudent
 */
public class PolioDataSet {
    private Legend[] dimension;
    private DataPoint[] fact;
    
    @Override
    public String toString() {
        String output = null;
        System.out.println("Polio Immunizations in 1980");
        for(int i = 0; i < fact.length; i++) {
            System.out.println(fact[i].toString());
            output = "" + fact[i].getValue();
        }
        return output;
    }
    
    public DataPoint[] getFact() {
        return fact;
    }
}
