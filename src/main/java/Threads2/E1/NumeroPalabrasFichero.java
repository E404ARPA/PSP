package Threads2.E1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class NumeroPalabrasFichero implements Callable<Integer> {
    File fichero;

    public NumeroPalabrasFichero(String fichero) {
        this.fichero = new File(fichero);
    }

    @Override
    public Integer call() throws Exception {
        Integer sum = 0;

        FileInputStream fis = new FileInputStream(fichero);
        FileOutputStream fos = new FileOutputStream(fichero);

        BufferedReader br = new BufferedReader(new FileReader(this.fichero));
        String line;

        while((line = br.readLine()) != null) {

        }

        return null;
    }
}
