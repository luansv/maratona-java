package jiraya.javacore.io;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {

        //to create directory
        File fileDiretorio = new File("folder");
        boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println(isDiretorioCriado);

        //create a file inside directory
        File fileArquivoDiretorio = new File(fileDiretorio,"file.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isFileCreated);

        //rename a file
        File fileRenamed = new File(fileDiretorio, "file_renamed.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);

        //rename directory
        File directoryRenamed = new File("renamed_directory");
        boolean isDirectoryRenamed = fileDiretorio.renameTo(directoryRenamed);
        System.out.println(isDirectoryRenamed);


    }
}
