/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sports;
import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author luisa
 */

public class SportsHistory implements Serializable {
     
    private String msg;
        
    public SportsHistory() {
    }
    
    public String getMsg() {
        return msg;
    }
    
    public void setMsg(String value) {
        switch (value){
            case "":
            case "fla":
                msg = "Flamengo: Supercopa do Brasil - 2021";
                break;
            case "flu":
                msg = "Fluminense: Taça Rio - 2020";
                break;
            case "vas":
                msg = "Vasco: Taça Rio - 2021";
                break;
            case "bot":
                msg = "Botafogo: Campeonato Carioca - 2018";
                break;
        }
    }
}
