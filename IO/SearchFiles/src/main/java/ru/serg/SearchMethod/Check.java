package ru.serg.SearchMethod;

import java.io.File;

/**
 * The check interface.
 * @author Sergey Miheev
 * @version 1.0
 */
public interface Check {

    /**
     * The method checks
     * @param file width check
     * @param param check
     * @return true if file name equals param else false/
     */

    boolean chek(File file, String param);
}
