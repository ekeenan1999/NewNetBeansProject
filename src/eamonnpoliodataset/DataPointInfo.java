package eamonnpoliodataset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author csstudent
 */
public class DataPointInfo {
    private String PUBLISHSTATE;
    private String COUNTRY;
    private String GHO;
    private String WORLDBANKINCOMEGROUP;
    private String REGION;
    private String YEAR;
    
    @Override
    public String toString() {
        return COUNTRY;
    }
    
    public String getCountry() {
        return this.COUNTRY;
    }
    
}
