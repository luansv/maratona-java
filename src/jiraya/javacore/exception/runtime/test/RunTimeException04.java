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
            System.out.println("Dentro de..");

        } catch (RuntimeException e){
            System.out.println("Dentro de..");
        }


        try{
            talvezLanceExeption();
        } catch (SQLException e) {

        } catch (IOException e) {

        }
    }

    private static void talvezLanceExeption() throws SQLException, FileNotFoundException{

    }
}
