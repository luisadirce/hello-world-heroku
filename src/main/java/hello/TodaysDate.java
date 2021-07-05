/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;
import java.beans.*;
import java.io.Serializable;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;
import java.util.Date;  
import java.util.Calendar; 

/**
 *
 * @author luisa
 */
public class TodaysDate implements Serializable {
    private String date;
    
    public TodaysDate() {
    }
    
    public String getDate() {
        return date;
    }
    
    public void setDate(String value) {
        Date currentDate = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        String strDate = dateFormat.format(currentDate);  
        
        String dateText;
        
        switch (value){
            case "":
            case "pt":
                dateText = "Dia e data atual: ";
                date = dateText+strDate;
                break;
            case "en":
                dateText = "Current day and date: ";
                date = dateText+strDate;
                break;
            case "de":
                dateText = "Aktueller Tag und Datum: ";
                date = dateText+strDate;
                break;
            case "fr":
                dateText = "Jour et date du jour: ";
                date = dateText+strDate;
                break;
            case "es":
                dateText = "Día y fecha actual: ";
                date = dateText+strDate;
                break;
            case "it":
                dateText = "Giorno e data attuali: ";
                date = dateText+strDate;
                break;
        }
    }

}
