/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;
import java.beans.*;
import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author luisa
 */
public class TemporalGreeting implements Serializable{
    private int period;
    private String greeting;
    
    public TemporalGreeting() {
    }
        
    
    public String getGreeting() {
        return greeting;
    }
    
    public void setGreeting(String value) {
        Calendar c1 = Calendar.getInstance();
        int hour = c1.get(Calendar.HOUR_OF_DAY);

        if(hour > 6 && hour < 12){
            period = 1;
        }else if(hour > 12 && hour < 18){
            period = 2;
        }else{
            period = 3;
        }
	
        switch (value){
            case "":
            case "pt":
                if(period==1)
                    greeting = "Bom dia!";
		else if(period==2)
                    greeting = "Boa tarde!";
		else
                    greeting = "Boa noite!";
                break;
            case "en":
                if(period==1)
                    greeting = "Good morning!";
		else if(period==2)
                    greeting = "Good afternoon!";
		else
                    greeting = "Good night!";
                break;
            case "de":
                if(period==1)
                    greeting = "Guten Morgen!";
		else if(period==2)
                    greeting = "Guten Abend!";
		else
                    greeting = "Gute Nacht!";
                break;
            case "fr":
                if(period==1)
                    greeting = "Bonjour!";
		else if(period==2)
                    greeting = "Bonne soirée!";
		else
                    greeting = "Bonsoir!";
                break;
            case "es":
                if(period==1)
                    greeting = "¡Buen día!";
		else if(period==2)
                    greeting = "¡Buenas tardes!";
		else
                    greeting = "¡Buenas noches!";
                break;
            case "it":
                if(period==1)
                    greeting = "Buongiorno!";
		else if(period==2)
                    greeting = "Buona serata!";
		else
                    greeting = "Buona Notte!";
                break;
        }
    }
    
    
}
