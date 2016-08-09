package ru.serg;


import ru.serg.SearchMethod.SearchByFileName;
import ru.serg.SearchMethod.SearchByMask;
import ru.serg.SearchMethod.SearchByRegularExpression;

/**
 * @author Sergey Miheev
 * @version 1.0
 */
public class SearchFiles {

    public static void main(String[] args) {
       SearchFiles searchFiles = new SearchFiles();
        searchFiles.startSearch(args);

    }
    public void startSearch(String [] args){
        Validator validator = new Validator();
        if(validator.valid(args)) {
            String param = args[2];
            if(param.equals("-m")) {
                SearchByMask mask = new SearchByMask();
                mask.find(args);
            } else if(param.equals("-f")) {
                SearchByFileName name = new SearchByFileName();
                name.find(args);
            } else if(param.equals("-r")) {
                SearchByRegularExpression regular = new SearchByRegularExpression();
                regular.find(args);
            }
        }
    }

}
