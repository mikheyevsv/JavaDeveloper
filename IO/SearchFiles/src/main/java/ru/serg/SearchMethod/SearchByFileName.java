package ru.serg.SearchMethod;

import java.io.*;

/**
 * @author Sergey Miheev
 * @version 1.0
 */
public class SearchByFileName  {

    private String fileName;
    private String directory;
    private String result;

    public void find(String[] values) {
        this.directory = values[1];
        this.fileName = values[3];
        this.result = values[6];
        search(directory, fileName);
    }

    private void search(String fileName, String directory){
        File[] files = new File(directory).listFiles();
        for (File file : files) {
            if (file.isDirectory()){
                search(file.getAbsolutePath(),fileName);
            }else if (chek(file, fileName)){
                save(String.format("%s found %s", this.fileName,file.getAbsoluteFile()), this.result);
            }else {
                save(String.format("%s not found %s", this.fileName, file.getAbsolutePath()), this.result);
            }
        }
    }

    private void save(String result, String goal){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(new File(goal),true))) {
            writer.write(result);
            writer.newLine();
            writer.flush();
            writer.close();
        } catch(IOException io) {
            io.printStackTrace();
        }
    }

    /**
     *
     * @param file width check
     * @param param check file name
     * @return
     *
     */


    public boolean chek(File file, String param) {

        return file.getName().equals(param);
    }
}
