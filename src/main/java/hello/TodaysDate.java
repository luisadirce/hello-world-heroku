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
                dateText = "Data e horário atual: ";
                date = dateText+strDate;
                break;
            case "en":
                dateText = "Current date and time: ";
                date = dateText+strDate;
                break;
            case "de":
                dateText = "Aktuelles Datum und Uhrzeit: ";
                date = dateText+strDate;
                break;
            case "fr":
                dateText = "Date et heure actuelles: ";
                date = dateText+strDate;
                break;
            case "es":
                dateText = "Fecha y hora actual: ";
                date = dateText+strDate;
                break;
            case "it":
                dateText = "Data e ora correnti: ";
                date = dateText+strDate;
                break;
        }
    }

}
