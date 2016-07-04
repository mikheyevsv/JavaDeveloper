package ru.serg.calculatingOperation;

import ru.serg.maket.Computing;

/**@author Serg
 * Class implements the data level.
 */
public class DataLevel implements Computing {

    /**
     * @see interface Computing.
     * @param valueOne
     * @param valueTwo
     * @return
     * @throws Exception
     */

    @Override
    public double operation(double valueOne, double valueTwo) {
        return Math.pow(valueOne, valueTwo);
    }
}
