package ru.serg.calculatingOperation;

import ru.serg.maket.Computing;

/**@author Serg
 * Class implements the multiplication data.
 */
public class Multiplication implements Computing {

    /**
     * @see interface Computing.
     * @param valueOne
     * @param valueTwo
     * @return
     */

    @Override
    public double operation(double valueOne, double valueTwo) {
        return valueOne * valueTwo;
    }
}
