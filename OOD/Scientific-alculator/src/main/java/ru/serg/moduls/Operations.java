package ru.serg.moduls;

import ru.serg.calculatingOperation.*;
import ru.serg.maket.Computing;

import java.util.HashMap;

/**@author Serg
 * Calculate Factiry
 */
public class Operations {

    private double resultat;

    /**
     * Variable initialization operator.
     */

    private HashMap<String, Computing> operator = initialise();

    /**
     * Operation adds to the calculator.
     * @return
     */

    private HashMap<String, Computing> initialise(){
        HashMap<String, Computing> operator = new HashMap<String, Computing>();
        operator.put("+", new Addition());
        operator.put("-", new Subtraction());
        operator.put("*", new Multiplication());
        operator.put("/", new Division());
        operator.put("^", new DataLevel());
        return operator;
    }

    /**
     * Returns the operation key.
     * @param key
     * @return
     */

    public Computing getComputing (String key){
        return operator.get(key);
    }


    public double getResultat() {
        return resultat;
    }

    public void setResultat(double resultat) {
        this.resultat = resultat;
    }
}