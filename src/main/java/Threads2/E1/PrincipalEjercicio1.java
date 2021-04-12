package Threads2.E1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PrincipalEjercicio1 {
    public static void main(String[] args) {
        try {

            long tiempoInicio = System.currentTimeMillis();

            //ejecucion 1
            ExecutorService exec = Executors.newSingleThreadExecutor();
            /**
             * ¿Cuántos hilos se han creado? ¿Por qué?
             *
             * ¿Se han ejecutado las tareas de forma paralela? ¿Por qué?
             *
             * ¿Cuántos milisegundos ha tardado la tarea? (ejecutala varias veces y haz la media)
             *
             * ¿Podrías explicar de forma esquemática el bloque que te indico a continuación? Tendrá
             * repercusión en el tiempo que tarda en ejecutarse la aplicación.
             *
             */

            //ejecucion 2
            //ExecutorService exec = Executors.newFixedThreadPool(5);
            /**
             * ¿Cuántos hilos se han creado? ¿Por qué?
             *
             * ¿Se han ejecutado las tareas de forma paralela? ¿Por qué?
             *
             * ¿Cuántos milisegundos ha tardado la tarea? (ejecutala varias veces y haz la media)
             *
             * ¿Podrías explicar de forma esquemática el bloque que te indico a continuación? Tendrá
             * repercusión en el tiempo que tarda en ejecutarse la aplicación.
             *
             */

            //ejecucion 3
            //ExecutorService exec = Executors.newCachedThreadPool();
            /**
             * ¿Cuántos hilos se han creado? ¿Por qué?
             *
             * ¿Se han ejecutado las tareas de forma paralela? ¿Por qué?
             *
             * ¿Cuántos milisegundos ha tardado la tarea? (ejecutala varias veces y haz la media)
             *
             * ¿Podrías explicar de forma esquemática el bloque que te indico a continuación? Tendrá
             * repercusión en el tiempo que tarda en ejecutarse la aplicación.
             *
             */

            NumeroPalabrasFichero tarea1 = new NumeroPalabrasFichero("fichero1.txt");
            NumeroPalabrasFichero tarea2 = new NumeroPalabrasFichero("fichero2.txt");
            NumeroPalabrasFichero tarea3 = new NumeroPalabrasFichero("fichero3.txt");
            NumeroPalabrasFichero tarea4 = new NumeroPalabrasFichero("fichero4.txt");
            NumeroPalabrasFichero tarea5 = new NumeroPalabrasFichero("fichero5.txt");

            Future<Integer> resultadoTarea1 = exec.submit(tarea1);
            Future<Integer> resultadoTarea2 = exec.submit(tarea2);
            Future<Integer> resultadoTarea3 = exec.submit(tarea3);
            Future<Integer> resultadoTarea4 = exec.submit(tarea4);
            Future<Integer> resultadoTarea5 = exec.submit(tarea5);

            Integer intTarea1 = resultadoTarea1.get();
            Integer intTarea2 = resultadoTarea2.get();
            Integer intTarea3 = resultadoTarea3.get();
            Integer intTarea4 = resultadoTarea4.get();
            Integer intTarea5 = resultadoTarea5.get();

            System.out.println("fichero 1: " + intTarea1);
            System.out.println("fichero 2: " + intTarea2);
            System.out.println("fichero 3: " + intTarea3);
            System.out.println("fichero 4: " + intTarea4);
            System.out.println("fichero 5: " + intTarea5);
            exec.shutdown();

            long tiempoFin = System.currentTimeMillis();

            System.out.println("");
            System.out.println("Tiempo: " + (tiempoFin-tiempoInicio));

        } catch (InterruptedException | ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
