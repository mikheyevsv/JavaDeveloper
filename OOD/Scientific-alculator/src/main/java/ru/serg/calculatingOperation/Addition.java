package ru.serg.calculatingOperation;

import ru.serg.maket.Computing;

/**@author Serg
 *Class implements the addition of data
 */
public class Addition implements Computing {

    /**
     * @param valueOne
     * @param valueTwo
     * @return
     * @see interface Computing.
     */
    @Override
    public double operation(double valueOne, double valueTwo) {
        return valueOne + valueTwo;
    }
}
