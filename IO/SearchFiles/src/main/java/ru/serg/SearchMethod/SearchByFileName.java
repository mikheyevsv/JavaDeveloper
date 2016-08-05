package ru.serg.SearchMethod;

import java.io.File;

/**
 * @author Sergey Miheev
 * @version 1.0
 */
public class SearchByFileName implements Check {


    /**
     *
     * @param file width check
     * @param param check file name
     * @return
     * @see Check
     */

    @Override
    public boolean chek(File file, String param) {
        return false;
    }
}
