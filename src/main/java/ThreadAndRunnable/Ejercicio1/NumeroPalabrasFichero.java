package ThreadAndRunnable.Ejercicio1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class NumeroPalabrasFichero extends Thread {
    File fichero;

    public NumeroPalabrasFichero(String fichero) {
        this.fichero = new File(fichero);
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.fichero));
            ArrayList<String> vocablos = new ArrayList<>();
            String line;

            while((line = br.readLine()) != null) { // nigromancia de Strings versión regex, he subido el nivel.
                vocablos.addAll(Arrays.asList(line.split("\\s")));
            }

            vocablos.removeIf(sus->sus.equals(""));
            System.out.println(Thread.currentThread().getName() + ": " + vocablos.size());

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    P4.1: 3 threads are created (Thread-0, Thread-1 & Thread-2 by default names, if they are not modified).
    P4.2: Threads are created in order: 0, 1 & 2; but nothing ensures your that the finish order will be
          that exact same. It may vary every execution.
    P4.3: No, it's not. As proof, the result order in terminal from 5 executions:
        > T2, T1, T0
        > T1, T2, T0
        > T2, T0, T1
        > T0, T2, T1
        > T0, T2, T1
     */
}
