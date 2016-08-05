package ru.serg.SearchMethod;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

/**
 * @author Sergey Miheev
 * @version 1.0
 */
public class SearchByMask implements Check {

    /**
     *
     * @param file width check
     * @param param check file mask
     * @return
     * @see Check
     */

    @Override
    public boolean chek(File file, String param) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(String.format("Global %s", param));
        return matcher.matches(Paths.get(file.getName()));
    }
}
