/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eamonnpoliodataset;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.net.*;
import java.util.*;
import com.google.gson.*;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;

/**
 *
 * @author csstudent
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private BarChart barChart;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
   public void initialize(URL urlP, ResourceBundle rb) {
        String s = "http://apps.who.int/gho/athena/data/GHO/WHS4_544.json?profile=simple&filter=YEAR:1980";
        URL url = null;
        try {
            url = new URL(s);
        } catch (Exception e) {
            System.out.println("Improper URL " + s);
            System.exit(-1);
        }
     
        // read from the URL
        Scanner scan = null;
        try {
            scan = new Scanner(url.openStream());
        } catch (Exception e) {
            System.out.println("Could not connect to " + s);
            System.exit(-1);
        }
        
        String str = new String();
        while (scan.hasNext()) {
            str += scan.nextLine() + "\n";
        }
        scan.close();

                
        Gson gson = new Gson();
        PolioDataSet ds = gson.fromJson(str, PolioDataSet.class);

        System.out.println(ds.toString());
        
         XYChart.Series<String, Number> countriesImmunized = new XYChart.Series();
         countriesImmunized.setName("% Countries Immunized");
         
        for (DataPoint datapt : ds.getFact()) {
            String percent = datapt.getValue();
            String country = datapt.country();
            countriesImmunized.getData().add(new XYChart.Data(country, percent));
        }
        
        barChart.getData().add(countriesImmunized);
        
    }    
    
}
