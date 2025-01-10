package jiraya.javacore.exception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RunTimeException04 {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException();
            //colocar sempre as mais expecificas primeiro pq as mais genéricas já são conjuntos de expecificas

        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro de ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");

        } catch (RuntimeException e){
            System.out.println("Dentro de RuntimeException");
        }

        try{
            talvezLanceExeption();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceExeption() throws SQLException, FileNotFoundException{

    }
}
