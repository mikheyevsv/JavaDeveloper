package ru.serg.calculatingOperation;


import ru.serg.maket.Computing;

/**@author Serg
 * Class implements the division data.
 */
public class Division implements Computing {

    /**
     * @param valueOne
     * @param valueTwo
     * @return
     * @see interface Computing.
     */

    @Override
    public double operation(double valueOne, double valueTwo) {

        try {
            if (valueTwo != 0) {
                return valueOne / valueTwo;
            } else {
                throw new ArithmeticException("");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.err.println("You can not divide by 0");
        }
        return 0;
    }
}





