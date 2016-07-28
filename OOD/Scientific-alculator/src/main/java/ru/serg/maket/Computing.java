package ru.serg.maket;



/**@author Serg
 * This interfase creating a Computing.
 */
@FunctionalInterface
public interface Computing {

    /**
     * Base realisation Computing.
     * @param valueOne
     * @param valueTwo
     * @return
     */

  double  operation ( double valueOne, double valueTwo);

}
